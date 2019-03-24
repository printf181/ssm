package com.gyf.test;

import com.gyf.service.IUserService;
import com.gyf.service.UserServiceFactory1;
import com.gyf.service.UserServiceFactory2;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson03 {

    @Test
    public void test1(){
        //new对象
       ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
//        IUserService userService1 = (IUserService) context.getBean("userService1");
//        userService1.add();

        //静态工厂
        //IUserService userService2 = UserServiceFactory1.createUserService();
        //IUserService userService2 = (IUserService) context.getBean("userService2");
        //userService2.add();

        //实例工厂
        //1，创建工厂
        //UserServiceFactory2  factory2 = new UserServiceFactory2();
       // IUserService userService3 =  factory2.createUserService();
       IUserService userService3 = (IUserService) context.getBean("userService3");
        userService3.add();
    }
}
