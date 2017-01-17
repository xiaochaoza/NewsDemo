package com.sc.news.base;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Window;

import com.umeng.message.PushAgent;

import butterknife.ButterKnife;

/**
 * Created by Shen Chao.
 * Create at  2017-01-16-016
 */
public abstract class BaseActivity<P extends BasePresenter, M extends BaseModel> extends AppCompatActivity {
    protected P mPresenter;
    protected M mModel;
    public Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(getLayoutId());
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        PushAgent.getInstance(this).onAppStart();
        ButterKnife.bind(this);
        mContext = this;
        initPM();
        if (mPresenter != null) {
            mPresenter.mContext = this;
        }
        initView();
        setBackGesture();
        setNavigation();
    }

    protected abstract void setNavigation();

    protected abstract void initPM();

    protected abstract void initView();

    protected abstract int getLayoutId();

    protected void setBackGesture() {

    }

    protected void startActivity(Class<?> cls, Bundle bundle) {
        Intent intent = new Intent(this, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }
}
