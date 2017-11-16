package com.ycm.kata.mydemo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ycm.kata.mydemo.constant.NetWorkConstants;
import com.ycm.kata.mydemo2.bean.Question;
import com.ycm.kata.mydemo2.bean.Version;
import com.ycm.kata.mydemo2.test1.QuestionResponse;
import com.ycm.kata.mydemo2.test1.TestApiResult1;
import com.ycm.kata.mydemo2.test1.VersionResponse;
import com.ycm.kata.networkmodule.NetworkManager;
import com.ycm.kata.networkmodule.callback.CallBackProxy;
import com.ycm.kata.networkmodule.callback.SimpleCallBack;
import com.ycm.kata.networkmodule.exception.ApiException;
import com.ycm.kata.networkmodule.model.HttpParams;

import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTestOne(View view) {
        //方式一
        NetworkManager.get(NetWorkConstants.GET_QUESTION_TO_ME/*"v2/5a0b9a733200004c14e96441"*/)
//                .readTimeOut(30 * 1000)//局部定义读超时
//                .writeTimeOut(30 * 1000)
//                .connectTimeout(30 * 1000)
                .params("token", "31502c76d2370647c20a5cfb1305bc15be839c53")
//                .params("dtype", "json")
//                .params("key", "5682c1f44a7f486e40f9720d6c97ffe4")
//        new CallBackProxy<TestApiResult3<CacheResult<List<GwclBean>>>,
//                CacheResult<List<GwclBean>>>(new SimpleCallBack<CacheResult<List<GwclBean>>>()
                .execute1(new CallBackProxy<TestApiResult1<List<Question>>,
                        List<Question>>(new SimpleCallBack<List<Question>>() {
                    @Override
                    public void onError(ApiException e) {

                    }

                    @Override
                    public void onSuccess(List<Question> listCacheResult) {

                    }
                }) {
                });
    }

    public static <T> Type findNeedClass(Class<T> cls) {
        //以下代码是通过泛型解析实际参数,泛型必须传
        Type genType = cls.getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        Type type = params[0];
        Type finalNeedType;
        if (params.length > 1) {//这个类似是：CacheResult<SkinTestResult> 2层
            if (!(type instanceof ParameterizedType)) throw new IllegalStateException("没有填写泛型参数");
            finalNeedType = ((ParameterizedType) type).getActualTypeArguments()[0];
            //Type rawType = ((ParameterizedType) type).getRawType();
        } else {//这个类似是:SkinTestResult  1层
            finalNeedType = type;
        }
        return finalNeedType;
    }

    public void onTestTwo(View view) {
        new NetworkProxyImp().checkRenewable(6,
                new CallBackProxy<VersionResponse, Version>(new SimpleCallBack<Version>() {
                    @Override
                    public void onError(ApiException e) {

                    }

                    @Override
                    public void onSuccess(Version version) {

                    }
                }) {
                });
    }

    public void onTestThree(View view) {
//        "reward": 8,
//                "content": "JulKKKKKKnozzle咯哦哦空壳哦哦哦哦哦",
//                "type": "0",
//                "id": 19890093,
//                "token": "31502c76d2370647c20a5cfb1305bc15be839c53",
//                "_elapsed": 0
        long id = 19890245;
        createQuestion(id, "","JulKKKKKKnozzle咯哦哦空壳哦哦哦哦哦", "", (byte)0,3L, 0 );
    }
    public void createQuestion(long userId,
                               String title,
                               String content,
                               String mediaUrl,
                               byte type,
                               long reward,
                               long orderId) {
        HttpParams httpParams = new HttpParams();
        httpParams.put("id", userId+"");
        httpParams.put("content", content);
        httpParams.put("type", type + "");
        httpParams.put("reward", reward + "");
        httpParams.put("token", "e3a4c0234b4cf055d95a4ea1eb98dca4c2941c2c");
        if (orderId != 0) {
            httpParams.put("orderId", orderId + "");
        }
        Gson gson = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.FINAL, Modifier.TRANSIENT, Modifier.STATIC)
                .serializeNulls()
                .create();
        String json = gson.toJson(httpParams.urlParamsMap);
        NetworkManager
                .post(NetWorkConstants.QUESTION_AND_ORDER).upJson(json)
                .params(httpParams)
                .execute1(new CallBackProxy<QuestionResponse, Question>(new SimpleCallBack<Question>() {
                    @Override
                    public void onError(ApiException e) {

                    }

                    @Override
                    public void onSuccess(Question question) {

                    }
                }) {
                });
    }

    public void onTestFour(View view) {
        Intent intent = new Intent();
        intent.setClass(getBaseContext(), DownloadActivity.class);
        startActivity(intent);
    }

    public void onTestFive(View view) {
        Intent intent = new Intent();
        intent.setClass(getBaseContext(), UploadActivity.class);
        startActivity(intent);
    }
}
