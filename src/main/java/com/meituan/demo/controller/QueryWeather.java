package com.meituan.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static com.mysql.cj.conf.PropertyKey.logger;


/****
 * 获取城市天气信息
 */
@RestController
public class QueryWeather {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/get/{city}",produces = "application/json; carset=utf-8", method = RequestMethod.GET)
    public String extern(@PathVariable("city") String city) {
        String apiURL = "http://wthrcdn.etouch.cn/weather_mini?city=" + city;
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiURL, String.class);

        if (200 == responseEntity.getStatusCodeValue()) {
System.out.println(""+ responseEntity.getBody());
            return responseEntity.getBody();
        } else {
            return "error with code : " + responseEntity.getStatusCodeValue();
        }
    }
}
