package com.spring.exams.constructors;

public class Car {
    private final Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetail() {
        System.out.println("Car details: " + this.specification.toString());
    }
}
