package com.meituan.demo.server;

import com.meituan.demo.bean.CreateLoginTime;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public interface LoginRemberService {
    public String LoginRember(String Userno);

    //    查询某位的登陆记录
    public List<CreateLoginTime> shopcarlist(String Userno);

}
