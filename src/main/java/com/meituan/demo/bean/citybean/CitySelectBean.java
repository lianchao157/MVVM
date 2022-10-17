package com.meituan.demo.bean.citybean;

import java.io.Serializable;

/***
 * 2021.11.3
 * 城市选择
 * https://blog.csdn.net/qq_44742816/article/details/103349260
 */
public class CitySelectBean implements Serializable {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public CitySelectBean(int id, String name, int parent_id) {
        this.id = id;
        this.name = name;
        this.parent_id = parent_id;
    }

    private int id;
    private String name;
    private int parent_id;


}
