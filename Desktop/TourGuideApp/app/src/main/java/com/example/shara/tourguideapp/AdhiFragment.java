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
public class AdhiFragment extends Fragment {


    @Override
    public void onStop() {
        super.onStop();
    }

    public AdhiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_adichunchangiri, container, false);
        final ArrayList<Tour> arraylist;
        arraylist = new ArrayList<Tour>();
        arraylist.add(new Tour(R.drawable.big, getString(R.string.big), getString(R.string.bigd)));
        arraylist.add(new Tour(R.drawable.jewel, getString(R.string.kamana), getString(R.string.kamanad)));
        arraylist.add(new Tour(R.drawable.nakshatra, getString(R.string.naks), getString(R.string.naksd)));
        TourAdapter adapter = new TourAdapter(rootView.getContext(), arraylist);
        ListView listview = (ListView) rootView.findViewById(R.id.Adhi_list);
        listview.setAdapter(adapter);
        return rootView;

    }

}
