package com.meituan.demo.server;

import com.meituan.demo.bean.MeiTuan_ShopCar_Bean;
import com.meituan.demo.bean.Meituan_Menum_TitleBean;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Service
public class OperateReadPoiService {

//    @Autowired
//    OperateReadPoiMapper operateReadPoiMapper;
    @Autowired(required = true)
    private MeiTuanShopCarService meiTuanShopCarService;//  接口实现类不导入server包 此处报红
    /**
     * 下载/导出
     * @param response
     */
    public void downLoadExcel(HttpServletResponse response) throws IOException {

        //2007之后的 office
        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("教师信息表");
        System.out.println(sheet);

        //查询到所有教师信息
        List<MeiTuan_ShopCar_Bean> teacherList = meiTuanShopCarService.shopCar_beanList();

        for (MeiTuan_ShopCar_Bean t:teacherList) {
            System.out.println(t);
        }

        //headers表示excel表中第一行的表头
        String[] headers = { "序号", "教师姓名", "年龄", "性别", "手机号", "户籍住址", "现住址", "邮箱","是否在职","教师等级"};

        //在excel表中添加表头
        XSSFRow row = sheet.createRow(0);

        //把headers数组中的数据循环插入到表头中
        for(int i=0;i<headers.length;i++){
            //cell 单元格
            XSSFCell cell = row.createCell(i);
            XSSFRichTextString text = new XSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }
        //新增数据行，并且设置单元格数据
        int rowNum = 1;
        //在表中存放查询到的数据放入对应的列
        for (MeiTuan_ShopCar_Bean teacher : teacherList) {
            XSSFRow row1 = sheet.createRow(rowNum);
            row1.createCell(0).setCellValue(rowNum);
            row1.createCell(1).setCellValue("6");
            row1.createCell(2).setCellValue("7");
            row1.createCell(3).setCellValue("6");
            row1.createCell(5).setCellValue("5");
            row1.createCell(6).setCellValue("4");
            row1.createCell(7).setCellValue("3");
            row1.createCell(8).setCellValue("2");
            row1.createCell(9).setCellValue("1");
            rowNum++;
        }

        //把响应设置为二进制流，一般来说下载文件时有时会用到这段
        response.setContentType("application/octet-stream");

        //设置要导出的文件的名字
        String fileName = "教师信息表"  + ".xlsx";
        response.setContentType("application/x-download");

        //设置响应头
        /*
          这样写会出现错误 response.setHeader("Content-disposition", "attachment;filename=" + fileName);
         下载好的文件名称可能是 _____.xlsx 出现错误
         */
        //response.setHeader("Content-disposition", "attachment;filename=" + fileName);
        /*
            解决
            修改 filename 文件的编码格式
            fileName 修改为 java.net.URLEncoder.encode(fileName, "UTF-8")
            错误解决，nice  author: Ykp
         */
        response.setHeader("Content-disposition", "attachment;filename=" + java.net.URLEncoder.encode(fileName, "UTF-8"));

        try {
            /*
            buffer可以取得的值有两个值
                false 不缓冲。是默认值。服务器在处理脚本的同时将输出发送给客户端
                true  除非当前页的所有asp脚本处理完毕或调用了flush或end方法，否则服务器不将响应发送给客户端
                这里是 false
            */
            //response有个buffer，flushBuffer()会强行把Buffer的 内容写到客户端浏览器
            response.flushBuffer();
            /*
             对于workBook生成字节流，很容易发现有个 workBook.getBytes()，但是，是不可用的，下载以后打不开
             如果下载，正确的写法为 workbook.write(response.getOutputStream());
            */
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //使用完XSSFWorkbook后需要将对象关闭
            workbook.close();
        }



    }
}
