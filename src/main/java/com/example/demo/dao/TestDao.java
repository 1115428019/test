package com.example.demo.dao;


import com.example.demo.model.TestModel;
import org.apache.ibatis.annotations.*;

@Mapper
public interface TestDao {
    @Select("Select * from testtable where id=#{id}")
    public TestModel getById(long id);

    @Select("Select count(*) from testtable")
    public int countNumber();

    @Insert("Insert into testtable(name,price,weight,height,id)  values(#{name},#{price},#{weight},#{height},#{id})")
    public void insertTest(TestModel testModel);

    @Delete("Delete from testtable where id=#{id}")
    public void delete(int id);

    @Update("Update testtable set name=#{name},price=#{price},height=#{height},weight=#{weight} where id=#{id}")
    public void update(TestModel testModel);
}
