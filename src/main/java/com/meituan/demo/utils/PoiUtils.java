package com.meituan.demo.utils;

import com.meituan.demo.bean.UserEx;
import org.apache.http.impl.cookie.DateUtils;
import org.apache.poi.hpsf.DocumentSummaryInformation;
import org.apache.poi.hpsf.SummaryInformation;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class PoiUtils {
    // 将数据导出成excel文件
    public static ResponseEntity<byte[]> exportUser2Excel(List<UserEx> users) {
        HttpHeaders headers = null;
        ByteArrayOutputStream baos = null;
        String fileName = "课中管理_商品购买_" + ".xls";
        ByteArrayOutputStream baos1=null;
        try {
            //1.创建Excel文档
            HSSFWorkbook workbook = new HSSFWorkbook();
            //2.创建文档摘要
            workbook.createInformationProperties();
            //3.获取文档信息，并配置
            DocumentSummaryInformation dsi = workbook.getDocumentSummaryInformation();
            //3.1文档类别
            dsi.setCategory("人员信息");
            //3.2设置文档管理员
            dsi.setManager("hangge");
            //3.3设置组织机构
            dsi.setCompany("航歌");
            //4.获取摘要信息并配置
            SummaryInformation si = workbook.getSummaryInformation();
            //4.1设置文档主题
            si.setSubject("人员信息表");
            //4.2.设置文档标题
            si.setTitle("人员信息");
            //4.3 设置文档作者
            si.setAuthor("hangge");
            //4.4设置文档备注
            si.setComments("备注信息暂无");
            //创建Excel表单
            HSSFSheet sheet = workbook.createSheet("2019年人员信息");
            //创建日期显示格式
            HSSFCellStyle dateCellStyle = workbook.createCellStyle();
            dateCellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy"));
            //创建标题的显示样式
            HSSFCellStyle headerStyle = workbook.createCellStyle();
            headerStyle.setFillForegroundColor(IndexedColors.YELLOW.index);
            headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            //定义列的宽度
            sheet.setColumnWidth(0, 5 * 256);
            sheet.setColumnWidth(1, 12 * 256);
            sheet.setColumnWidth(2, 10 * 256);
            sheet.setColumnWidth(3, 5 * 256);
            sheet.setColumnWidth(4, 12 * 256);
            //5.设置表头
            HSSFRow headerRow = sheet.createRow(0);
            HSSFCell cell0 = headerRow.createCell(0);
            cell0.setCellValue("编号");
            cell0.setCellStyle(headerStyle);
            HSSFCell cell1 = headerRow.createCell(1);
            cell1.setCellValue("姓名");
            cell1.setCellStyle(headerStyle);
            HSSFCell cell2 = headerRow.createCell(2);
            cell2.setCellValue("工号");
            cell2.setCellStyle(headerStyle);
            HSSFCell cell3 = headerRow.createCell(3);
            cell3.setCellValue("性别");
            cell3.setCellStyle(headerStyle);
            HSSFCell cell4 = headerRow.createCell(4);
            cell4.setCellValue("出生日期");
            cell4.setCellStyle(headerStyle);
            //6.装数据
            for (int i = 0; i < users.size(); i++) {
                HSSFRow row = sheet.createRow(i + 1);
                UserEx UserEx = users.get(i);
//                row.createCell(0).setCellValue(UserEx.getId());
//                row.createCell(1).setCellValue(UserEx.getName());
//                row.createCell(2).setCellValue(UserEx.getWorkID());
//                row.createCell(3).setCellValue(UserEx.getGender());
                row.createCell(0).setCellValue("id");
                row.createCell(1).setCellValue("name");
                row.createCell(2).setCellValue("name");
                row.createCell(3).setCellValue(UserEx.getBirthday());
//                HSSFCell birthdayCell = row.createCell(4);
                HSSFCell birthdayCell = row.createCell(4);
                birthdayCell.setCellValue(UserEx.getBirthday());
                birthdayCell.setCellStyle(dateCellStyle);
            }
            headers = new HttpHeaders();
//            headers.setContentDispositionFormData("attachment", java.net.URLEncoder.encode("人员信息表.xls", "UTF-8"));
//            headers.setContentDispositionFormData("attachment",
//                    new String("人员信息表.xls".getBytes("UTF-8"), "iso-8859-1"));
//--------------------------------
         baos1 = new ByteArrayOutputStream();
            HttpHeaders headers1 = new HttpHeaders();
            // headers.add("Content-Type", "application/octet-stream;charset=utf-8");
            headers.add("Content-Type", "application/vnd.ms-excel");
            headers.add("Connection", "close");
            headers.add("Accept-Ranges", "bytes");
            headers.add("Content-Disposition", "attachment;filename="
                    + new String(fileName.getBytes("GBK"), "ISO-8859-1"));
            workbook.write(baos1);





        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<byte[]>(baos1.toByteArray(), headers, HttpStatus.CREATED);
//        return new ResponseEntity<byte[]>(baos.toByteArray(), headers, HttpStatus.CREATED);
    }
}
