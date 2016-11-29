package cn.keshe.Action;

import cn.keshe.Dao.BaseDao;
import cn.keshe.model.Users;
import cn.keshe.service.Service;
import cn.keshe.service.serviceImpl.serviceImpl;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.Authenticator;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
/**
 * Created by ABEL on 2016/11/6.
 */
@Component("userAction")
public class Useraction extends ActionSupport{

    private String user_name;
    private String user_password;
    private String user_email;
    private String user_newpassword;
    private  String result;
    @Autowired
    private  BaseDao baseDao;
   @Autowired
    private Service service;
     //注册

   public String Register() {
       if (user_name == null || user_name == "" || user_name == " ") {
           result = "对不起,用户名不能为空";
           return SUCCESS;
       } else {
           Users user =new Users();
           user.setUser_passWord(user_password);
           user.setUser_email(user_email);
           user.setUser_username(user_name);
           service.save(user);
           result = "恭喜";
           return SUCCESS;
       }
   }
    //用户登录
    public String execute() {
        boolean flag = false;
        if (user_name == null || user_name.trim().equals("")) {
            this.addFieldError("username", "用户名不能为空");
            return "fail";
        } else if (user_password == null || user_password.trim().equals("")) {
            this.addFieldError("password", "密码不能为空");
            return "fail";
        } else {
            flag = service.Login(user_name, user_password);
            System.out.print(flag);
            if (flag) {
                return "success";
            } else {
                return "fail";
            }
        }
    }
     // 注销
    public String  leave() {

        Map session= ActionContext.getContext().getSession();
        session.remove("user");
        return SUCCESS;

    }
    //更改密码
    public void update(){
            if (!service.isExistUsername(user_name)){
                result="用户名不存在";
            }else
            {
            if(user_password.equals(service.getPasswordByUsername(user_name)) ){
                service.modifyPasswordByUsername(user_name,user_newpassword);
            }
            }
    }

    public void setResult(String result) {
        this.result = result;
    }
    public String getResult(){return result;}

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }
    public String getUser_newpassword() {
        return user_newpassword;
    }

    public void setUser_newpassword(String user_newpassword) {
        this.user_newpassword = user_newpassword;
    }


}
