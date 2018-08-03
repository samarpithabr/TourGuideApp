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
public class SriFragment extends Fragment {


    @Override
    public void onStop() {
        super.onStop();
    }

    public SriFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_srirangapatna, container, false);
        final ArrayList<Tour> arraylist;
        arraylist = new ArrayList<Tour>();
        arraylist.add(new Tour(R.drawable.surabi, getString(R.string.sura), getString(R.string.surad)));
        arraylist.add(new Tour(R.drawable.jyothi, getString(R.string.jyothi), getString(R.string.thim)));
        arraylist.add(new Tour(R.drawable.thimdas, getString(R.string.thimms), getString(R.string.jyod)));

        TourAdapter adapter = new TourAdapter(rootView.getContext(), arraylist);
        ListView listview = (ListView) rootView.findViewById(R.id.sri_list);
        listview.setAdapter(adapter);
        return rootView;

    }

}
