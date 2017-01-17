package com.sc.news.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.sc.news.Api.AppConfig;
import com.sc.news.R;
import com.sc.news.base.BaseActivity;
import com.sc.news.db.User;
import com.sc.news.ui.adapter.NewsFragmentAdapter;
import com.sc.news.ui.fragment.NewsFragment;
import com.sc.news.utils.RxBus;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UmengTool;
import com.umeng.socialize.bean.SHARE_MEDIA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class MainActivity extends BaseActivity {

    @BindView(R.id.toolBar)
    Toolbar toolBar;
    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.iv_main)
    ImageView ivMain;
    @BindView(R.id.nav_view)
    NavigationView navView;
    @BindView(R.id.drawerLayout)
    DrawerLayout drawerLayout;
    private NewsFragmentAdapter fragmentAdapter;
    private List<Fragment> fragmentList;
    private Subscription subscription;

    private UMAuthListener umAuthListener = new UMAuthListener() {
        @Override
        public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {
            Toast.makeText(getApplicationContext(), "Authorize succeed", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onError(SHARE_MEDIA share_media, int i, Throwable throwable) {
            Toast.makeText(getApplicationContext(), "Authorize onError", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onCancel(SHARE_MEDIA share_media, int i) {
            Toast.makeText(getApplicationContext(), "Authorize onCancel", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void setNavigation() {
        navView.setNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.nav_regist:
                    startMyActivity(item.getItemId());
                    break;
                case R.id.nav_three_login:
                    startMyActivity(item.getItemId());
                    break;
                case R.id.nav_three_weixin:
                    item.setChecked(true);
                    UmengTool.getSignature(MainActivity.this);
                    break;
                case R.id.nav_three_QQ:
                    item.setChecked(true);
                    UmengTool.getSignature(MainActivity.this);
                    break;
                case R.id.nav_unregist:
                    User u = new User();
                    u.setLogin(false);
                    RxBus.getDefault().post(u);
                    drawerLayout.closeDrawer(navView);
                    ImageView iv_main = (ImageView) findViewById(R.id.iv_main);
                    ImageView iv_title = (ImageView) findViewById(R.id.iv_nav_header);
                    TextView tv_login_name = (TextView) findViewById(R.id.tv_login_name);
                        iv_main.setImageResource(R.mipmap.grid);
                        iv_title.setImageResource(R.mipmap.error);
                        tv_login_name.setText("");
                    break;
            }
            return true;
        });
    }

    private void startMyActivity(int itemId) {
        drawerLayout.closeDrawer(navView);
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        intent.putExtra("itemId", itemId);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void initPM() {

    }

    @Override
    protected void initView() {
        toolBar.setTitle(getString(R.string.app_name));
        setSupportActionBar(toolBar);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        fragmentList = new ArrayList<>(AppConfig.CHANNELS_KEYS.length);
        for (int i = 0; i < AppConfig.CHANNELS_KEYS.length; i++) {
            tabLayout.addTab(tabLayout.newTab().setText(AppConfig.CHANNELS[i]));
            NewsFragment fragment = new NewsFragment();
            Bundle b = new Bundle();
            b.putString("type", AppConfig.CHANNELS_KEYS[i]);
            fragment.setArguments(b);
            fragmentList.add(fragment);
        }
        fragmentAdapter = new NewsFragmentAdapter(
                getSupportFragmentManager(),
                fragmentList,
                Arrays.asList(AppConfig.CHANNELS));
        viewPager.setAdapter(fragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);
        checkLogin();
    }

    private void checkLogin() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }


    @OnClick(R.id.iv_main)
    public void onClick() {
        drawerLayout.openDrawer(navView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        subscription = RxBus.getDefault().toObservable(User.class)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<User>() {
                    @Override
                    public void call(User user) {
                        ImageView iv_main = (ImageView) findViewById(R.id.iv_main);
                        ImageView iv_title = (ImageView) findViewById(R.id.iv_nav_header);
                        TextView tv_login_name = (TextView) findViewById(R.id.tv_login_name);
                        iv_main.setImageResource(R.mipmap.user);
                        iv_title.setImageResource(R.mipmap.user);
                        tv_login_name.setText(user.getUserName());
                        if (!user.getIsLogin()) {
                            iv_main.setImageResource(R.mipmap.grid);
                            iv_title.setImageResource(R.mipmap.error);
                            tv_login_name.setText("");
                        }
                    }
                });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (!subscription.isUnsubscribed()) {
            subscription.isUnsubscribed();
        }
    }
}
