package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 序列化名字 @SerializedName
 * GSON 解析数据
 *  基本类
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
