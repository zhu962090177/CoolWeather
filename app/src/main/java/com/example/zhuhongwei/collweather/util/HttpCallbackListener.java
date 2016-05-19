package com.example.zhuhongwei.collweather.util;

/**
 * Created by sunzhengchun on 16/5/18.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
