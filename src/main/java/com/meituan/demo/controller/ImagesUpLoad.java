package com.meituan.demo.controller;

import com.meituan.demo.utils.JsonResult;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/***
 * 图片的存储
 * 一种转成二进制 存放
 * 一种直接存图片的路径
 */
@RestController
@RequestMapping("api")
public class ImagesUpLoad {
    /**
     * 时间格式化
     */
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd/");
        @Value("${file-save-path}")
    private String fileSavePath;
    @ConfigurationProperties
    @ApiOperation(value = "上传图片进行存放")
    @RequestMapping(value = "/SaveImages", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult SaveImages(MultipartFile file, HttpServletRequest request) {
        JsonResult js = new JsonResult();
        //后半段目录：  2020/03/15
        String directory = simpleDateFormat.format(new Date());
        /**
         * 文件保存目录  E:/images/2020/03/15/
         * 如果目录不存在，则创建
         */
        File dir = new File(fileSavePath + directory);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        System.out.println("图片上传，保存位置：" + fileSavePath + directory);
        //给文件重新设置一个名字
        //后缀
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String newFileName = UUID.randomUUID().toString().replaceAll("-", "") + suffix;
        //创建这个新文件
        File newFile = new File(fileSavePath + directory + newFileName);
        //复制操作
        try {
            file.transferTo(newFile);
            //协议 :// ip地址 ：端口号 / 文件目录(/images/2020/03/15/xxx.jpg)
            String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/images/" + directory + newFileName;
            System.out.println("图片上传，访问URL：" + url);
            js.setMessage("成功");
            return js;
//            return JsonResult.data(url).message("上传成功！").code("200").build();
        } catch (IOException e) {
            js.setMessage("存放失败");
            return js;
//            return JsonResult.builder().data(null).message("IO异常！").code("500").build();
        }
//        https://blog.51cto.com/u_15466961/5275011

    }
}
