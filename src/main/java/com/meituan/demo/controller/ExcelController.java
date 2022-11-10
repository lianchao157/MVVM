package com.meituan.demo.controller;

import cn.afterturn.easypoi.entity.vo.NormalExcelConstants;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import cn.afterturn.easypoi.view.PoiBaseView;
import cn.hutool.http.HttpUtil;
import com.meituan.demo.bean.DataOrderQueryReq;
import com.meituan.demo.bean.Member;
import com.meituan.demo.bean.User;
import com.meituan.demo.bean.UserEx;
import com.meituan.demo.server.*;
import com.meituan.demo.server.impl.resul;
import com.meituan.demo.utils.LocalJsonUtil;
import com.meituan.demo.utils.PoiUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.jdbc.Null;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.RegionUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 导出excel
 * @param
 * @param
 * @param
 * @return
 *
 *
 *
 * https://blog.csdn.net/qq_42868618/article/details/121969675
 */


@RestController
@RequestMapping("api")
public class ExcelController {
    @Autowired(required = true)
    public StudentService studentService;
    @Autowired(required = true)
    public ExcelService mExcelService;

    @PostMapping("/exportHttp")
    public String daoChu(@RequestBody DataOrderQueryReq req, HttpServletRequest request, HttpServletResponse response) {
        //创建excel
        HSSFWorkbook wk1 = new HSSFWorkbook();
        HSSFWorkbook wk = mExcelService.daoChu(new HSSFWorkbook(), req, request, response);
        try {
            /**
             * 弹出下载选择路径框
             */
            CharacterEncodingFilter filter = new CharacterEncodingFilter();
            filter.setEncoding("UTF-8");
            filter.setForceEncoding(true);

            response.setContentType("application/octet-stream");
            response.setHeader("Content-disposition", "attachment;filename=Opinion.xls");//默认Excel名称
            response.setCharacterEncoding("UTF-8");
            //设置响应媒体类型
            response.setContentType("application/vnd.ms-excel");
            //设置响应的格式说明
            response.flushBuffer();
            wk.write(response.getOutputStream());
            //wk.write(new FileOutputStream("D:/a.xlsx"));
            wk.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
        return null;
    }
//    原文链接：https://blog.csdn.net/u014508939/article/details/121809564

//URLEncoder.encoder ()设置字符编码

//URLDecoder.decode ()是字符解码
    @GetMapping(value = "/exportUser", produces = "application/down;charset=GBK")
    public ResponseEntity<byte[]> exportUser() {
        // 准备需要导出的数据
        List<UserEx> users = new ArrayList<>();
        users.add(new UserEx(1, "张三", "男", new Date(), "01001"));
        users.add(new UserEx(2, "李四", "男", new Date(), "01002"));
        users.add(new UserEx(3, "王五", "女", new Date(), "01003"));

        // 将数据导出成excel
        return PoiUtils.exportUser2Excel(users);
    }

    @ApiOperation(value = "获取购物车列表exportToExcel")
    @GetMapping("exportToExcel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        Workbook wb = new HSSFWorkbook();
        OutputStream output = response.getOutputStream();
        String fileName = "接入详情.xls";
        try {
            String uncod= URLDecoder.decode("接入详情","UTF-8");
             fileName = new String(uncod.getBytes("UTF-8"), "iso-8859-1");
            response.setHeader("Content-Disposition", "attachment;filename="+new String(fileName.getBytes("GBK"),"iso8859-1")+".xlsx");


//            fileName = URLEncoder.encode(fileName, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
//        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ";" + "filename*=utf-8''" + fileName);
        wb.write(output);
        output.close();
//        https://blog.51cto.com/u_14486541/5369928
    }
    public static Workbook writeToExcelByList(String[] array, List<List> list) {
        //创建工作薄
        Workbook wb = new XSSFWorkbook();
        //标题和页码
        CellStyle titleStyle = wb.createCellStyle();
        // 设置单元格对齐方式,水平居左
        titleStyle.setAlignment(HorizontalAlignment.LEFT);
        // 设置字体样式
        Font titleFont = wb.createFont();
        // 字体高度
        titleFont.setFontHeightInPoints((short) 12);
        // 字体样式
        titleFont.setFontName("黑体");
        titleStyle.setFont(titleFont);
        //创建sheet
        Sheet sheet = wb.createSheet("接入详情");
        // 自动设置宽度
        sheet.autoSizeColumn(0);
        // 在sheet中添加标题行// 行数从0开始
        Row row = sheet.createRow((int) 0);
        for (int i = 0; i < array.length; i++) {
            Cell cell = row.createCell(i);
            cell.setCellValue(array[i]);
            cell.setCellStyle(titleStyle);
        }
        // 数据样式 因为标题和数据样式不同 需要分开设置 不然会覆盖
        CellStyle dataStyle = wb.createCellStyle();
        // 设置居中样式，水平居中
        dataStyle.setAlignment(HorizontalAlignment.CENTER);
        //数据从序号1开始
        try {
            int index = 1;
            for (List value : list) {
                // 默认的行数从0开始，为了统一格式设置从1开始，就是从excel的第二行开始
                row = sheet.createRow(index);
                index++;
                List data = value;
                for (int j = 0; j < data.size(); j++) {
                    Cell cell = row.createCell(j);
                    // 为当前列赋值
                    cell.setCellValue(data.get(j).toString());
                    //设置数据的样式
                    cell.setCellStyle(dataStyle);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wb;
    }


//   无法打开文档本地文档
    @Controller
    @Api(tags = "EasyPoiController", description = "EasyPoi导入导出测试")
    @RequestMapping("/easyPoi")
    public class EasyPoiController {

        @ApiOperation(value = "导出会员列表Excel")
        @RequestMapping(value = "/exportMemberList", method = RequestMethod.GET)
        public void exportMemberList(ModelMap map,
                                     HttpServletRequest request,
                                     HttpServletResponse response) {
            List<Member> memberList = LocalJsonUtil.getListFromJson("json/members.json", Member.class);
            ExportParams params = new ExportParams("会员列表", "会员列表", ExcelType.XSSF);
            map.put(NormalExcelConstants.DATA_LIST, memberList);
            map.put(NormalExcelConstants.CLASS, Member.class);
            map.put(NormalExcelConstants.PARAMS, params);
            map.put(NormalExcelConstants.FILE_NAME, "memberList");
            PoiBaseView.render(map, request, response, NormalExcelConstants.EASYPOI_EXCEL_VIEW);
        }
    }


    /**
     * 导出设备信息数据列表
     * @param vo
     * @param request
     * @param response
     * @return: xxx.utils.util.CommonResponse
     * @author Mike-GY
     * @since: 2022/8/2
     */
    @Autowired
    private resul resultService;
    @GetMapping(value = "/export")
    public void exportResult(HttpServletResponse response) throws IOException {
        Workbook wb = resultService.exportToExcel();
        OutputStream output = response.getOutputStream();
        String fileName = "结果表.xlsx";
        try {
            fileName = URLEncoder.encode(fileName, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        response.setHeader("Content-disposition", "attachment;filename=" + fileName +"张三"+ ";" + "filename*=utf-8''" + fileName);
        wb.write(output);
        output.close();
    }
//    原文链接：https://blog.csdn.net/jdbcmeng/article/details/126971182



//代码链接
//    https://gitee.com/yin-kun-peng/poi-export-data-as-excel-p/blob/master/src/main/java/cn/ykp/entity/Teacher.java

//乱码  打不开
//    代码
    @Autowired
    private OperateReadPoiService operateReadPoiService;
    @ApiOperation(value = "downLoadExcel11111111111111111111111111111")
    @RequestMapping(value = "/downLoadExcel",method = RequestMethod.GET)
    public void  downLoadExcel(HttpServletResponse response) throws IOException {
        operateReadPoiService.downLoadExcel(response);
        System.out.println("downLoadExcel11111111111111111111111111111");
    }




    @ApiOperation(value = "testDownLoadExcel")
    @RequestMapping("/testDownLoadExcel")
    public String  downLoadExcel(){
        return "testDownLoadExcel";
    }





//    b包含了导入功能
//    https://github.com/allanzhuo/myport/blob/master/src/main/java/com/allan/service/impl/StudentServiceImpl.java
    @RequestMapping(value="/exportExcel存放",method=RequestMethod.GET)
    public void exportExcel(HttpServletResponse response) {
        try {
            studentService.exportExcel(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
