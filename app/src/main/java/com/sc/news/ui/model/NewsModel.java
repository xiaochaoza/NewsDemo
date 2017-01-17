package com.sc.news.ui.model;

import com.sc.news.Api.AppConfig;
import com.sc.news.bean.News;
import com.sc.news.network.HttpMethods;
import com.sc.news.ui.contract.NewsContract;

import java.util.List;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Shen Chao.
 * Create at  2017-01-16-016
 */
public class NewsModel implements NewsContract.Model {
    @Override
    public Observable<List<News.ResultBean.DataBean>> getNews(String type) {
        return HttpMethods.getInstance()
                .getNews(type, AppConfig.APIKEY)
                .map(news -> news.getResult().getData())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
