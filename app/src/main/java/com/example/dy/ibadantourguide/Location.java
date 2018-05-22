package com.example.dy.ibadantourguide;

/**
 * This class holds each location information
 */

public class Location {
    private String mLocationName;
    private String mLocationAddress;
    private String mLocationPhone;
    private int mLocationImage;

    public Location(String name, String address, int locationImage) {

        mLocationName = name;
        mLocationAddress = address;
        mLocationImage = locationImage;

    }

    public Location(String name, String address, String phoneNumber, int locationImage) {
        mLocationName = name;
        mLocationAddress = address;
        mLocationPhone = phoneNumber;
        mLocationImage = locationImage;
    }

    /**
     * @return string location name
     */
    public String getLocationName() {
        return mLocationName;
    }

    /**
     * @return string location address
     */
    public String getLocationAddress() {
        return mLocationAddress;
    }

    /**
     * @return string location phone
     */
    public String getLocationPhone() {
        return mLocationPhone;
    }

    /**
     * @return int location image resource id
     */
    public int getLocationImage() { return mLocationImage;}
}
