package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HUWEI on 2021/03/25.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
