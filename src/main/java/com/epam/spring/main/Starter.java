package com.epam.spring.main;

import com.epam.spring.bean.MP3;
import com.epam.spring.bean.SomeBean;
import com.epam.spring.config.Config;
import com.epam.spring.dao.Mp3DAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {

        MP3 mp3 = new MP3();
        mp3.setName("California Dreaming");
        mp3.setAuthor("The Mamas & The Papas");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
//        SomeBean someBean = (SomeBean) applicationContext.getBean("someBean");
//        System.out.println(someBean);
        Mp3DAO mp3DAO = (Mp3DAO) applicationContext.getBean("mp3DAOImpl");
        MP3 mp31 =  mp3DAO.getByID(1);
        System.out.println(mp31);
//        someBean.doSmth("smth");
//        System.out.println(someBean.getPets());
    }
}
