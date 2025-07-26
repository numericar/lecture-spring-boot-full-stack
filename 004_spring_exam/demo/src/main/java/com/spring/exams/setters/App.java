package com.spring.exams.setters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationSetterInjection.xml")) {
            Car myCar = (Car) context.getBean("myCar");
            myCar.displayDetails();
        }
    }
}
