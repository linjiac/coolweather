
/**
 *
 * db 包用于存放数据库模型相关的代码
 */
package com.coolweather.android.db;

import org.litepal.crud.DataSupport;



public class Province extends DataSupport{
    //id是每个实体类中都应该有的字段
    private int id;
    //记录省的名称
    private String provinceName;
    //记录省的代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
