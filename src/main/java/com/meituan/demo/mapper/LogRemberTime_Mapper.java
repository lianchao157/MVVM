package com.meituan.demo.mapper;

import com.meituan.demo.bean.CreateLoginTime;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LogRemberTime_Mapper {
    /***
     * 记录用户的每次使用时间
     * @param userno
     * @return
     */
    int insertlogintime(String userno);

    /***
     * 降序排列出用户数据
     * @param userno
     * @return
     */
    List<CreateLoginTime>  resultdata(String userno);

}
