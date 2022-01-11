package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;


    public void register(UserModel userModel){
        userDao.insertUser(userModel);
    }

    public int login(UserModel userModel){

        if(userDao.getById(userModel.getId())!=null){
            UserModel userModel2 = userDao.getById(userModel.getId());
            if(userModel2.getPassword().equals(userModel.getPassword()))
                return 1;
            return 0;
        }
        return 0;
    }
}
