package com.gyf.test;

import com.gyf.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson02 {

    @Test
    public void test1(){
        //spring容器加载的三种方式
        //第一种：ClassPathXmlApplicationContext ClassPath类路径加载，指的就是classes路径
        //第一种：最常用 spring配置文件以后直接放在src下面就ok
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //第二种方式：文件系统路径获取配置文件[绝对路径]
        //ApplicationContext context = new FileSystemXmlApplicationContext("D:\\software\\home\\day01-spring-20190324\\src\\com\\gyf\\beans.xml");
//        IUserService user = (IUserService) context.getBean("userService");
//        user.add();

        //第三种方式：使用BeanFactory(了解)
        //String path = "D:\\software\\home\\day01-spring-20190324\\src\\com\\gyf\\beans.xml";
        //BeanFactory context = new XmlBeanFactory(new FileSystemResource(path));
//        IUserService user = (IUserService) context.getBean("userService");
//        user.add();


        IUserService user = (IUserService) context.getBean("userService");
        user.add();
    }
}
