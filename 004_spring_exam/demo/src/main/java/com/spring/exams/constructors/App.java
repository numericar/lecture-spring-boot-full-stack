package com.spring.exams.constructors;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConstructorInjection.xml")) {
            Car myCar = (Car) context.getBean("myCar");
            myCar.displayDetail();
        }
    }
}
