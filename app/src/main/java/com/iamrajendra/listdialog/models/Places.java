package com.iamrajendra.listdialog.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rajendraverma on 06-08-2016.
 */
public class Places {
    @SerializedName("geometry")
    public Geometry geometry;
    @SerializedName("icon")
    public String icon;
    @SerializedName("id")
    public String id;
    @SerializedName("name")
    public String name;
    @SerializedName("place_id")
    public String place_id;
    @SerializedName("photos")
    public List<Photos> photosList;
}
