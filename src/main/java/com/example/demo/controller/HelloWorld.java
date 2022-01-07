package com.example.demo.controller;

import com.example.demo.model.TestModel;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@ResponseBody
//@Controller
@Controller
public class HelloWorld {
    @Autowired
    TestService testService;

    @GetMapping("")
    public String showIndex(){
        return "index";
    }

    @PostMapping("")
    @ResponseBody
    public String saveData(TestModel testModel){
        testService.saveTestData(testModel);
        return "Result: " + testModel.toString();
//        testModel.setId(0);
//        testService.updateTestData(testModel);
//        return "update successfully!";
    }

    @GetMapping("/test")
    public String showTest(){
    return "test";
    }

    @PostMapping("/test")
    @ResponseBody
    public String delete(int id){
        testService.deleteTestData(id);
        return "delete successfully";
    }

}
