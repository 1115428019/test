package com.example.demo;

import com.example.demo.dao.UserDao;
import com.example.demo.dao.test_New;
import com.example.demo.factory.UserFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public void addUser(){
        System.out.println("Demo.addUser");
        UserDao userDao = UserFactory.getUserDao();
        userDao.addUser();
        userDao.show();
    }
    public void addTest(){
        test_New test_new = UserFactory.getTest_New();
        test_new.add();
    }
    public static void main(String[] args) {
//        new DemoApplication().addUser();
        new DemoApplication().addTest();
        SpringApplication.run(DemoApplication.class, args);
    }

}
