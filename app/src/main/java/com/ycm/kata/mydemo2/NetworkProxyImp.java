package com.ycm.kata.mydemo2;

import com.ycm.kata.mydemo.constant.NetWorkConstants;
import com.ycm.kata.mydemo2.bean.Version;
import com.ycm.kata.mydemo2.test1.VersionResponse;
import com.ycm.kata.networkmodule.NetworkManager;
import com.ycm.kata.networkmodule.callback.CallBackProxy;

/**
 * Created by changmuyu on 2017/11/14.
 * Description:
 */

public class NetworkProxyImp implements NetworkProxyRepository {

    @Override
    public void checkRenewable(int versionCode, CallBackProxy<VersionResponse, Version> callBackProxy) {
        NetworkManager.get(NetWorkConstants.GET_UPDATE_INFO)
                .params("token", "31502c76d2370647c20a5cfb1305bc15be839c53")
                .params("currentVersion", versionCode + "")
                .execute1(callBackProxy);
    }
}
