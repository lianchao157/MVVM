package com.meituan.demo.controller;

import com.meituan.demo.bean.CreateLoginTime;
import com.meituan.demo.bean.MeiTuan_ShopCar_Bean;
import com.meituan.demo.domain.GeneralResult;
import com.meituan.demo.server.LoginRemberService;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/****
 * 记录登陆用户使用时间
 */

@RestController
@RequestMapping("api")
public class LoginRemberController {
    @Autowired
    private LoginRemberService loginRemberService;

    @ApiImplicitParams({
    })

    @RequestMapping(value = "/selectAllrember", method = RequestMethod.GET) //  url 坚决不能重复
    @ResponseBody
    public GeneralResult selectAllrember(String userno) {
        GeneralResult GeneralResult = new GeneralResult();
        List<CreateLoginTime> shopcarlist = new ArrayList<CreateLoginTime>();


        shopcarlist = loginRemberService.shopcarlist(userno);
        if (null != shopcarlist) {

            GeneralResult.setMsg("成功");
            GeneralResult.setData(shopcarlist);
            return GeneralResult;
        } else {
            GeneralResult.setMsg("失败");
            GeneralResult.setData(null);
            return GeneralResult;
        }
    }
}
