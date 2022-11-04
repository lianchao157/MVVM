package com.meituan.demo.server.impl;

import com.meituan.demo.bean.User;
import com.meituan.demo.mapper.ReginUser_Mapper;
import com.meituan.demo.server.ReginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ReginServiceImpl implements ReginService{
  @Autowired
private ReginUser_Mapper reginUser_mapper;

    @Override
    public boolean UserReginService(User muser) {
        boolean inserresult=reginUser_mapper.Regin(muser);

        return inserresult;
    }
}
