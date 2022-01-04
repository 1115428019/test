package com.example.demo;

import com.example.demo.configuration.SpringConfig;
import com.example.demo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class DemoApplication {

    public void testService(){
        ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();
    }
    public static void main(String[] args) {
        DemoApplication test = new DemoApplication();
        test.testService();
        SpringApplication.run(DemoApplication.class, args);
    }

}
