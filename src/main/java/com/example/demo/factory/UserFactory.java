package com.example.demo.factory;

import com.example.demo.dao.UserDao;

public class UserFactory {
    public  static UserDao getUserDao(){
        return new UserDao();
    }

}
