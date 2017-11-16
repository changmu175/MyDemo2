package com.ycm.kata.mydemo2;

import com.ycm.kata.mydemo2.bean.Version;
import com.ycm.kata.mydemo2.test1.VersionResponse;
import com.ycm.kata.networkmodule.callback.CallBackProxy;

/**
 * Created by changmuyu on 2017/11/14.
 * Description:
 */

public interface NetworkProxyRepository {
    void checkRenewable(int versionCode, CallBackProxy<VersionResponse, Version> callBackProxy);
}
