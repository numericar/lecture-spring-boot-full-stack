package com.example.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // load spring context with config file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        MyBean myBean = (MyBean) context.getBean("myBean");

        System.out.println(myBean);
    }
}
