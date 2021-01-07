package com.nhom8.design.patterns.CreationalPatterns.Prototype;

public class PrototypeDemo {
	 public static void main(String[] args) {
	        Ship ship1 = new Ship("Ship 1", 100, 14.4d, new Captain("Captain 1",175,70));
	        
	   
	        Ship ship2 = (Ship)ship1.createClone();
	        ship2.setName("Ship 2");
	        ship2.getCaptain().setName("Captain 2");
	        Ship ship3 = (Ship)ship2.createClone();
	        ship3.setName("Ship 3");
	        ship3.setCrew(200);
	        ship3.getCaptain().setName("Captain 3");
	      
	        System.out.println(ship1);
	        System.out.println(ship2);
	        System.out.println(ship3);

	    }
}
