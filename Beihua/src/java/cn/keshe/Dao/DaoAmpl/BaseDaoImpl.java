package cn.keshe.Dao.DaoAmpl;

import cn.keshe.Dao.BaseDao;
import cn.keshe.model.Users;
import org.apache.log4j.Logger;
import org.hibernate.annotations.Source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ABEL on 2016/11/6.
 */

@Component ("baseDao")
public class BaseDaoImpl implements BaseDao {


    @Autowired
    private HibernateTemplate hibernateTemplate;


    public void save(Object object) {

        hibernateTemplate.save(object);

    }


    public void update(Object object) {
        hibernateTemplate.update(object);
    }


    public <T> List <T> findall(String sql) {
        List<T> list =(List<T>) hibernateTemplate.find(sql);
        return  list;
    }

    public  boolean delete(Object object){
        hibernateTemplate.delete(object);
        return true;
    }

    public  <T> T get (Class <T>  tClass, String id){
       T t=(T) hibernateTemplate.get(tClass,id);
        return  t;
    }

    public   <T>boolean   deleteById(Class<T> tClass,String id){
        if ( hibernateTemplate.get(tClass,id)==null){
            return  false;
        }
        return delete(hibernateTemplate.get(tClass,id));
    }

    //通过主键来查找密码
    public Users findOnebyKey(String key,String value){
        List <Users> queryResultList=(List<Users>) hibernateTemplate.find("from Users u where u."+key+"=?",value);
        if(queryResultList.size()>0){
            return queryResultList.get(0);
        }
        else{
            return null;
        }
    }



}

