package com.example.dy.ibadantourguide;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Movies Fragment
 */

public class MoviesFragment extends android.support.v4.app.Fragment {
    // empty constructor is needed
    public MoviesFragment() {
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
        location.add(new Location("Filmhouse Cinemas Dugbe", "Heritage Mall, Dugbe", "09024973080", R.drawable.fdugbe));
        location.add(new Location("Viva Cinema", "MKO Abiola Way, Ring Road, New Gra", "08172151180", R.drawable.viva));
        location.add(new Location("Odeon Cinema", "Oke Ado, Awolowo Road, Ibadan", "08161557933", R.drawable.odeon));
        location.add(new Location("The Ventura Filmhouse", "UI Road opposite Oyo state trade fair Junction, Sango", "07037891289", R.drawable.ventura));

        // get location adapter
        LocationAdapter locationAdapter = new LocationAdapter(getContext(), location);

        // attach location adapter to listview
        listView.setAdapter(locationAdapter);

        return rootView;

    }
}
