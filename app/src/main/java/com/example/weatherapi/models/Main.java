package com.example.weatherapi.models;

import com.google.gson.annotations.SerializedName;

public class Main {
    @SerializedName("temp")
    private Double temp;
    @SerializedName("temp_max")
    private Double temp_max;
    @SerializedName("temp_min")
    private Double temp_min;
    @SerializedName("name")
    private String name;
    @SerializedName("pessure")
    private int pressure;
    @SerializedName("humidity")
    private int humidity;

    public Double getTemp() {
        return temp;
    }

    public Double getTemp_max() {
        return temp_max;
    }

    public Double getTemp_min() {
        return temp_min;
    }

    public String getName() {
        return name;
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }
}