package com.sc.news.ui.presenter;

import com.sc.news.ui.contract.NewsDetailContract;

/**
 * Created by Shen Chao.
 * Create at  2017-01-16-016
 */
public class NewsDetailPresenter extends NewsDetailContract.Presenter {
    public NewsDetailPresenter(NewsDetailContract.View view, NewsDetailContract.Model model) {
        super(view, model);
    }
}
