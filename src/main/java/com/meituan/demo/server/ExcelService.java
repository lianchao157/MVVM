package com.meituan.demo.server;

import com.meituan.demo.bean.DataOrderQueryReq;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ExcelService {

 HSSFWorkbook    daoChu(HSSFWorkbook  wk,@RequestBody DataOrderQueryReq req, HttpServletRequest request, HttpServletResponse response);
 //  到文档 2导出文档
 Workbook exportToExcel2();
}
