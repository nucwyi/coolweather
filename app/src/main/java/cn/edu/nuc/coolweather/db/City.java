package cn.edu.nuc.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/4/22 0022.
 */

public class City extends DataSupport {

    private int id;  //每个实体类都应该有的字段

    private  String cityName;  //市的名字

    private int cityCode;  //市的代号

    private int provinceCode;  //当前市所属省的id值

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

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
