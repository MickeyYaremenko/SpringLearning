package com.epam.spring.main;

import com.epam.spring.bean.SomeBean;
import com.epam.spring.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        SomeBean someBean = (SomeBean) applicationContext.getBean("someBean");
//        System.out.println(someBean);
        someBean.doSmth("smth");
        System.out.println(someBean.getPets());
    }
}
