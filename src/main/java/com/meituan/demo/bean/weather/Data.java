package com.meituan.demo.bean.weather;

import java.util.List;

public class Data {
    private Yesterday yesterday;

    private String city;

    private List<Forecast> forecast;

    private String ganmao;

    private String wendu;

    public void setYesterday(Yesterday yesterday){
        this.yesterday = yesterday;
    }
    public Yesterday getYesterday(){
        return this.yesterday;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return this.city;
    }
    public void setForecast(List<Forecast> forecast){
        this.forecast = forecast;
    }
    public List<Forecast> getForecast(){
        return this.forecast;
    }
    public void setGanmao(String ganmao){
        this.ganmao = ganmao;
    }
    public String getGanmao(){
        return this.ganmao;
    }
    public void setWendu(String wendu){
        this.wendu = wendu;
    }
    public String getWendu(){
        return this.wendu;
    }
}
