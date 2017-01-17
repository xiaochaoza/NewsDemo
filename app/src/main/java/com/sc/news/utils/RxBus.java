package com.sc.news.utils;

import rx.Observable;
import rx.subjects.PublishSubject;
import rx.subjects.SerializedSubject;
import rx.subjects.Subject;

/**
 * Created by Shen Chao.
 * Create at  2017-01-16-016
 */
public class RxBus {
    private static volatile RxBus rxBus;
    private final Subject<Object, Object> bus;

    private RxBus() {
        bus = new SerializedSubject<>(PublishSubject.create());
    }

    public static RxBus getDefault() {
        if (rxBus == null) {
            synchronized (RxBus.class) {
                if (rxBus == null) {
                    rxBus = new RxBus();
                }
            }
        }
        return rxBus;
    }

    /**
     * 发送事件
     *
     * @param o object对象
     */
    public void post(Object o) {
        bus.onNext(o);
    }

    public <T> Observable<T> toObservable(final Class<T> eventType) {
        return bus.ofType(eventType);
//        return bus.filter(new Func1<Object, Boolean>() {
//            @Override
//            public Boolean call(Object o) {
//                return eventType.isInstance(o);
//            }
//        }).cast(eventType);
    }

}
