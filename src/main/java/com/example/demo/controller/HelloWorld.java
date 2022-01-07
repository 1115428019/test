package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

//@ResponseBody
//@Controller
@Controller
public class HelloWorld {
    @ResponseBody
    @PostMapping("/test2")
    public String delete(){
        return "A";
    }

}
