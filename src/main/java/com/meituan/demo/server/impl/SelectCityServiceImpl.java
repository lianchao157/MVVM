package com.meituan.demo.server.impl;

import com.meituan.demo.bean.citybean.CitySelectBean;
import com.meituan.demo.mapper.SelectCity_Mapper;
import com.meituan.demo.server.SelectCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
@Service
public class SelectCityServiceImpl implements SelectCityService {
    @Autowired
    SelectCity_Mapper selectCity_mapper;

    @Override
    public List<CitySelectBean> getListCity(String cityname) {
        List<CitySelectBean> ListCity = new ArrayList<>();

        if (cityname.equals("") || cityname == null) {

            Logger.getLogger("参数为空");

        } else {
            ListCity = selectCity_mapper.findcity(cityname);
            for (int i = 0; i < ListCity.size(); i++) {
                Logger.getLogger("返回结果：" + ListCity.get(i).getName());

            }
        }
        return ListCity;
    }
}
