package com.meituan.demo.controller;

import com.meituan.demo.bean.VideoInfoEntity;
import com.meituan.demo.domain.GeneralResult;
import com.meituan.demo.server.VideoInfoService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/***
 * 视频
 * 信息
 */
@RestController
public class VideoContrllor {
    @Autowired
    private VideoInfoService Vide;
    /***
     * 查询单个的视频信息
     */
    @ApiOperation(value = "获取视频信息")
    @RequestMapping(value = "/GetVideoInf", method = RequestMethod.GET)
    @ResponseBody
    @ApiImplicitParams({
                    @ApiImplicitParam(name = "videoNo", value = "视频id", dataType = "String", paramType = "query", example = "1", required = true),
    })
    public GeneralResult selectAll(String videoNo) {
        GeneralResult GeneralResult = new GeneralResult();
        List<VideoInfoEntity> list = new ArrayList<>();

//        list.clear();
//        list.add(Vide.GetVideo());
        GeneralResult.setData(Vide.GetVideo(videoNo));
        return GeneralResult;
    }



// 修改问resultful风格
//    API（应用程序接口）：可以访问controller的url

//    例如：传统架构：http://localhost:8080/user?name=Tom&age=20，则换成RESTful架构为：http://localhost:8080/user/Tom/20


//    @RequestMapping("/{videoNo}")
//    @ResponseBody
//    public GeneralResult queryUserById(@PathVariable("videoNo") String videoNo){
//        GeneralResult GeneralResult = new GeneralResult();
//        List<VideoInfoEntity> list = new ArrayList<>();
//        GeneralResult.setData(Vide.GetVideo(videoNo));
//        return GeneralResult;
//    }

}
