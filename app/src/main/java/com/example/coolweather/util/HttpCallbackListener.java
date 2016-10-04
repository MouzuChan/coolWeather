package com.example.coolweather.util;

/**
 * Created by chen on 2016/9/30.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
