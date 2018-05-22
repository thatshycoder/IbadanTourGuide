package com.example.dy.ibadantourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Shopping fragment
 */

public class ShoppingFragment extends android.support.v4.app.Fragment {
    // empty constructor is needed
    public ShoppingFragment() {
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
        location.add(new Location("Heritage Mall", "Dugbe, Ibadan", " 07038879165", R.drawable.heritage));
        location.add(new Location("The Ventura Mall", "Plot 5 and 6 Old Aerodrome Road Along Sango-UI Road, Samonda GRA ", "08077077775", R.drawable.venturam));
        location.add(new Location("Palms Shopping Mall", "Ring Road, Ibadan", R.drawable.palmsm));
        location.add(new Location("The Jericho Mall", "No 20, Kudeti Avenue, Onireke GRA ", "07039587789", R.drawable.jericho));

        // get location adapter
        LocationAdapter locationAdapter = new LocationAdapter(getContext(), location);

        // attach location adapter to listview
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
