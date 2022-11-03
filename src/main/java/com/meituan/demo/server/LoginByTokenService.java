package com.meituan.demo.server;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.meituan.demo.bean.CreateLoginTime;

import java.util.List;

public interface LoginByTokenService {
    public String getToken(String name, String password);

}
