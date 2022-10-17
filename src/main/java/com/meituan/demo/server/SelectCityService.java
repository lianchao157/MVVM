package com.meituan.demo.server;


import com.meituan.demo.bean.citybean.CitySelectBean;

import java.util.List;

public interface SelectCityService {
    public List<CitySelectBean> getListCity(String cityname);
}
