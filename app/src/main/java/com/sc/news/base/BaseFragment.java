package com.sc.news.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sc.news.utils.RxBus;

import butterknife.ButterKnife;

/**
 * Created by Shen Chao.
 * Create at  2017-01-16-016
 */
public abstract class BaseFragment<P extends BasePresenter, M extends BaseModel> extends Fragment {
    protected P mPresenter;
    protected M mModel;
    protected View rootView;
    private RxBus rxBus = RxBus.getDefault();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(getLayoutID(), container, false);
        }
        ButterKnife.bind(this, rootView);
        initPM();
        if (mPresenter != null) {
            mPresenter.mContext = getActivity();
        }
        initView();
        return rootView;
    }

    protected abstract int getLayoutID();

    protected abstract void initPM();

    protected abstract void initView();

    protected void startActivity(Class<?> cls, Bundle bundle) {
        Intent intent = new Intent(getActivity(), cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mPresenter != null) {
            mPresenter.onDestroy();
        }
    }
}
