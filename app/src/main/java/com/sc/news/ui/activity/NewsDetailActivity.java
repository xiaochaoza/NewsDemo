package com.sc.news.ui.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.sc.news.R;
import com.sc.news.base.BaseActivity;
import com.sc.news.bean.News;
import com.sc.news.ui.contract.NewsDetailContract;
import com.sc.news.ui.model.NewsDetailModel;
import com.sc.news.ui.presenter.NewsDetailPresenter;

import butterknife.BindView;

/**
 * Created by Shen Chao.
 * Create at  2017-01-16-016
 */
public class NewsDetailActivity extends BaseActivity<NewsDetailContract.Presenter, NewsDetailContract.Model>
        implements NewsDetailContract.View, View.OnTouchListener {
    @BindView(R.id.iv_header)
    ImageView iv_header;
    @BindView(R.id.wv_content)
    WebView webView;
    @BindView(R.id.toolBarLayout)
    CollapsingToolbarLayout toolbarLayout;
    @BindView(R.id.toolBar)
    Toolbar toolbar;
    @BindView(R.id.swipe)
    SwipeRefreshLayout refreshLayout;
    @BindView(R.id.root)
    CoordinatorLayout rootLayout;

    private News.ResultBean.DataBean data;
    float startX, startY;
    boolean isBack;
    long time;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_news_detail;
    }

    @Override
    protected void setNavigation() {

    }

    @Override
    protected void initPM() {
        mModel = new NewsDetailModel();
        mPresenter = new NewsDetailPresenter(this, mModel);
    }

    @Override
    protected void initView() {
        data = (News.ResultBean.DataBean) getIntent().getSerializableExtra("data");
        setSupportActionBar(toolbar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Drawable drawable = toolbar.getNavigationIcon();
        drawable.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(drawable);
        toolbar.setNavigationOnClickListener(v -> finish());
        toolbarLayout.setCollapsedTitleTextColor(Color.WHITE);
        toolbarLayout.setExpandedTitleColor(Color.WHITE);
        toolbarLayout.setTitle(data.getTitle().trim());

        refreshLayout.setEnabled(false);

        Glide.with(this)
                .load(data.getThumbnail_pic_s())
                .crossFade()
                .into(iv_header);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        webView.loadUrl(data.getUrl());
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                refreshLayout.setRefreshing(true);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (refreshLayout.isRefreshing()) {
                    refreshLayout.setRefreshing(false);
                }
            }
        });
    }

    @Override
    protected void setBackGesture() {
        rootLayout.setOnTouchListener(this);
        webView.setOnTouchListener(this);
    }

    @Override
    public void startLoading() {

    }

    @Override
    public void finishLoading() {

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                time = System.currentTimeMillis();
                startX = event.getX();
                startY = event.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                float deltaX = event.getX();
                float deltaY = event.getY();
                float qHalfWidth = rootLayout.getWidth() / 5;
                if (Math.abs(deltaX - startX) > Math.abs(deltaY - startY)
                        && (Math.abs(deltaX - startX) > qHalfWidth)) {
                    isBack = true;
                }
                break;
            case MotionEvent.ACTION_UP:
                if (isBack && System.currentTimeMillis() - time < 1000) {
                    finish();
                } else {
                    isBack = false;
                }
                break;
        }
        return false;
    }
}
