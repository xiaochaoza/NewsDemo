package com.sc.news.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import org.greenrobot.greendao.query.QueryBuilder;

/**
 * Created by Shen Chao.
 * Create at  2017-01-17-017
 */
public class DBManager {
    public static final String DB_NAME = "db_news";
    private static DBManager dbManager;
    private DaoMaster.DevOpenHelper devOpenHelper;
    private Context context;

    private DBManager(Context context) {
        this.context = context;
        devOpenHelper = new DaoMaster.DevOpenHelper(context, DB_NAME, null);
    }

    /**
     * 获取单例
     *
     * @param context 上下文
     * @return
     */
    public static DBManager getDbManager(Context context) {
        if (dbManager == null) {
            synchronized (DBManager.class) {
                if (dbManager == null) {
                    dbManager = new DBManager(context);
                }
            }
        }
        return dbManager;
    }

    private SQLiteDatabase getReadableDatabase() {
        if (devOpenHelper == null) {
            devOpenHelper = new DaoMaster.DevOpenHelper(context, DB_NAME, null);
        }
        SQLiteDatabase db = devOpenHelper.getReadableDatabase();
        return db;
    }

    private SQLiteDatabase getWritableDatabase() {
        if (devOpenHelper == null) {
            devOpenHelper = new DaoMaster.DevOpenHelper(context, DB_NAME, null);
        }
        SQLiteDatabase db = devOpenHelper.getWritableDatabase();
        return db;
    }

    /**
     * 插入数据
     *
     * @param user
     */
    public void insertUser(User user) {
        DaoMaster daoMaster = new DaoMaster(getWritableDatabase());
        DaoSession daoSession = daoMaster.newSession();
        UserDao userDao = daoSession.getUserDao();
        userDao.insert(user);
    }

    /**
     * 更新数据
     *
     * @param user
     */
    public void updateUser(User user) {
        DaoMaster daoMaster = new DaoMaster(getWritableDatabase());
        DaoSession daoSession = daoMaster.newSession();
        UserDao userDao = daoSession.getUserDao();
        userDao.update(user);
    }

    /**
     * 根据用户名查询数据
     *
     * @return
     */
    public User queryUser(String userName,String passWord) {
        DaoMaster daoMaster = new DaoMaster(getReadableDatabase());
        DaoSession daoSession = daoMaster.newSession();
        UserDao userDao = daoSession.getUserDao();
        QueryBuilder<User> qb = userDao.queryBuilder();
        qb.whereOr(UserDao.Properties.UserName.eq(userName),UserDao.Properties.PassWord.eq(passWord));
        User user = qb.unique();
        return user;
    }

}
