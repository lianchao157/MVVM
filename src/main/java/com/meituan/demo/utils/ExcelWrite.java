package com.meituan.demo.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.List;

public  class  ExcelWrite {

        /****
         * 导出文档可用
         * @param array
         * @param list
         * @return
         */
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
//        -----------------------------------
//        ©著作权归作者所有：来自51CTO博客作者道祖且长的原创作品，请联系作者获取转载授权，否则将追究法律责任
//        Spring boot实现Excel导出文件
//        https://blog.51cto.com/u_14486541/5369928


}
