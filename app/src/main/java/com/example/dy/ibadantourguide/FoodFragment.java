package com.example.dy.ibadantourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Food category fragment
 */

public class FoodFragment extends android.support.v4.app.Fragment {
    // empty constructor is needed
    public FoodFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        // inflate the custom view
        View rootView =  inflater.inflate(R.layout.locations_list, container, false);

        // get listview view to be used
        ListView listView = rootView.findViewById(R.id.list_view);

        // create an arraylist of locations
        ArrayList<Location> location = new ArrayList<>();

        // we add all locations for the this category
        location.add(new Location("Café Chrysalis", "23 Ilaro Street, Sango Ojoo Road", "08099903274", R.drawable.cafec));
        location.add(new Location("Martha's Kitchen", "Plot: 129, Magazine Road, Jericho", "07043394371", R.drawable.martha));
        location.add(new Location("Domino's Pizza", "36, Awolowo Avenue Bodija", "09082099992", R.drawable.domino));
        location.add(new Location("Latitude Café & Lounge", "V2/V3, Ventura Mall, Sango-Ojoo Road, Samonda", "08057884892", R.drawable.cafec));
        location.add(new Location("Golden Dragon Chinese Restaurant", "Onigegora St, Mokola Hill", "08064488428", R.drawable.gdc));
        location.add(new Location("Mr Biggs", "200212 Oluyole Way, Bodija", "07043050439", R.drawable.mrbiggs));

        // get location adapter
        LocationAdapter locationAdapter = new LocationAdapter(getContext(), location);

        // attach location adapter to listview
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
