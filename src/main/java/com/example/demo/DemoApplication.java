package com.example.demo;

import com.example.demo.dao.UserDao;
import com.example.demo.dao.test_New;
import com.example.demo.factory.UserFactory;
import com.example.demo.test.inF;
import com.example.demo.test.rel_Inf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {
    public void addUser(){
        System.out.println("Demo.addUser");
        UserDao userDao = UserFactory.getUserDao();
        userDao.addUser();
        userDao.show();
    }
    public void addTest(){
        test_New test_new = UserFactory.getTest_New();
        test_new.add();
    }
    public static void main(String[] args) {
//        new DemoApplication().addUser();
//        new DemoApplication().addTest();
        Class [] nsz = {inF.class};
        rel_Inf nb = new rel_Inf();
        inF nbb = (inF) Proxy.newProxyInstance(DemoApplication.class.getClassLoader(),nsz,new rel_Proxy(nb));
        int result = nbb.add(1,2);
        System.out.println("result:"+result);
        SpringApplication.run(DemoApplication.class, args);
    }

}

class rel_Proxy implements InvocationHandler{
    private Object obj;
    public rel_Proxy(Object obj){
        this.obj=obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before:"+method.getName()+"传递的参数"+ Arrays.toString(args));
        Object res=method.invoke(obj,args);
        System.out.println("after:"+obj);
        return res;
    }
}