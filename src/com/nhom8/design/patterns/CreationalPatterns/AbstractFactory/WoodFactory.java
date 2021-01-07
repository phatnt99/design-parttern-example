package com.nhom8.design.patterns.CreationalPatterns.AbstractFactory;

public class WoodFactory extends FurnitureAbstractFactory {
	 
    @Override
    public Chair createChair() {
        return new WoodChair();
    }
 
    @Override
    public Table createTable() {
        return new WoodTable();
    }
}