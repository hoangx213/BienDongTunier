package de.biendong.hoang.biendongtunier.fragments;



import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import de.biendong.hoang.biendongtunier.BienDongTunierApplication;
import de.biendong.hoang.biendongtunier.R;
import de.biendong.hoang.biendongtunier.adapters.PlayersListAdapter;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class TeamPlayerFragment extends Fragment {

    GridView teamPlayersGridView;
    BienDongTunierApplication singleton = BienDongTunierApplication.getInstance();

    public TeamPlayerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_team_player, container, false);
        teamPlayersGridView = (GridView) v.findViewById(R.id.teamPlayerGridView);
        teamPlayersGridView.setAdapter(new PlayersListAdapter(getActivity(), R.layout.listitem_players, singleton.playersList));
        return v;
    }


}
