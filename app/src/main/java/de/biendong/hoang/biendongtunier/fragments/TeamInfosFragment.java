package de.biendong.hoang.biendongtunier.fragments;



import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import de.biendong.hoang.biendongtunier.BienDongTunierApplication;
import de.biendong.hoang.biendongtunier.R;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class TeamInfosFragment extends Fragment {

    TextView teamInfosTextView;
    BienDongTunierApplication singleton = BienDongTunierApplication.getInstance();

    public TeamInfosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_team_infos, container, false);
        teamInfosTextView = (TextView) v.findViewById(R.id.teamInfosTextView);
        return v;
    }


}
