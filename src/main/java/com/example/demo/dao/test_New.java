package com.example.demo.dao;

public class test_New {
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    public UserDao getUserDao(){
        return userDao;
    }
    public void add(){
        System.out.println("new test show.......");
        userDao.update();
        userDao.wide_Bean();
    }
}
