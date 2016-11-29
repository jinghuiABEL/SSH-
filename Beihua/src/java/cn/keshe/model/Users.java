package cn.keshe.model;

import javax.persistence.*;

/**
 * Created by ABEL on 2016/11/6.
 */

@Entity
@Table(name="userInfo",schema = "",catalog = "db")
public class Users {
    private String user_username;
    private String  user_passWord;
    private String user_email;

    @Basic
    @Column(name="user_email", nullable = false)
    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    @Id
    @Column(name="user_username",nullable = false,length = 16)
    public String getUser_username() {
        return user_username;
    }

    public void setUser_username(String user_username) {
        this.user_username = user_username;
    }



    @Basic
    @Column(name="user_passWord" ,nullable = false)
    public String getUser_passWord() {
        return user_passWord;
    }

    public void setUser_passWord(String user_passWord) {
        this.user_passWord = user_passWord;
    }



}
