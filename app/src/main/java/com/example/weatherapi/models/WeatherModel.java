package com.example.weatherapi.models;

import com.google.gson.annotations.SerializedName;

public class WeatherModel {
    @SerializedName("icon")
    private String icon;
    @SerializedName("cod")
    private Integer cod;

    public String getIcon() {
        return icon;
    }

    public Integer getCod() {
        return cod;
    }
}