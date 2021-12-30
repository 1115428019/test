package com.example.demo.factory;

import com.example.demo.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserFactory {
    public  static  UserDao getUserDao() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserDao uu = context.getBean("ljy_s_bdz",UserDao.class);
        return uu;
    }
}
