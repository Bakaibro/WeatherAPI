package com.example.weatherapi.remote_data;

import com.example.weatherapi.models.Model;
import com.example.weatherapi.models.WeatherModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {

    //public static String URL = "api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid=c712fbc6e2ab21a5f2633d814000ace6";
    public static String URL = "c712fbc6e2ab21a5f2633d814000ace6";

    @GET("/data/2.5/weather")
    Call<Model> getCurrentWeather(
            @Query("q") String name,
            @Query("appid") String key);



    @GET("/data/2.5/weather?lat=44.34&lon=10.99&appid=c712fbc6e2ab21a5f2633d814000ace6")
    Call<WeatherModel> getWeather(
            @Query("q") String name,
            @Query("appid") String key);
}