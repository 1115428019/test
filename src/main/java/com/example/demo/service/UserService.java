package com.example.demo.service;


import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
//@Component(value = "userService")
public class UserService {
    @Value(value = "dream and reality")
    private String oneDay;
//    @Autowired
//    @Qualifier(value = "userDaoImp")
//    private UserDao userDao;
    @Resource(name = "userDaoImp")
    private UserDao userDao;
    public void add(){
        System.out.println("Service add......."+oneDay);
        userDao.add();
    }
}
