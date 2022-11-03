package com.meituan.demo.utils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.nio.charset.Charset;
import java.util.List;
public class LocalJsonUtil {
    /**
     * 从指定路径获取JSON并转换为List
     * @param path json文件路径
     * @param elementType List元素类型
     */
    public static  <T> List<T> getListFromJson(String path, Class<T> elementType) {
        ClassPathResource resource = new ClassPathResource(path);
        String jsonStr = IoUtil.read(resource.getStream(), Charset.forName("UTF-8"));
        JSONArray jsonArray = new JSONArray(jsonStr);
        return JSONUtil.toList(jsonArray, elementType);
    }


    public static <T> Workbook writeToExcelByList(String[] array, List<T> list , Class<T> clazz) {
        //创建工作薄
        Workbook wb = new XSSFWorkbook();
        //标题和页码
        CellStyle titleStyle = wb.createCellStyle();
        // 设置单元格对齐方式,水平居左
        titleStyle.setAlignment(HorizontalAlignment.LEFT);
        //单元格边框
        titleStyle.setBorderTop(BorderStyle.THIN);
        titleStyle.setBorderLeft(BorderStyle.THIN);
        titleStyle.setBorderRight(BorderStyle.THIN);
        titleStyle.setBorderBottom(BorderStyle.THIN);
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
        Row row = sheet.createRow(0);
        for (int i = 0; i < array.length; i++) {
            Cell cell = row.createCell(i);
            cell.setCellValue(array[i]);
            cell.setCellStyle(titleStyle);
        }
        // 数据样式 因为标题和数据样式不同 需要分开设置 不然会覆盖
        CellStyle dataStyle = wb.createCellStyle();
        //单元格边框
        dataStyle.setBorderTop(BorderStyle.THIN);
        dataStyle.setBorderLeft(BorderStyle.THIN);
        dataStyle.setBorderRight(BorderStyle.THIN);
        dataStyle.setBorderBottom(BorderStyle.THIN);
        // 设置居中样式，水平居中
        dataStyle.setAlignment(HorizontalAlignment.CENTER);
        //数据从序号1开始
        try {
            int index = 1;
            Field[] fields = clazz.getDeclaredFields();
            for (T t : list) {
                // 默认的行数从0开始，为了统一格式设置从1开始，就是从excel的第二行开始
                row = sheet.createRow(index);
                for (int i = 0; i < fields.length; i++) {
                    // 默认的行数从0开始，为了统一格式设置从1开始，就是从excel的第二行开始
                    Cell cell = row.createCell(i);
                    // 为当前列赋值
                    Field field = fields[i];
                    if (!field.isAccessible()) {
                        field.setAccessible(true);
                    }
                    Object value = (new PropertyDescriptor(field.getName(), clazz)).getReadMethod().invoke(t);
                    setValue(cell , value);
                    //设置数据的样式
                    cell.setCellStyle(dataStyle);
                }
                index++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wb;
    }

    /**
     * 设置cellValue
     * 这里可以根据value的类型，进行格式化，比如日期格式化
     */
    private static void setValue(Cell cell , Object value){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(value != null && !"".equals(value)){
            if(value instanceof Date){
                cell.setCellValue(dateFormat.format(value));
            }else{
                cell.setCellValue(value.toString());
            }
        }
    }
}
