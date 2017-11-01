package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Weather 类引用其他类
 */

public class Weather {
    //返回的天气数据还会包含一项status数据，
//    成功返回ok，失败返回具体原因
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

//    daily_forecast包含数组，使用了List集合来引用Forecast类
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
