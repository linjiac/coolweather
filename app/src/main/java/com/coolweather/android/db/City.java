package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * City 市
 * Created by gdcy on 2017/10/30.
 */

public class City extends DataSupport {
//    市的id
    private int id;
//    市名称
    private String cityName;
//    市代号
    private int cityCode;
//    记录当前所属省的id值
    private int ProvinceId;

    public int getProvinceId() {
        return ProvinceId;
    }

    public void setProvinceId(int provinceId) {
        ProvinceId = provinceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
