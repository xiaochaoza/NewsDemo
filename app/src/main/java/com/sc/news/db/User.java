package com.sc.news.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Shen Chao.
 * Create at  2017-01-17-017
 */
@Entity
public class User {
    @Id(autoincrement = true)
    private Long id;
    @Property(nameInDb = "user_name")
    private String userName;
    @Property(nameInDb = "pass_word")
    private String passWord;
    @Property(nameInDb = "is_login")
    private boolean isLogin;

    @Generated(hash = 889383988)
    public User(Long id, String userName, String passWord, boolean isLogin) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.isLogin = isLogin;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getIsLogin() {
        return this.isLogin;
    }

    public void setIsLogin(boolean isLogin) {
        this.isLogin = isLogin;
    }
}
