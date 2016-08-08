package com.iamrajendra.listdialog.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rajendraverma on 07-08-2016.
 */
public class Photos {
    @SerializedName("height")
    public int height;
    @SerializedName("width")
    public int width;
    @SerializedName("photo_reference")
    public String photo_reference;
}
