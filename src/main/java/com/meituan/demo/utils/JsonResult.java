package com.meituan.demo.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
//springboot  文件存储

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JsonResult implements Serializable {
    private String code;

    public JsonResult() {
    }

    public JsonResult(String code, String message, Object data) {
        this.code = code;
        this.message = message;

        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private String message;
    private Object data;
}
