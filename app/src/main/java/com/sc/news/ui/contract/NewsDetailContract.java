package com.sc.news.ui.contract;

import com.sc.news.base.BaseModel;
import com.sc.news.base.BasePresenter;
import com.sc.news.base.BaseView;

/**
 * Created by Shen Chao.
 * Create at  2017-01-16-016
 */
public interface NewsDetailContract {
    interface View extends BaseView {

    }

    interface Model extends BaseModel {

    }

    abstract class Presenter extends BasePresenter<View, Model> {
        public Presenter(View view, Model model) {
            super(view, model);
        }
    }
}
