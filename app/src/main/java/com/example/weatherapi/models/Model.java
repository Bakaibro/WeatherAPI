package com.example.weatherapi.models;

import com.google.gson.annotations.SerializedName;

public class Model {

    @SerializedName("wind")
    Wind wind_model;
    @SerializedName("sys")
    Sys sys_model;
    @SerializedName("clouds")
    Cloud clouds_model;

    @SerializedName("main")
    Main model;

    @SerializedName("timezone")
    long timezone;

    public long getTimezone() {
        return timezone;
    }


    public Wind getWind_model() {
        return wind_model;
    }

    public Sys getSys_model() {
        return sys_model;
    }

    public Cloud getClouds_model() {
        return clouds_model;
    }

    public Main getModel() {
        return model;
    }
}