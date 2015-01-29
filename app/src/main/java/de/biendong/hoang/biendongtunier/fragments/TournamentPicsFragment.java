package de.biendong.hoang.biendongtunier.fragments;


import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import de.biendong.hoang.biendongtunier.BienDongTunierApplication;
import de.biendong.hoang.biendongtunier.R;
import de.biendong.hoang.biendongtunier.adapters.NewsListAdapter;
import de.biendong.hoang.biendongtunier.adapters.PicsListAdapter;

/**
 * A simple {@link android.app.Fragment} subclass.
 *
 */
public class TournamentPicsFragment extends ListFragment {

    BienDongTunierApplication singleton = BienDongTunierApplication.getInstance();

    public TournamentPicsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tournament_pics, container, false);
        setListAdapter(new PicsListAdapter(getActivity(), R.layout.listitem_tournament_pics, singleton.picsList));
        return v;
    }


}
