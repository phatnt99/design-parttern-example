package com.nhom8.design.patterns.StructuralPatterns.FlyWeight;

public class Soldier implements ISoldier {

    private final String name;

    public Soldier(String name) {
        this.name = name;
        System.out.println("Soldider is created!" + name);
    }

    @Override
    public void promote(Context context) {
        System.out.println(name + " " + context.getId() + " promoted " + context.getStar());
    }
}
