package com.betterweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/8/11 0011.
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
