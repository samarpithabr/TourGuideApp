package com.example.shara.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BluffFragment extends Fragment {

    @Override
    public void onStop() {
        super.onStop();
    }

    public BluffFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_bluff, container, false);
        final ArrayList<Tour> arraylist;
        arraylist = new ArrayList<Tour>();
        arraylist.add(new Tour(R.drawable.adi, getString(R.string.adi), getString(R.string.adid)));
        arraylist.add(new Tour(R.drawable.a2b, getString(R.string.anand), getString(R.string.anandd)));
        arraylist.add(new Tour(R.drawable.hari, getString(R.string.har), getString(R.string.hard)));
        arraylist.add(new Tour(R.drawable.guru, getString(R.string.guru), getString(R.string.gurud)));
        TourAdapter adapter = new TourAdapter(rootView.getContext(), arraylist);
        ListView listview = (ListView) rootView.findViewById(R.id.Bluff_list);
        listview.setAdapter(adapter);
        return rootView;

    }

}

