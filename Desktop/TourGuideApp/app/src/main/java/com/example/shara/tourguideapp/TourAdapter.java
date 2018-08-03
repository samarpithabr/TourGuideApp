package com.example.shara.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TourAdapter extends ArrayAdapter<Tour> {
    public TourAdapter(@NonNull Context context, @NonNull List<Tour> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }
        Tour currentmusic = getItem(position);
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_id);
        iconView.setImageResource(currentmusic.getImageid());
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.event_name);
        numberTextView.setText(currentmusic.getEventName());
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.restaurant_name);
        nameTextView.setText(currentmusic.getRestName());
        return listItemView;


    }
}



