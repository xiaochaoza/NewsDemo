package com.sc.news.ui.activity;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.sc.news.R;
import com.sc.news.base.BaseActivity;
import com.sc.news.db.DBManager;
import com.sc.news.db.User;
import com.sc.news.ui.contract.UserContract;
import com.sc.news.ui.model.UserModel;
import com.sc.news.ui.presenter.UserPresenter;
import com.sc.news.utils.RxBus;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Shen Chao.
 * Create at  2017-01-17-017
 */
public class LoginActivity extends BaseActivity<UserContract.presenter, UserContract.Model>
        implements UserContract.View {
    @BindView(R.id.et_username)
    EditText etUsername;
    @BindView(R.id.et_password)
    EditText etPassword;
    private int itemId;

    @Override
    protected void initPM() {
        mModel = new UserModel();
        mPresenter = new UserPresenter(this, mModel);
    }

    @Override
    protected void initView() {
        Intent intent = getIntent();
        itemId = intent.getIntExtra("itemId", 0);
        if (itemId == R.id.nav_regist) {
            TextView tv = (TextView) findViewById(R.id.tv_login_title);
            tv.setText("注册");
        } else if (itemId == R.id.nav_three_login) {
            TextView tv = (TextView) findViewById(R.id.tv_login_title);
            tv.setText("登录");
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void login(User user) {
        DBManager dbManager = DBManager.getDbManager(this);
        user.setLogin(true);
        Toast.makeText(this, "登录成功", Toast.LENGTH_LONG).show();
        RxBus.getDefault().post(user);
        dbManager.updateUser(user);
    }

    @Override
    public void startLoading() {

    }

    @Override
    public void finishLoading() {

    }

    @Override
    protected void setNavigation() {

    }

    @OnClick({R.id.ok, R.id.cancel})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ok:
                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString().trim();
                DBManager dbManager = DBManager.getDbManager(this);
                if (TextUtils.isEmpty(username)) {
                    Toast.makeText(this, "用户名不能为空", Toast.LENGTH_LONG).show();
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(this, "密码不能为空", Toast.LENGTH_LONG).show();
                    return;
                }
                if (itemId != 0 && itemId == R.id.nav_regist) {
                    User u = new User();
                    u.setUserName(username);
                    u.setPassWord(password);
                    u.setIsLogin(false);
                    dbManager.insertUser(u);
                    Toast.makeText(this, "注册成功", Toast.LENGTH_LONG).show();
                } else if (itemId != 0 && itemId == R.id.nav_three_login) {
                    mPresenter.query(username, password);
                }
                this.finish();
                break;
            case R.id.cancel:
                this.finish();
                break;
        }
    }
}
