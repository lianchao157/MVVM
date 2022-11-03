package com.meituan.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
public class UserEx {
    public UserEx(int id, String name, String gender, Date birthday, String workID) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.workID = workID;
    }

    private int id;
    private String name;
    private String gender;
    private Date birthday;

    public UserEx() {
    }

    private String workID;


    public Date getBirthday() {
        return birthday;
    }
}
