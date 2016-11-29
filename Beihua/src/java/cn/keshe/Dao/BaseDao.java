package cn.keshe.Dao;

import cn.keshe.model.Users;

import java.util.List;

/**
 * Created by ABEL on 2016/11/6.
 */
public interface BaseDao {
    public  void save(Object object);
   public void update(Object object);
    public <T> List<T> findall(String sql);
    public  boolean delete(Object object);
    public  <T> T get(Class<T> tClass, String id);
    public   <T>boolean   deleteById(Class<T> tClass, String id);
    public Users findOnebyKey(String key, String value);
}
