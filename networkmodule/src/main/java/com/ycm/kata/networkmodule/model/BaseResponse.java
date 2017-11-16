package com.ycm.kata.networkmodule.model;

/**
 * Created by changmuyu on 2017/11/15.
 * Description:
 */

public class BaseResponse<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
