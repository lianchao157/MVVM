package com.meituan.demo.server;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

public interface StudentService {
    Integer importExcel(MultipartFile myFile) throws Exception;
    void exportExcel(HttpServletResponse response) throws Exception;

}

