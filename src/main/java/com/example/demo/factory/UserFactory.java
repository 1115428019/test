package com.example.demo.factory;

import com.example.demo.dao.UserDao;
import com.example.demo.dao.test_New;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserFactory {
    public  static  UserDao getUserDao() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserDao uu = context.getBean("ljy_s_bdz",UserDao.class);
        return uu;
    }
    public static test_New getTest_New(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        test_New u = context.getBean("test_new",test_New.class);
        return u;
    }
}
