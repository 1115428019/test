package com.example.demo.dao;

import org.springframework.stereotype.Component;

@Component(value = "userDaoImp")
public class UserDaoImp implements UserDao{
    @Override
    public void add() {
        System.out.println("UserDao add.......");
    }
}
