package com.nhom8.design.patterns.StructuralPatterns.Bridge;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(new Red());
        circle.applyColor();

        Shape redSquare = new Square(new Red());
        redSquare.applyColor();

        Shape blueSquare = new Square(new Blue());
        blueSquare.applyColor();
    }
}
