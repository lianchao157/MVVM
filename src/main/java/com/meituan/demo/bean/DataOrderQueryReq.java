package com.meituan.demo.bean;

import lombok.Data;

import java.util.List;
import java.util.Map;
@Data
public class DataOrderQueryReq {
    /**
     * 開始時間
     */
    private String starttime;

    /**
     * 結束時間
     */
    private String endtime;

    /**
     * 時間區間開始
     */
    private String start;

    /**
     * 時間區間結束
     */
    private String end;

    /**
     * 时间范围集合
     */
    private List<Map<String,Object>> timerList;
}
