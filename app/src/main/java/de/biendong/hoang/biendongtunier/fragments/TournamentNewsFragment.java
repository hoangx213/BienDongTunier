package de.biendong.hoang.biendongtunier.fragments;



import android.app.ListFragment;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import de.biendong.hoang.biendongtunier.BienDongTunierApplication;
import de.biendong.hoang.biendongtunier.R;
import de.biendong.hoang.biendongtunier.adapters.NewsListAdapter;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class TournamentNewsFragment extends ListFragment {

    BienDongTunierApplication singleton = BienDongTunierApplication.getInstance();

    public TournamentNewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tournament_news, container, false);
        setListAdapter(new NewsListAdapter(getActivity(), R.layout.listitem_tournament_news, singleton.newsList));
        return v;
    }


}
