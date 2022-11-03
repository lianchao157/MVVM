package com.meituan.demo.server;

import com.meituan.demo.bean.MeiTuan_ShopCar_Bean;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultService {
    Workbook exportToExcel();
}
