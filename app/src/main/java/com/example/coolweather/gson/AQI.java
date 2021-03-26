package com.example.coolweather.gson;

/**
 * Created by HUWEI on 2021/03/25.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
