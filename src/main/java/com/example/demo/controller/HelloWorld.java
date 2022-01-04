package com.example.demo.controller;

import com.example.demo.service.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@ResponseBody
//@Controller
@Controller
public class HelloWorld {
    @Autowired
    public test one;
    @RequestMapping
    public String test(){
        return "index";
    }
    @ResponseBody
    @GetMapping("/test2")
    public String add(){
       return one.getName()+":"+one.getPassword();
    }
    @ResponseBody
    @PostMapping("/test2")
    public String delete(){
        return "A";
    }

}
