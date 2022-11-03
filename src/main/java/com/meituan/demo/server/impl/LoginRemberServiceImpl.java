package com.meituan.demo.server.impl;

import com.meituan.demo.bean.CreateLoginTime;
import com.meituan.demo.mapper.LogRemberTime_Mapper;
import com.meituan.demo.server.LoginRemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginRemberServiceImpl implements LoginRemberService {
    @Autowired
    private LogRemberTime_Mapper loginRemberMapper;
    @Override
    public String LoginRember(String userno) {
        System.out.println("用户的账号："+userno);
        int   insertresult=  loginRemberMapper.insertlogintime(userno);

        return String.valueOf(insertresult);
    }

    @Override
    public List<CreateLoginTime> shopcarlist(String Userno) {
        List<CreateLoginTime> shopcarlist=  loginRemberMapper.resultdata(Userno);
        return shopcarlist;
    }
}
