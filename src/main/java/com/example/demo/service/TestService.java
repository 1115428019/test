package com.example.demo.service;

import com.example.demo.dao.TestDao;
import com.example.demo.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    TestDao testDao;

    public TestModel getById(long id){
       return  testDao.getById(id);
    }

    public  void saveTestData(TestModel testModel){
        testModel.setId(testDao.countNumber());
        testDao.insertTest(testModel);
    }

    public void  deleteTestData(int id){
        testDao.delete(id);
    }

    public void updateTestData(TestModel testModel){
        testDao.update(testModel);
    }
}
