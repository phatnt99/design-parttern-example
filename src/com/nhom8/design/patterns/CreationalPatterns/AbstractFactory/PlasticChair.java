package com.nhom8.design.patterns.CreationalPatterns.AbstractFactory;

public class PlasticChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create plastic chair");
    }
}
