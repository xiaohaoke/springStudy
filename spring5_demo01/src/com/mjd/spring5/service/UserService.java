package com.mjd.spring5.service;

import com.mjd.spring5.dao.UserDao;
import com.mjd.spring5.dao.UserDaoImpl;

public class UserService {

    //创建USerDao类型属性,生成set方法
     private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add()
    {
        System.out.println("service add");
//        //1.创建对象
//        UserDao userDao=new UserDaoImpl();
        userDao.update();

    }
}
