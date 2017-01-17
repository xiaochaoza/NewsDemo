package com.sc.news.ui.adapter;

import android.content.Context;
import android.support.v4.content.ContentResolverCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.sc.news.R;
import com.sc.news.bean.News;

import java.util.List;

/**
 * Created by Shen Chao.
 * Create at  2017-01-16-016
 */
public class NewsRecyclerAdapter extends RecyclerView.Adapter<NewsRecyclerAdapter.ViewHolder> {
    private LayoutInflater layoutInflater;
    private int layoutID;
    private List<News.ResultBean.DataBean> dataBeanList;
    private Context context;

    private OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public NewsRecyclerAdapter(Context context, List<News.ResultBean.DataBean> dataBeanList
            , int layoutID) {
        this.context = context;
        this.dataBeanList = dataBeanList;
        this.layoutID = layoutID;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolder viewHolder = new ViewHolder(layoutInflater.inflate(layoutID, parent, false));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        News.ResultBean.DataBean data = dataBeanList.get(position);
        holder.tv_title.setText(data.getTitle());
        holder.tv_time.setText(data.getDate());
        Glide.with(context)
                .load(data.getThumbnail_pic_s())
                .crossFade()
                .into(holder.iv_news);
        if (onItemClickListener != null) {
            holder.cardView.setOnClickListener(v -> {
                        int pos = holder.getAdapterPosition();
                        onItemClickListener.onItemClick(v, pos);
                    }
            );
        }
    }

    public void addData(News.ResultBean.DataBean data, int position) {
        dataBeanList.add(data);
        notifyItemInserted(position);
    }

    public void clearData() {
        notifyItemRangeRemoved(0, dataBeanList.size());
        if (dataBeanList.size() > 0) {
            dataBeanList.clear();
        }
    }

    @Override
    public int getItemCount() {
        return dataBeanList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_news;
        TextView tv_title, tv_time;
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
            iv_news = (ImageView) itemView.findViewById(R.id.iv_news);
            tv_title = (TextView) itemView.findViewById(R.id.tv_title);
            tv_time = (TextView) itemView.findViewById(R.id.tv_time);
        }
    }
}
