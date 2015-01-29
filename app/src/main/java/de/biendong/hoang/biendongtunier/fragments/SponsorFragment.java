package de.biendong.hoang.biendongtunier.fragments;



import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import de.biendong.hoang.biendongtunier.BienDongTunierApplication;
import de.biendong.hoang.biendongtunier.MyActivity;
import de.biendong.hoang.biendongtunier.R;
import de.biendong.hoang.biendongtunier.adapters.SponsorListAdapter;
import de.biendong.hoang.biendongtunier.models.SponsorModel;
import de.biendong.hoang.biendongtunier.models.TeamModel;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class SponsorFragment extends Fragment {


    GridView sponsorGridView;
    private BienDongTunierApplication singleton = BienDongTunierApplication.getInstance();
    SponsorListAdapter adapter;

    public SponsorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sponsor, container, false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        sponsorGridView =  (GridView) getActivity().findViewById(R.id.sponsorGridView);
        adapter = (new SponsorListAdapter(getActivity(),
                R.layout.listitem_sponsors, singleton.sponsorsList));
        sponsorGridView.setAdapter(adapter);
        new TestAsyncTask().execute();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MyActivity) activity).onSectionAttached(5);
    }

    class TestAsyncTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            getActivity().runOnUiThread(new Runnable() {
//                @Override
//                public void run() {
//                    adapter.add(new SponsorModel("AAA", "https://content.oneplus.net/skin/frontend/oneplus2014/default/images/product-pages/one/localization/de/composition-main.jpg"));
////                    adapter.notifyDataSetChanged();
//                }
//            });
            return null;
        }
        @Override
        protected void onPostExecute(Void result){
            adapter.add(new SponsorModel("AAA", "https://content.oneplus.net/skin/frontend/oneplus2014/default/images/product-pages/one/localization/de/composition-main.jpg"));
        }
    }

}
