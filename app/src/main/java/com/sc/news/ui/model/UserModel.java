package com.sc.news.ui.model;

import android.content.Context;

import com.sc.news.db.DBManager;
import com.sc.news.db.User;
import com.sc.news.ui.contract.UserContract;

/**
 * Created by Shen Chao.
 * Create at  2017-01-17-017
 */
public class UserModel implements UserContract.Model {
    @Override
    public User query(String userName, String passWord, Context context) {
        DBManager dbManager = DBManager.getDbManager(context);
        User user = dbManager.queryUser(userName, passWord);
        return user;
    }
}
