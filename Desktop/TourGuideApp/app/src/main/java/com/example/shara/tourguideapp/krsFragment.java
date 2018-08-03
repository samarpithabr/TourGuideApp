package com.example.shara.tourguideapp;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.shara.tourguideapp.R.id.Krs_list;

/**
 * A simple {@link Fragment} subclass.
 */
public class krsFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";
    private Context mContext;


    public static krsFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        krsFragment fragment = new krsFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onStop() {
        super.onStop();
    }

    public krsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = inflater.inflate(R.layout.activity_krs, container, false);


        final ArrayList<Tour> arraylist;
        arraylist = new ArrayList<Tour>();
        arraylist.add(new Tour(R.drawable.k1, getString(R.string.krsd), getString(R.string.krs)));
        arraylist.add(new Tour(R.drawable.rangan, getString(R.string.rangan), getString(R.string.rangand)));
        arraylist.add(new Tour(R.drawable.brund, getString(R.string.bru), getString(R.string.brund)));
        arraylist.add(new Tour(R.drawable.bluff, getString(R.string.gagan), getString(R.string.bird)));
        TourAdapter adapter = new TourAdapter(view.getContext(), arraylist);
        ListView listview = (ListView) view.findViewById(R.id.Krs_list);
        listview.setAdapter(adapter);
        return view;

    }

}
