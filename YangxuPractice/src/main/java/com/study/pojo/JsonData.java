package com.study.pojo;

import java.io.Serializable;

/**
 * @author Google
 */
public class JsonData implements Serializable {
    private static final long serialVersionUID = 123124561L;
    //状态码,0表示成功，-1表示失败
    private int result;
    //错误描述
    private String message;
    //结果
    private Object data;

    public static JsonData success(int result, String message, Object object) {
        JsonData jsonData = new JsonData();
        jsonData.setResult(result);
        jsonData.setMessage(message);
        jsonData.setData(object);
        return jsonData;
    }

    public static JsonData success(Object object) {
        return success(1,"success",object);
    }

    public static JsonData success() {
        return success(null);
    }

    public static JsonData success(String message) {
        return success(1, message, null);
    }

    public static JsonData error(int result, String message, Object object) {

        JsonData jsonData = new JsonData();
        jsonData.setResult(result);
        jsonData.setMessage(message);
        jsonData.setData(object);
        return jsonData;
    }


    public static JsonData error(int result, String message) {

        JsonData jsonData = new JsonData();
        jsonData.setResult(result);
        jsonData.setMessage(message);
        return jsonData;
    }

    public static JsonData error(String message) {
        JsonData jsonData = new JsonData();
        jsonData.setResult(0);
        jsonData.setMessage(message);
        return jsonData;
    }

    public static JsonData error() {
        JsonData jsonData = new JsonData();
        jsonData.setResult(0);
        jsonData.setMessage("failed");
        return jsonData;
    }
    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
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
}
