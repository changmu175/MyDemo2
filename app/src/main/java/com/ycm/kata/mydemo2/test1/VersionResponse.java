package com.ycm.kata.mydemo2.test1;

import com.ycm.kata.mydemo2.bean.Version;
import com.ycm.kata.networkmodule.model.ApiResult;

/**
 * Created by changmuyu on 2017/11/15.
 * Description:
 */

public class VersionResponse extends ApiResult<Version> {
    Version version;
    boolean needForceUpdate;

    @Override
    public void setData(Version data) {
        super.setData(data);
    }

    @Override
    public Version getData() {
        return version;
    }
}
