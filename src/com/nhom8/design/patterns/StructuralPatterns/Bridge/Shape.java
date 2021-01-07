package com.nhom8.design.patterns.StructuralPatterns.Bridge;

public abstract class Shape {
    protected Color color;

    //constructor with implementor as input argument
    public Shape(Color c){
        this.color=c;
    }

    abstract public void applyColor();
}
