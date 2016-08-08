package com.iamrajendra.listdialog.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rajendraverma on 06-08-2016.
 */
public class LocationData {
    @SerializedName("status")
    public String status;
    @SerializedName("results")
    public List<Places> mList_places;
    @SerializedName("error_message")
    public String error_message;
}
