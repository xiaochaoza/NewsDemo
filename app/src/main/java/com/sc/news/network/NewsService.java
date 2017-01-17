package com.sc.news.network;

import com.sc.news.bean.News;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Shen Chao.
 * Create at  2017-01-16-016
 */
public interface NewsService {
    @GET("index")
    Observable<News> getNews(@Query("type") String type, @Query("key") String apiKey);

}
