package com.spring.exams.setters;

public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Car details: " + this.specification.toString());
    }
}
