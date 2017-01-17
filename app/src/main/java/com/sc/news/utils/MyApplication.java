package com.sc.news.utils;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.umeng.message.IUmengRegisterCallback;
import com.umeng.message.PushAgent;
import com.umeng.socialize.Config;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

/**
 * Created by Shen Chao.
 * Create at  2017-01-16-016
 */
public class MyApplication extends Application {
    private static Application application;

    {
        PlatformConfig.setWeixin("1105878833", "3zqwWkKYJeoFDmKH");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        UMShareAPI.get(this);
        PushAgent mPushAgent = PushAgent.getInstance(this);
        //注册推送服务，每次调用register方法都会回调该接口
        mPushAgent.register(new IUmengRegisterCallback() {

            @Override
            public void onSuccess(String deviceToken) {
                //注册成功会返回device token
            }

            @Override
            public void onFailure(String s, String s1) {
            }
        });

    }

    public static Context getAppContext() {
        return application;
    }
}
