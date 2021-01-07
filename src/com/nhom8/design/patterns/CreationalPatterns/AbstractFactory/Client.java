package com.nhom8.design.patterns.CreationalPatterns.AbstractFactory;

public class Client {
	 
    public static void main(String[] args) {
 
          FurnitureAbstractFactory factory1 = FactoryProvider.getFactory(MaterialType.PLASTIC);
          FurnitureAbstractFactory factory2 = FactoryProvider.getFactory(MaterialType.WOOD);
          Chair chair1 = factory1.createChair();
          chair1.create(); // Create plastic chair
          Table table2=factory2.createTable();
	  table2.create(); // Create Wood table
          Table table1 = factory1.createTable();
          table1.create(); // Create plastic table
    	
    }
}