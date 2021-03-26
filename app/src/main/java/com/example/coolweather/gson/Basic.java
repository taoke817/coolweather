package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HUWEI on 2021/03/25.
 */

public class Basic {
    @SerializedName("City")
    public String cityNmae;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public  String updateTime;
    }
}
