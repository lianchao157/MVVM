package com.meituan.demo.controller;

//2021.10.28

import com.meituan.demo.bean.citybean.CitySelectBean;
import com.meituan.demo.domain.GeneralResult;
import com.meituan.demo.server.SelectCityService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/***
 * 选择城市列表
 */
@RestController
public class SelectCityController {
@Autowired
private SelectCityService servicebySelectCity;

    /***
     * 获取城市列表
     */
    @ApiOperation(value = "获取城市")
    @RequestMapping(value = "/SelectCityBySelet", method = RequestMethod.GET)
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(name = "city", value = "cityname", dataType = "String", paramType = "query", example = "1", required = true),
    })
    public GeneralResult SelectCityBySelet(String  city){
        GeneralResult generalResult=new GeneralResult();
        List<CitySelectBean> listdata=servicebySelectCity.getListCity(city);
        generalResult.setCode(00);
        generalResult.setMsg("返回成功");
        generalResult.setData(listdata);
        return generalResult;
    }
}
