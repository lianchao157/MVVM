package com.meituan.demo.server.impl;

import com.meituan.demo.bean.DataOrderQueryReq;
import com.meituan.demo.server.ExcelService;
import com.meituan.demo.utils.ExcelWrite;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExcelServiceImpl implements ExcelService {
    @Override
    public HSSFWorkbook daoChu(HSSFWorkbook wk , DataOrderQueryReq req, HttpServletRequest request, HttpServletResponse response) {
        //1. 创建sheet页
        HSSFSheet sheet1 = wk.createSheet();
        sheet1.setColumnWidth(0, 5000);
        HSSFRow row1 = sheet1.createRow(0);
        //2. 创建单元格标题头
        HSSFCell cell1 = row1.createCell((short) 0);
        cell1.setCellValue("排名");
        cell1 = row1.createCell((short)1);
        cell1.setCellValue("城市名称");
        cell1 = row1.createCell((short)2);
        cell1.setCellValue("订单數量");
        //3.查询数据并写入到行对象
//        List<CityOrderDto> data1=tOrdersService.cityOrders(req,request);
//        for (short i=0;i<data1.size();i++){
//            row1= sheet1.createRow(i+1);
//            row1.createCell(0).setCellValue(data1.get(i).getRanking());
//            row1.createCell(1).setCellValue(data1.get(i).getCityName());
//            row1.createCell(2).setCellValue(data1.get(i).getOrderNum());
//        }
//        //-------------------------------------------------------------------------------
//        //1. 创建sheet页
        HSSFSheet sheet2 = wk.createSheet();
        sheet2.setColumnWidth(0, 5000);
        HSSFRow row2 = sheet2.createRow(0);
//        //2. 创建单元格标题头
        HSSFCell cell2 = row2.createCell((short) 0);
        cell2.setCellValue("订单总数");
        cell2 = row2.createCell((short)1);
        cell2.setCellValue("平均客单价");
        cell2 = row2.createCell((short)2);
        cell2.setCellValue("平均里程价");
        cell2 = row2.createCell((short)3);
        cell2.setCellValue("用户數量");
        cell2 = row2.createCell((short)4);
        cell2.setCellValue("订单总金额");
//        //3.查询数据并写入到行对象
//        OrderTotalDto data2=tOrdersService.orderTotal(req,request);
//        row2= sheet2.createRow(1);
//        row2.createCell(0).setCellValue(data2.getOrderTotal());
//        row2.createCell(1).setCellValue(data2.getAvgOrderPrice().doubleValue());
//        row2.createCell(2).setCellValue(data2.getAvgMileagePrice().doubleValue());
//        row2.createCell(3).setCellValue(data2.getUserTotal());
//        row2.createCell(4).setCellValue(data2.getOrderTotalPrice().doubleValue());
//        //-------------------------------------------------------------------------------
//        //1. 创建sheet页
//        HSSFSheet sheet3 = wk.createSheet();
//        sheet3.setColumnWidth(0, 5000);
//        HSSFRow row3 = sheet3.createRow(0);
//        //2. 创建单元格标题头
//        HSSFCell cell3 = row3.createCell((short) 0);
//        cell3.setCellValue("城市名称");
//        cell3 = row3.createCell((short)1);
//        cell3.setCellValue("订单數量");
//        //3.查询数据并写入到行对象
//        req.setType("1");
//        List<OrderTop10Dto> data3=tOrdersService.orderTop10(req,request);
//        for (short i=0;i<data3.size();i++){
//            row3= sheet3.createRow(i+1);
//            row3.createCell(0).setCellValue(data3.get(i).getCname());
//            row3.createCell(1).setCellValue(data3.get(i).getOrderTotal().doubleValue());
//        }
//        //-------------------------------------------------------------------------------
//        //1. 创建sheet页
//        HSSFSheet sheet4 = wk.createSheet();
//        sheet4.setColumnWidth(0, 5000);
//        HSSFRow row4 = sheet4.createRow(0);
//        //2. 创建单元格标题头
//        HSSFCell cell4 = row4.createCell((short) 0);
//        cell4.setCellValue("城市名称");
//        cell4 = row4.createCell((short)1);
//        cell4.setCellValue("订单金额");
//        //3.查询数据并写入到行对象
//        req.setType("2");
//        List<OrderTop10Dto> data4=tOrdersService.orderTop10(req,request);
//        for (short i=0;i<data4.size();i++){
//            row4= sheet4.createRow(i+1);
//            row4.createCell(0).setCellValue(data4.get(i).getCname());
//            row4.createCell(1).setCellValue(data4.get(i).getTotalPrice().doubleValue());
//        }
//        //-------------------------------------------------------------------------------
//        //1. 创建sheet页
//        HSSFSheet sheet5 = wk.createSheet();
//        sheet5.setColumnWidth(0, 5000);
//        HSSFRow row5 = sheet5.createRow(0);
//        //2. 创建单元格标题头
//        HSSFCell cell5 = row5.createCell((short) 0);
//        cell5.setCellValue("企业名称");
//        cell5 = row5.createCell((short)1);
//        cell5.setCellValue("订单數量");
//        cell5 = row5.createCell((short)2);
//        cell5.setCellValue("订单金额");
//        //3.查询数据并写入到行对象
//        List<CustomerOrderDto> data5=tOrdersService.customerOrder(req,request);
//        for (short i=0;i<data5.size();i++){
//            row5= sheet5.createRow(i+1);
//            row5.createCell(0).setCellValue(data5.get(i).getCname());
//            row5.createCell(1).setCellValue(data5.get(i).getOrderNum());
//            row5.createCell(2).setCellValue(data5.get(i).getOrderTotal().doubleValue());
//        }
//        //-------------------------------------------------------------------------------
//        //1. 创建sheet页
//        HSSFSheet sheet6 = wk.createSheet();
//        sheet6.setColumnWidth(0, 5000);
//        HSSFRow row6 = sheet6.createRow(0);
//        //2. 创建单元格标题头
//        HSSFCell cell6 = row6.createCell((short) 0);
//        cell6.setCellValue("企业名称");
//        cell6 = row6.createCell((short)1);
//        cell6.setCellValue("用户數量");
//        //3.查询数据并写入到行对象
//        List<CustomerUserDto> data6=tOrdersService.customerUser(req,request);
//        for (short i=0;i<data6.size();i++){
//            row6= sheet6.createRow(i+1);
//            row6.createCell(0).setCellValue(data6.get(i).getCname());
//            row6.createCell(1).setCellValue(data6.get(i).getUserNum());
//        }
//        //-------------------------------------------------------------------------------
//        //1. 创建sheet页
//        HSSFSheet sheet7 = wk.createSheet();
//        sheet7.setColumnWidth(0, 5000);
//        HSSFRow row7 = sheet7.createRow(0);
//        //2. 创建单元格标题头
//        HSSFCell cell7 = row7.createCell((short) 0);
//        cell7.setCellValue("小时");
//        cell7 = row7.createCell((short)1);
//        cell7.setCellValue("订单數量");
//        cell7 = row7.createCell((short)2);
//        cell7.setCellValue("订单金额");
//        //3.查询数据并写入到行对象
//        List<OrderPriceAndNumDto> data7=tOrdersService.OrderPriceAndNumByTimer(req,request);
//        for (short i=0;i<data7.size();i++){
//            row7= sheet7.createRow(i+1);
//            row7.createCell(0).setCellValue(data7.get(i).getHou());
//            row7.createCell(1).setCellValue(data7.get(i).getOrderNum());
//            row7.createCell(2).setCellValue(data7.get(i).getOrderPrice().doubleValue());
//        }
//        wk.setSheetName(0,"城市单量热力图");
//        wk.setSheetName(1,"统计数据");
//        wk.setSheetName(2,"Top10企业订单數量");
//        wk.setSheetName(3,"Top10企业订单金额");
//        wk.setSheetName(4,"企业订单分析");
//        wk.setSheetName(5,"企业用户分析");
//        wk.setSheetName(6,"订单数及订单金额(时段)");
        return wk;

//————————————————
//        版权声明：本文为CSDN博主「晨曦遇晓」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//        原文链接：https://blog.csdn.net/u014508939/article/details/121809564
    }

    @Override
    public Workbook exportToExcel2() {
        //这是表头
        String[] arr = {"名称","年龄"};
        //这是具体数据
        List list1 = new ArrayList<>();
        list1.add("张三");
        list1.add("18");
        List list2 = new ArrayList<>();
        list2.add("李四");
        list2.add("33");
        List<List> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        return ExcelWrite.writeToExcelByList(arr, list);
//        https://blog.51cto.com/u_14486541/5369928
    }
}
