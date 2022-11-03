package com.meituan.demo.server.impl;

import cn.hutool.poi.excel.ExcelUtil;
import com.meituan.demo.bean.MeiTuan_ShopCar_Bean;
import com.meituan.demo.mapper.MeiTuan_ShopCarMapepr;
import com.meituan.demo.mapper.MeiTuan_mapper;
import com.meituan.demo.server.ResultService;
import com.meituan.demo.utils.LocalJsonUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class resul implements ResultService {
    @Autowired
    private MeiTuan_ShopCarMapepr shopCarMapepr;


    @Override
    public Workbook exportToExcel() {
        String[] arr = {"ID","标题","内容","内容来源","封面图片","创建时间","更新时间","是否删除"};
        //这是具体数据
        List<MeiTuan_ShopCar_Bean> list =  shopCarMapepr.selectallshopcar();
        Workbook workbook = LocalJsonUtil.writeToExcelByList(arr, list , MeiTuan_ShopCar_Bean.class);
        return workbook;
    }
}
