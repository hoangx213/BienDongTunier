package de.biendong.hoang.biendongtunier.fragments;



import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import de.biendong.hoang.biendongtunier.R;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class TournamentProgramFragment extends Fragment {


    public TournamentProgramFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tournament_program, container, false);
    }


}
