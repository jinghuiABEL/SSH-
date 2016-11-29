package cn.keshe.service.serviceImpl;


import cn.keshe.Dao.BaseDao;
import cn.keshe.model.Users;
import cn.keshe.service.Service;
import com.opensymphony.xwork2.ActionContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by ABEL on 2016/11/8.
 */
@Component
public class serviceImpl  implements Service {


    private BaseDao baseDao;
    @Resource
    public void setBaseDao(BaseDao baseDao) {
        this.baseDao = baseDao;}
    //用户登录
    public boolean Login(String user_name,String  user_password) {

            boolean flag = false;
            String hql = "from  Users where user_username = '"+user_name+"' and  user_passWord='"+user_password+"'";
            List<Users> userList = baseDao.findall(hql);
            if(userList.size()>0){
                flag = true;

                return  flag;
            }
            return flag;
        }
    //用户注册
    public void save(Users user) {
       baseDao.save(user);

    }
     // 通过用户名查找密码
    public String getPasswordByUsername(String user_name){

        return baseDao.findOnebyKey("user_username", user_name).getUser_passWord();
    }
      //修改密码
    public void modifyPasswordByUsername(String user_name,String user_newpassword){
        Users user=baseDao.findOnebyKey("user_username", user_name);
        user.setUser_username(user_name);
        user.setUser_passWord(user_newpassword);
        baseDao.update(user);
    }
      //检查用户名是否存在
     public boolean isExistUsername(String user_name){
         if (baseDao.findOnebyKey("user_username",user_name)==null){
             return false ;
         }
         return true;
     }

}


