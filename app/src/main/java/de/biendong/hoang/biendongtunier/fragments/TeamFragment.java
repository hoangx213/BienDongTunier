package de.biendong.hoang.biendongtunier.fragments;

import android.app.Activity;
import android.app.ListFragment;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import de.biendong.hoang.biendongtunier.BienDongTunierApplication;
import de.biendong.hoang.biendongtunier.MyActivity;
import de.biendong.hoang.biendongtunier.R;
import de.biendong.hoang.biendongtunier.TeamsActivity;
import de.biendong.hoang.biendongtunier.models.TeamModel;

public class TeamFragment extends ListFragment {

    private BienDongTunierApplication singleton = BienDongTunierApplication.getInstance();

    public TeamFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        setListShown(false);
        return inflater.inflate(R.layout.fragment_teamlist, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setListAdapter((new ArrayAdapter<TeamModel>(getActivity(),
                R.layout.listitem_teams, R.id.teamsTextView, singleton.teamsList)));
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MyActivity) activity).onSectionAttached(2);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(getActivity(), TeamsActivity.class);
        intent.putExtra(BienDongTunierApplication.TEAM_NAME, singleton.teamsList.get(position).getName());
        intent.putExtra(BienDongTunierApplication.TEAM_URL, singleton.teamsList.get(position).getUrl());
        startActivity(intent);

    }
}
