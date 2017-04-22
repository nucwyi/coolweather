package cn.edu.nuc.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/4/22 0022.
 */

public class County extends DataSupport {

    private int id;  //每个实体类都应该有的字段

    private String countyName;  //县的名字

    private String weatherId;  //县所对应的天气id

    private int cityId;  //当前县所属市的id
}
