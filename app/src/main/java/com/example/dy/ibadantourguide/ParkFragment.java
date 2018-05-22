package com.example.dy.ibadantourguide;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Park fragment
 */

public class ParkFragment extends android.support.v4.app.Fragment {
    // empty constructor is needed
    public ParkFragment() {
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
        location.add(new Location("Agodi Gardens", "Secretariat Rd, Mokola Hill", R.drawable.agodi));
        location.add(new Location("Trans-Amusement Park", "Secretariat-Agodi Rd, Mokola Hill", R.drawable.trans));
        location.add(new Location("UI Zoological Gardens", "University of Ibadan", "08054459319", R.drawable.ui));
        location.add(new Location("National Museum of Unity", "National Museum Road", " 08028221931", R.drawable.museum));

        // get location adapter
        LocationAdapter locationAdapter = new LocationAdapter(getContext(), location);

        // attach location adapter to listview
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
