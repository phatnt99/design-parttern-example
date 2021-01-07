package com.nhom8.design.patterns.StructuralPatterns.FlyWeight;

public class Context {
    private final String id;
    private final int star;

    public Context(String id, int star) {
        this.id = id;
        this.star = star;
    }

    public String getId() {
        return this.id;
    }

    public int getStar() {
        return this.star;
    }
}
