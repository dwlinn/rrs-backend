package com.example.common;

import lombok.Data;

@Data
public class Result {
    private static final String SUCCEES = "200";
    private static final String FAILED = "100";
    private static final String ERROR_CODE = "-1";


    private String code;
    private Object data;
    private String msg;
//
//    public Result(String code, Object data, String msg) {
//        this.code = code;
//        this.data = data;
//        this.msg = msg;
//    }
//
//    public Result(String code, Object data) {
//        this.code = code;
//        this.data = data;
//    }

    public static Result success(){
        Result result = new Result();
        result.setCode(SUCCEES);
        return result;
    }

    public static Result success(Object data){
        Result result = new Result();
        result.setCode(SUCCEES);
        result.setData(data);
        return result;
    }

    public static Result failed(String msg){
        Result result = new Result();
        result.setCode(FAILED);
        result.setMsg(msg);
        return result;
    }

    public static Result failed(){
        Result result = new Result();
        result.setCode(FAILED);
        return result;
    }

    public static Result error(String msg) {
        Result result = new Result();
        result.setCode(ERROR_CODE);
        result.setMsg(msg);
        return result;
    }

    public static Result error(String code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
