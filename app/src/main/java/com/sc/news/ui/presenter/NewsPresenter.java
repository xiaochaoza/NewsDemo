package com.sc.news.ui.presenter;

import com.sc.news.base.RxSubcribe;
import com.sc.news.bean.News;
import com.sc.news.ui.contract.NewsContract;

import java.util.List;

import rx.Subscriber;

/**
 * Created by Shen Chao.
 * Create at  2017-01-16-016
 */
public class NewsPresenter extends NewsContract.Presenter {
    public NewsPresenter(NewsContract.View view, NewsContract.Model model) {
        super(view, model);
    }

    @Override
    public void getNews(String type) {
        mModel.getNews(type).subscribe(new RxSubcribe<List<News.ResultBean.DataBean>>(mContext) {
            @Override
            protected void _onNext(List<News.ResultBean.DataBean> list) {
                mView.showNews(list);
                mView.finishLoading();
            }
        });
    }
}
