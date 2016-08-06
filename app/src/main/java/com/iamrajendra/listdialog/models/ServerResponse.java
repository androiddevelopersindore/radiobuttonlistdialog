package com.iamrajendra.listdialog.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rajendraverma on 06-08-2016.
 */
public class ServerResponse {
    @SerializedName("response")
    public String response;
    @SerializedName("message")
    public String messgae;
    @SerializedName("data")
    public String data;

}
