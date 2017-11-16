package com.ycm.kata.mydemo2.test1;

import com.ycm.kata.networkmodule.model.ApiResult;

public class UploadResponse extends ApiResult<String>{
    public String filePath;

    @Override
    public String getData() {
        return filePath;
    }
}