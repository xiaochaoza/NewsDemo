package com.sc.news.ui.fragment;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sc.news.R;
import com.sc.news.base.BaseFragment;
import com.sc.news.bean.News;
import com.sc.news.ui.activity.NewsDetailActivity;
import com.sc.news.ui.adapter.NewsRecyclerAdapter;
import com.sc.news.ui.contract.NewsContract;
import com.sc.news.ui.model.NewsModel;
import com.sc.news.ui.presenter.NewsPresenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Shen Chao.
 * Create at  2017-01-16-016
 */
public class NewsFragment extends BaseFragment<NewsContract.Presenter, NewsContract.Model>
        implements NewsContract.View, NewsRecyclerAdapter.OnItemClickListener {
    @BindView(R.id.rv_list)
    RecyclerView recyclerView;
    @BindView(R.id.swipe)
    SwipeRefreshLayout refreshLayout;
    private String channelName;
    private List<News.ResultBean.DataBean> dataBeanList;
    private NewsRecyclerAdapter adapter;

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_tab;
    }

    @Override
    protected void initPM() {
        mModel = new NewsModel();
        mPresenter = new NewsPresenter(this, mModel);
    }

    @Override
    protected void initView() {
        if (getArguments() != null) {
            channelName = getArguments().getString("type");
        }
        refreshLayout.setOnRefreshListener(() -> mPresenter.getNews(channelName));
        dataBeanList = new ArrayList<>();
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new NewsRecyclerAdapter(getContext(), dataBeanList, R.layout.adapter_news_list);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(this);
        if (dataBeanList.size() <= 0) {
            mPresenter.getNews(channelName);
            startLoading();
        }
    }

    @Override
    public void startLoading() {
        if (!refreshLayout.isRefreshing()) {
            refreshLayout.setRefreshing(true);
        }
    }

    @Override
    public void finishLoading() {
        if (refreshLayout.isRefreshing()) {
            refreshLayout.setRefreshing(false);
        }
    }

    @Override
    public void onItemClick(View view, int position) {
        Bundle b = new Bundle();
        b.putSerializable("data", dataBeanList.get(position));
        startActivity(NewsDetailActivity.class, b);
    }

    @Override
    public void showNews(List<News.ResultBean.DataBean> list) {
        adapter.clearData();
        for (int i = 0; i < list.size(); i++) {
            adapter.addData(list.get(i), i);
        }
    }

}
