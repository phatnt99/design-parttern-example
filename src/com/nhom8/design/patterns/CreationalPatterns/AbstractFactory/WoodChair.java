package com.nhom8.design.patterns.CreationalPatterns.AbstractFactory;

public class WoodChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create wood chair");
    }
}
