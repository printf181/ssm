package com.gyf.test;

import com.gyf.model.Student;
import com.gyf.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson06 {

    @Test
    public void test1(){
        //给对象的属性赋值方式讲解
        ApplicationContext context = new ClassPathXmlApplicationContext("beans6.xml");
        //从容器获取两个bean
        Student stu = (Student) context.getBean("stu");
        System.out.println(stu);
    }
}
