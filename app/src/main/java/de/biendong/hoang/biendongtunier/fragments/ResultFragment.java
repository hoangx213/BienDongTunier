package de.biendong.hoang.biendongtunier.fragments;


import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.*;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

import de.biendong.hoang.biendongtunier.BienDongTunierApplication;
import de.biendong.hoang.biendongtunier.MyActivity;
import de.biendong.hoang.biendongtunier.R;
import de.biendong.hoang.biendongtunier.models.ResultModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResultFragment extends Fragment {


    BienDongTunierApplication singleton = BienDongTunierApplication.getInstance();
    LinearLayout finalResult, thirdPlaceResult, semiFinalResult, quarterFinalResult,
            groupAResult, groupBResult, groupCResult, groupDResult;


    public ResultFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_result, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initUI();
//        new MyAsyncTask().execute();
//        mThread.run();
        Thread thread = new Thread(mThread);
        thread.setPriority(android.os.Process.THREAD_PRIORITY_BACKGROUND);
        thread.run();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MyActivity) activity).onSectionAttached(4);
    }

    private void initUI() {
        finalResult = (LinearLayout) getActivity().findViewById(R.id.finalResult);
        thirdPlaceResult = (LinearLayout) getActivity().findViewById(R.id.thirdPlaceResult);
        semiFinalResult = (LinearLayout) getActivity().findViewById(R.id.semiFinalResult);
        quarterFinalResult = (LinearLayout) getActivity().findViewById(R.id.quarterFinalResult);
        groupAResult = (LinearLayout) getActivity().findViewById(R.id.groupAResult);
        groupBResult = (LinearLayout) getActivity().findViewById(R.id.groupBResult);
        groupCResult = (LinearLayout) getActivity().findViewById(R.id.groupCResult);
        groupDResult = (LinearLayout) getActivity().findViewById(R.id.groupDResult);
    }

    private Runnable mThread = new Runnable() {
        @Override
        public void run() {
            setResults();
        }
    };

    private class ViewHolder {
        TextView teamAName, teamAGoal, teamBName, teamBGoal;

        ViewHolder(View base) {
            this.teamAName = (TextView) base.findViewById(R.id.resultTeamANameTextView);
            this.teamAGoal = (TextView) base.findViewById(R.id.resultTeamAGoalTextView);
            this.teamBName = (TextView) base.findViewById(R.id.resultTeamBNameTextView);
            this.teamBGoal = (TextView) base.findViewById(R.id.resultTeamBGoalTextView);
        }
    }

    class MyAsyncTask extends AsyncTask<Void, Void, Void>{

        @Override
        protected Void doInBackground(Void... params) {
            setResults();
            return null;
        }
    }

    private void setResults() {
        Map<String, List<ResultModel>> resultsMap = singleton.resultsMap;
        ViewHolder holder;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LinearLayout parentView = null;
        for(String key : BienDongTunierApplication.KEY_RESULT_LIST){
            if (resultsMap.containsKey(key)) {
                if(key.equals(BienDongTunierApplication.GROUP_A_KEY))
                    parentView = groupAResult;
                else if(key.equals(BienDongTunierApplication.GROUP_B_KEY))
                    parentView = groupBResult;
                else if(key.equals(BienDongTunierApplication.GROUP_C_KEY))
                    parentView = groupCResult;
                else if(key.equals(BienDongTunierApplication.GROUP_D_KEY))
                    parentView = groupDResult;
                else if(key.equals(BienDongTunierApplication.QUARTER_FINAL_KEY))
                    parentView = quarterFinalResult;
                else if(key.equals(BienDongTunierApplication.SEMI_FINAL_KEY))
                    parentView = semiFinalResult;
                else if(key.equals(BienDongTunierApplication.THIRD_PLACE_KEY))
                    parentView = thirdPlaceResult;
                else if(key.equals(BienDongTunierApplication.FINAL_KEY))
                    parentView = finalResult;

                if(parentView != null) {
                    final LinearLayout finalParentView = parentView;
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            finalParentView.removeAllViews();
                        }
                    });

                    List<ResultModel> resultList = resultsMap.get(key);
                    for (ResultModel result : resultList) {
                        View resultLayout = null;
                        LayoutInflater inflater = (LayoutInflater) getActivity()
                                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                        resultLayout = inflater.inflate(R.layout.layout_result, null);
                        holder = new ViewHolder(resultLayout);
                        holder.teamAName.setText(result.getTeamAName());
                        holder.teamAGoal.setText(Integer.toString(result.getTeamAGoal()));
                        holder.teamBName.setText(result.getTeamBName());
                        holder.teamBGoal.setText(Integer.toString(result.getTeamBGoal()));
                        final LinearLayout finalParentView1 = parentView;
                        final View finalResultLayout = resultLayout;
                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                finalParentView1.addView(finalResultLayout);
                            }
                        });
                    }
                }
            }
        }
    }


}
