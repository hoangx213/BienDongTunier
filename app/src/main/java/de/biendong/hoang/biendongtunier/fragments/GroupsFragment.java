package de.biendong.hoang.biendongtunier.fragments;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import de.biendong.hoang.biendongtunier.BienDongTunierApplication;
import de.biendong.hoang.biendongtunier.MyActivity;
import de.biendong.hoang.biendongtunier.R;
import de.biendong.hoang.biendongtunier.TeamsActivity;
import de.biendong.hoang.biendongtunier.models.TeamModel;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class GroupsFragment extends Fragment implements View.OnClickListener{


    private static final int TEAM_NAME = R.id.resultTeamANameTextView;
    private static final int TEAM_URL = R.id.resultTeamAGoalTextView;
    Button groupA1Button, groupA2Button, groupA3Button, groupA4Button,
            groupB1Button, groupB2Button, groupB3Button, groupB4Button,
            groupC1Button, groupC2Button, groupC3Button, groupC4Button,
            groupD1Button, groupD2Button, groupD3Button, groupD4Button;
    List<Button> groupA;
    List<Button> groupB;
    List<Button> groupC;
    List<Button> groupD;

    BienDongTunierApplication singleton = BienDongTunierApplication.getInstance();

    public GroupsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_groups, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initUI();
        setGroups();
        setListener();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MyActivity) activity).onSectionAttached(3);
    }


    private void initUI(){
        groupA1Button = (Button) getActivity().findViewById(R.id.groupA1Button);
        groupA2Button = (Button) getActivity().findViewById(R.id.groupA2Button);
        groupA3Button = (Button) getActivity().findViewById(R.id.groupA3Button);
        groupA4Button = (Button) getActivity().findViewById(R.id.groupA4Button);
        groupB1Button = (Button) getActivity().findViewById(R.id.groupB1Button);
        groupB2Button = (Button) getActivity().findViewById(R.id.groupB2Button);
        groupB3Button = (Button) getActivity().findViewById(R.id.groupB3Button);
        groupB4Button = (Button) getActivity().findViewById(R.id.groupB4Button);
        groupC1Button = (Button) getActivity().findViewById(R.id.groupC1Button);
        groupC2Button = (Button) getActivity().findViewById(R.id.groupC2Button);
        groupC3Button = (Button) getActivity().findViewById(R.id.groupC3Button);
        groupC4Button = (Button) getActivity().findViewById(R.id.groupC4Button);
        groupD1Button = (Button) getActivity().findViewById(R.id.groupD1Button);
        groupD2Button = (Button) getActivity().findViewById(R.id.groupD2Button);
        groupD3Button = (Button) getActivity().findViewById(R.id.groupD3Button);
        groupD4Button = (Button) getActivity().findViewById(R.id.groupD4Button);

        groupA = new ArrayList<Button>(){{
            add(groupA1Button);
            add(groupA2Button);
            add(groupA3Button);
            add(groupA4Button);
        }};
        groupB = new ArrayList<Button>(){{
            add(groupB1Button);
            add(groupB2Button);
            add(groupB3Button);
            add(groupB4Button);
        }};
        groupC = new ArrayList<Button>(){{
            add(groupC1Button);
            add(groupC2Button);
            add(groupC3Button);
            add(groupC4Button);
        }};
        groupD = new ArrayList<Button>(){{
            add(groupD1Button);
            add(groupD2Button);
            add(groupD3Button);
            add(groupD4Button);
        }};

    }

    private void setGroups(){
        Map<String, List<TeamModel>> groupsMap = singleton.groupsMap;
        for (Map.Entry<String, List<TeamModel>> entry : groupsMap.entrySet()){
            if(entry.getKey().equals(singleton.GROUP_A_KEY)){
                for(int i=0;i<entry.getValue().size();i++){
                    groupA.get(i).setText(entry.getValue().get(i).getName());
                    groupA.get(i).setTag(TEAM_NAME, entry.getValue().get(i).getName());
                    groupA.get(i).setTag(TEAM_URL, entry.getValue().get(i).getUrl());
                }
            }
            if(entry.getKey().equals(singleton.GROUP_B_KEY)){
                for(int i=0;i<entry.getValue().size();i++){
                    groupB.get(i).setText(entry.getValue().get(i).getName());
                    groupB.get(i).setTag(TEAM_NAME, entry.getValue().get(i).getName());
                    groupB.get(i).setTag(TEAM_URL, entry.getValue().get(i).getUrl());
                }
            }
            if(entry.getKey().equals(singleton.GROUP_C_KEY)){
                for(int i=0;i<entry.getValue().size();i++){
                    groupC.get(i).setText(entry.getValue().get(i).getName());
                    groupC.get(i).setTag(TEAM_NAME, entry.getValue().get(i).getName());
                    groupC.get(i).setTag(TEAM_URL, entry.getValue().get(i).getUrl());
                }
            }
            if(entry.getKey().equals(singleton.GROUP_D_KEY)){
                for(int i=0;i<entry.getValue().size();i++){
                    groupD.get(i).setText(entry.getValue().get(i).getName());
                    groupD.get(i).setTag(TEAM_NAME, entry.getValue().get(i).getName());
                    groupD.get(i).setTag(TEAM_URL, entry.getValue().get(i).getUrl());

                }
            }
        }
    }

    private void setListener(){
        for(int i=0;i<4;i++){
            groupA.get(i).setOnClickListener(this);
            groupB.get(i).setOnClickListener(this);
            groupC.get(i).setOnClickListener(this);
            groupD.get(i).setOnClickListener(this);
        }
    }


    @Override
    public void onClick(View v) {
        Button button = (Button) v;
        Intent intent = new Intent(getActivity(), TeamsActivity.class);
        intent.putExtra(singleton.TEAM_NAME, (String) button.getTag(TEAM_NAME));
        intent.putExtra(singleton.TEAM_URL, (String) button.getTag(TEAM_URL));
        startActivity(intent);

    }
}
