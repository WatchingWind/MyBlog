package com.classmates.blog.common;

import lombok.Data;

/**
 * @auth yangzhiwei
 * @date 2020-11-15 14:18
 */

@Data
public class ResultResponse<T> {
    private T data;
    private int status;
    private String message;

    //Fail-fast
    public final static ResultResponse ERROR = new ResultResponse(500,null);
    public final static ResultResponse SUCCESS = new ResultResponse(200,null);

    public static <T> ResultResponse success(T data) {
        return new ResultResponse(200, data);
    }

    public static <T> ResultResponse success(int status,T data) {
        return new ResultResponse(status, data);
    }


    public static ResultResponse error(int status) {
        return new ResultResponse(status,null);
    }

    public static ResultResponse error(int status,String message) {
        return new ResultResponse(status, message);
    }

    public static <T> ResultResponse error(int status, T data) {
        return new ResultResponse(status, data);
    }

    private ResultResponse(int status,T data) {
        this.status = status;
        this.data = data;
    }

    private ResultResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

}
