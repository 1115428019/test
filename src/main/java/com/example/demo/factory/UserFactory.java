package com.example.demo.factory;

import com.example.demo.dao.UserDao;

import static java.lang.Class.forName;

public class UserFactory {
    public  static UserDao getUserDao() throws ClassNotFoundException {
        String ljy_s_bdz = "com.example.demo.dao.UserDao";
        Class test = forName(ljy_s_bdz);
        try {
            return (UserDao)test.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
