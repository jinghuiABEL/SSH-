package cn.keshe.service;

import cn.keshe.model.Users;

/**
 * Created by ABEL on 2016/11/8.
 */
public interface Service {
    public boolean Login(String user_name,String  user_password);
   void  save(Users users);
    public String getPasswordByUsername(String user_name);
    public void modifyPasswordByUsername(String user_name,String user_newpassword);
    public boolean isExistUsername(String user_name);
}
