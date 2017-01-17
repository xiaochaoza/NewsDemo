package com.sc.news.ui.contract;


import com.sc.news.base.BaseModel;
import com.sc.news.base.BasePresenter;
import com.sc.news.base.BaseView;
import com.sc.news.bean.News;

import java.util.List;

import rx.Observable;

/**
 * Created by Shen Chao.
 * Create at  2017-01-16-016
 */
public interface NewsContract {
    interface View extends BaseView {
        void showNews(List<News.ResultBean.DataBean> list);
    }

    interface Model extends BaseModel {
        Observable getNews(String type);
    }

    abstract class Presenter extends BasePresenter<View, Model> {
        public Presenter(View view, Model model) {
            super(view, model);
        }

        public abstract void getNews(String type);
    }
}
