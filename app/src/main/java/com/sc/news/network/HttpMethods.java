package com.sc.news.network;

import com.sc.news.Api.AppConfig;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Shen Chao.
 * Create at  2017-01-16-016
 */
public class HttpMethods {
    private static NewsService newsService;
    private Retrofit retrofit;


    private HttpMethods() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(5, TimeUnit.SECONDS)
                .addInterceptor(interceptor)
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(AppConfig.BASEURL)
                .client(client)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        newsService = retrofit.create(NewsService.class);
    }

    public static NewsService getInstance() {
        if (newsService == null) {
            synchronized (HttpMethods.class) {
                if (newsService == null) {
                    new HttpMethods();
                }
            }
        }
        return HttpMethods.newsService;
    }
}
