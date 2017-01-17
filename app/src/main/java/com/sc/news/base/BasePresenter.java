package com.sc.news.base;

import android.content.Context;

/**
 * Created by Shen Chao.
 * Create at  2017-01-16-016
 */
public abstract class BasePresenter<V extends BaseView, M extends BaseModel> {
    public V mView;
    public M mModel;
    public Context mContext;

    public BasePresenter(V view, M model) {
        this.mView = view;
        this.mModel = model;
        onStart();
    }

    protected void onStart() {
    }

    protected void onDestroy() {
        mView = null;
    }

}
