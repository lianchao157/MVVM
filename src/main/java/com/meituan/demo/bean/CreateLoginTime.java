package com.meituan.demo.bean;

import java.util.Date;

public class CreateLoginTime {
    private  int loginno;
    private int  lgcustomer;

    public CreateLoginTime() {
    }

    public CreateLoginTime(int loginno, int lgcustomer, Date logintime) {
        this.loginno = loginno;
        this.lgcustomer = lgcustomer;
        this.logintime = logintime;
    }

    public int getLoginno() {
        return loginno;
    }

    public void setLoginno(int loginno) {
        this.loginno = loginno;
    }

    public int getLgcustomer() {
        return lgcustomer;
    }

    public void setLgcustomer(int lgcustomer) {
        this.lgcustomer = lgcustomer;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    private Date logintime;

}
