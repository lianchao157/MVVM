package com.meituan.demo.mapper;

import com.meituan.demo.bean.CreateLoginTime;
import com.meituan.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional//  事物注解
@Repository
@Mapper
public interface ReginUser_Mapper {
/***
 * 注册使用
 */
public  boolean Regin(User user);

// 注册前先查询
public String seletc();
}
