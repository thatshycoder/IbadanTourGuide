package com.example.dy.ibadantourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Extend array adapter class to set custom view
 */

public class LocationAdapter extends ArrayAdapter<Location> {
    private final Intent intent = new Intent();
    private final Context mContext;

    public LocationAdapter(Context context, ArrayList<Location> location) {
        super(context, 0, location);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.location_layout, parent, false);
        }

        // we declared this variable as final so it's accessible from inner methods
        final Location currentLocation = getItem(position);

        TextView locationName = convertView.findViewById(R.id.location_name);
        TextView locationAddress = convertView.findViewById(R.id.location_address);

        TextView locationPhone = convertView.findViewById(R.id.location_phone);
        ImageView locationImage = convertView.findViewById(R.id.location_image);


        // set location name
        locationName.setText(currentLocation.getLocationName());
        // set location address
        locationAddress.setText(currentLocation.getLocationAddress());
        // set location image
        locationImage.setImageResource(currentLocation.getLocationImage());

        // set location phone number if a number is provided, else, don't show the call section
        if(currentLocation.getLocationPhone() == null) {
            convertView.findViewById(R.id.call).setVisibility(View.INVISIBLE);
        } else {
            locationPhone.setText(currentLocation.getLocationPhone());
        }

        return convertView;
    }

}
