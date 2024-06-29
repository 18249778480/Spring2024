package com.cn.ning.common.entry;

import java.io.Serializable;

public class Result<T> implements Serializable{

    
    private boolean flag;
    private int resultCode;
    private String message;
    private T data;

    public Result(){

    }

    public Result(boolean flag,int resultCode,String message,T t){
        this.flag=flag;
        this.resultCode = resultCode;
        this.message = message;
        this.data = t;
    }

    public Result(boolean flag,int resultCode,T t){
        this.flag=flag;
        this.resultCode = resultCode;
        this.data = t;
    }

}
