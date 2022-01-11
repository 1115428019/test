package com.example.demo.controller;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@ResponseBody
//@Controller
@Controller
public class HelloWorld {
//    @Autowired
//    TestService testService;
//
//    @GetMapping("")
//    public String showIndex(){
//        return "index";
//    }
//
//    @PostMapping("")
//    @ResponseBody
//    public String saveData(TestModel testModel){
//        testService.saveTestData(testModel);
//        return "Result: " + testModel.toString();
////        testModel.setId(0);
////        testService.updateTestData(testModel);
////        return "update successfully!";
//    }
//
//    @GetMapping("/test")
//    public String showTest(){
//    return "test";
//    }
//
//    @RequestMapping("/url")
//    public String showUrl(Model model){
//        model.addAttribute("id",1);
//        model.addAttribute("age",18);
//        return "url";
//    }
//
//    @PostMapping("/test")
//    @ResponseBody
//    public String delete(int id){
//        testService.deleteTestData(id);
//        return "delete successfully";
//    }
//
//    @RequestMapping("/show")
//    public String showAll(Model model){
//        TestModel testModel;
//        testModel=testService.getById(0);
//        model.addAttribute("testModel",testModel);
//        return "all";
//    }
//
//    @RequestMapping("/parameter")
//    @ResponseBody
//    public String parameter(String username){
//        return username;
//    }
//
//    @RequestMapping("/multipa")
//    @ResponseBody
//    public String  multi(String name,int age){
//        return name+":"+age;
//    }

    @Autowired
    UserService userService;
    @GetMapping("/404")
    public String notFoundPage() {
    return "error/404";
}

    @GetMapping("/403")
    public String accessError() {
        return "error/403";
    }

    @GetMapping("/500")
    public String internalError() {
        return "error/500";
    }

    @GetMapping("/success")
    @ResponseBody
    public String success(){
        return "认证成功,进入success成功";
    }


    @GetMapping("/fail")
    @ResponseBody
    public String fail(){
        return "认证失败";
    }


    @GetMapping(value = "/login")
    private String loginPage(){
        return "admin/login";
    }

    @PostMapping(value = "/authentication/form")
    private String check(UserModel userModel){
        return "index";
    }

}
