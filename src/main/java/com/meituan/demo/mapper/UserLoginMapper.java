package com.meituan.demo.mapper;

import com.meituan.demo.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginMapper {
    @Select("select * from userinfobyweb where username=#{username}")
    User findByUsernametest(@Param("username") String username);//  查询所有



}
