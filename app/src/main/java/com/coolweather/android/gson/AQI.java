package com.coolweather.android.gson;

/**
 * AQI 空气质量指数;
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;

    }

}
