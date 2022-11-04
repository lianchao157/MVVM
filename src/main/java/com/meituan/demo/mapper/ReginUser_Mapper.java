package com.meituan.demo.mapper;

import com.meituan.demo.bean.CreateLoginTime;
import com.meituan.demo.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReginUser_Mapper {
/***
 * 注册使用
 */
public  boolean Regin(User user);
}
