package com.meituan.demo.controller;

import com.meituan.demo.bean.citybean.CitySelectBean;
import com.meituan.demo.domain.GeneralResult;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/***
 * 测试类
 * 1返回一个weburl加载出来
 *
 原文链接：https://blog.csdn.net/weixin_40550726/article/details/82970272
 */
@Controller
public class ReturnWebController {

    /***
     * 获取城市列表
     */
    @RequestMapping(value = "/aboutme", method = RequestMethod.GET)
    @ResponseBody
    public String Returnweb() {
        GeneralResult generalResult = new GeneralResult();
        generalResult.setCode(00);
        generalResult.setMsg("返回成功");
        generalResult.setData("");
        return "static/aboutme.html";
    }
}
