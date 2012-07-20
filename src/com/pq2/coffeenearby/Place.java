package com.pq2.coffeenearby;

/**
 * Created with IntelliJ IDEA.
 * User: splinterbrain
 * Date: 7/19/12
 * Time: 8:14 PM
 * To change this template use File | Settings | File Templates.
 */

import android.location.Location;
import com.google.android.maps.GeoPoint;

import java.io.Serializable;

public class Place implements Serializable {
    private static final long serialVersionUID = 6790106636076558136L;
    private double latitude;
    private double longitude;


    public Place(double latitude, double longitude, String name, String address) {
        super();
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.address = address;
    }

    public Place(Location location, String name){
        super();
        this.latitude = location.getLatitude();
        this.longitude = location.getLongitude();
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String name;

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GeoPoint toGeoPoint() {
        return new GeoPoint((int) (latitude*1e6), (int) (longitude*1e6));
    }

}
