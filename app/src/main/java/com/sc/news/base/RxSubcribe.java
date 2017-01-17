package com.sc.news.base;

import android.content.Context;
import android.widget.Toast;

import com.sc.news.utils.MyApplication;
import com.sc.news.utils.NetworkUtil;

import rx.Subscriber;

/**
 * Created by Shen Chao.
 * Create at  2017-01-16-016
 */
public abstract class RxSubcribe<T> extends Subscriber<T> {
    private Context mContext;

    public RxSubcribe(Context context) {
        this.mContext = context;
    }

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        Context context = mContext.getApplicationContext();
        if (!NetworkUtil.isNetworkConnected(context)) {
            Toast.makeText(MyApplication.getAppContext(), "当前无网络", Toast.LENGTH_LONG).show();
        } else if (e instanceof Exception) {
            Toast.makeText(context, e.getMessage(), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onNext(T t) {
        _onNext(t);
    }

    protected abstract void _onNext(T t);
}
