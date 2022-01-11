package com.example.demo.dao;


import com.example.demo.model.UserModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Insert("Insert into user(id,name,password) values(#{id},#{name},#{password})")
    public void insertUser(UserModel userModel);

    @Select("Select * from user where id=#{id}")
    public UserModel getById(int id);

    @Select("Select * from user where name=#{name}")
    public UserModel findByName(String name);
}
