package com.meituan.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.meituan.demo.bean.Meituan_Menum_TitleBean;
import com.meituan.demo.bean.User;
import com.meituan.demo.domain.GeneralResult;
import com.meituan.demo.server.LoginByTokenService;
import com.meituan.demo.server.LoginRemberService;
import com.meituan.demo.server.ReginService;
import com.meituan.demo.server.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/***
 *
 * 登陆通过token
 *
 * https://www.jianshu.com/p/55851d4c555a
 */

@RestController
@RequestMapping("api")
public class LoginByTokenController {
    @Autowired
    private LoginByTokenService tokenService;
    @Autowired
    private UserService userService;
    @Autowired
    private LoginRemberService loginRemberService;
    @Autowired
    private ReginService reginService;

//    @Autowired
//    TokenService tokenService;

    @ApiImplicitParams({
//            @ApiImplicitParam(name = "user", value = "手机号码", dataType = "int", paramType = "query", example = "13802780104", required = true),
//            @ApiImplicitParam(name = "pw", value = "登录账号", dataType = "int", paramType = "query", example = "lihailin9073", required = true),


//            ————————————————
//            版权声明：本文为CSDN博主「巅峰键盘侠」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//            原文链接：https://blog.csdn.net/lihailin9073/article/details/97897376
    })
    public String ReturnToken() {
        String stuser = "w";
        String pw = "1";
        String token = tokenService.getToken(stuser, pw);
        return token;
    }

    @ApiOperation(value = "token")
    @RequestMapping(value = "/login", method = RequestMethod.POST) //  url 坚决不能重复
    @ResponseBody
    //登录
//    @PostMapping("/login")
    public GeneralResult login(User user) {
        GeneralResult gr = new GeneralResult();
        JSONObject jsonObject = new JSONObject();
        User userForBase = userService.findByUsername(user);

        if (userForBase == null) {
            jsonObject.put("message", "登录失败,用户不存在");
            gr.setCode(99);
            return gr.setMsg(jsonObject.toString());
        } else {
            if (!user.equals(user)) {
                jsonObject.put("message", "登录失败,密码错误");
                gr.setCode(99);
                return gr.setMsg(jsonObject.toString());
            } else {
                String token = tokenService.getToken(user.getUsername(), user.getUsertel());
                jsonObject.put("token", token);
                loginRemberService.LoginRember(user.getUsername());
                gr.setCode(00);
                gr.setMsg("成功");
                gr.setData(jsonObject);
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!" + gr);

                return gr;
            }
        }
    }

    @ApiOperation(value = "验证接口")
    //    @UserLoginToken
    @GetMapping("/getMessage")
    public String getMessage() {
        System.out.println("要验证的数据");
        return "你已通过验证";
    }

    /***
     * 缺少注册不想写了
     */


    /***
     * 查询所有
     */
    @ApiOperation(value = "注册信息")
    @RequestMapping(value = "/regin", method = RequestMethod.PUT)
    @ResponseBody
    @ApiImplicitParams({
    })
    public GeneralResult selectAll(User user) {
        GeneralResult GeneralResult = new GeneralResult();
        boolean userlistall = reginService.UserReginService(user);
        if (userlistall) {

            GeneralResult.setMsg("成功");
            GeneralResult.setData(userlistall);
            return GeneralResult;
        } else {
            GeneralResult.setMsg("失败");
            GeneralResult.setData(null);
            return GeneralResult;
        }
    }
}
//Error:java: source level should be comprised in between '1.3' and '1.9' (or '5', '5.0', ..., '9' or '9.0'): 10