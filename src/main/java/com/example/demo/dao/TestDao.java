package com.example.demo.dao;


import com.example.demo.model.TestModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestDao {
    @Select("Select * from testtable where id=#{id}")
    public TestModel getById(long id);
}
