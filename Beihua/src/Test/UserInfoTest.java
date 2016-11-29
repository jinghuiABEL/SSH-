import cn.keshe.Action.Useraction;
import cn.keshe.Dao.BaseDao;
import cn.keshe.model.Users;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.xml.ws.Action;

/**
 * Created by ABEL on 2016/11/6.
 */


public class UserInfoTest {
    ClassPathXmlApplicationContext  ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    BaseDao baseDao = (BaseDao) ctx.getBean("baseDao");
    @Test
    public  void  addTest(){

        Users user =new Users();
        user.setUser_username("ll");
        user.setUser_passWord("123");
        user.setUser_email("mmmmm");

        baseDao.save(user);
    }

    @Test
    public  void  updateTest(){

        Users user =new Users();
        user.setUser_username("ll1");
        user.setUser_passWord("456");
        user.setUser_email("mmm");

        baseDao.update(user);
    }

    @Test
    public void deleteTest(){
        baseDao.deleteById(Users.class,"lll");
    }

}
