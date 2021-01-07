package com.nhom8.design.patterns.BehaviorialPatterns.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
