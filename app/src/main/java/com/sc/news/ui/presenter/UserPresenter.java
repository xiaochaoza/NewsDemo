package com.sc.news.ui.presenter;

import android.widget.Toast;

import com.sc.news.db.User;
import com.sc.news.ui.contract.UserContract;

/**
 * Created by Shen Chao.
 * Create at  2017-01-17-017
 */
public class UserPresenter extends UserContract.presenter {

    public UserPresenter(UserContract.View view, UserContract.Model model) {
        super(view, model);
    }

    @Override
    public void query(String userName, String passWord) {
        User user = mModel.query(userName, passWord, mContext);
        if (user == null) {
            Toast.makeText(mContext, "用户名或密码错误", Toast.LENGTH_LONG).show();
        } else {
            mView.login(user);
        }
    }


}
