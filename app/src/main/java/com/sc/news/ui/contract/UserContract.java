package com.sc.news.ui.contract;

import android.content.Context;

import com.sc.news.base.BaseModel;
import com.sc.news.base.BasePresenter;
import com.sc.news.base.BaseView;
import com.sc.news.db.User;

/**
 * Created by Shen Chao.
 * Create at  2017-01-17-017
 */
public interface UserContract {
    interface View extends BaseView {
        void login(User user);
    }

    interface Model extends BaseModel {
        User query(String userName,String passWord,Context context);
    }

    abstract class presenter extends BasePresenter<View, Model> {
        public presenter(View view, Model model) {
            super(view, model);
        }

        public abstract void query(String userName,String passWord);
    }
}
