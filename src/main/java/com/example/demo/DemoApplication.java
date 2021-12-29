package com.example.demo;

import com.example.demo.dao.UserDao;
import com.example.demo.factory.UserFactory;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {
    public void addUser(){
        System.out.println("Demo.addUser");
        UserDao userDao = UserFactory.getUserDao();
        userDao.addUser();
    }
    public static void main(String[] args) {
        new DemoApplication().addUser();
        //ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //context.getBean();
        SpringApplication.run(DemoApplication.class, args);
    }

}
