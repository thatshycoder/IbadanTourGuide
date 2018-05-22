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
 * Hotel Fragment
 */

public class HotelFragment extends android.support.v4.app.Fragment {
    // empty constructor is needed
    public HotelFragment() {
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
        location.add(new Location("Palms 77 Hotel", "Agodi, Ibadan", "08188422222", R.drawable.palms));
        location.add(new Location("Owu Crown Hotel", "2 Iwo Rd, Iwo Road 200224", "08172175771", R.drawable.owu));
        location.add(new Location("Davies Hotel", "Old Bodija Estate,, Adeyi Ave, Mokola Hill", "08023387433", R.drawable.midetel));
        location.add(new Location("Labod Hotel", "55 Awolowo Road, Off Elewure Road, Sango, Mokola Hil", "07042286331", R.drawable.labod));
        location.add(new Location("Carlton Gate Xclusive", "Quarters 860, Agodi GRA, Agodi", "07016461013", R.drawable.carlon));
        location.add(new Location("Horizon Suite", "Oluyole, Ibadan", "08024725065", R.drawable.horizon));

        // get location adapter
        LocationAdapter locationAdapter = new LocationAdapter(getContext(), location);

        // attach location adapter to listview
        listView.setAdapter(locationAdapter);

        return rootView;

    }
}
