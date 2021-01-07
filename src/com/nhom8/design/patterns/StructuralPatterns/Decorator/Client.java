package com.nhom8.design.patterns.StructuralPatterns.Decorator;

public class Client {
	public static void main(String[] args) {
		IMilkTea milkTea1=new BlackBubble(new BlackBubble(new BlackSugar(new MilkTea())));
		IMilkTea milkTea2=new BlackBubble(new WhiteBubble(new BlackSugar(new MilkTea())));

		
		System.out.println("BlackBubblex2 BlackSugarx1: "+milkTea1.cost()+" VNĐ");
		System.out.println("BlackBubblex1 WhiteBubblex1 BlackSugarx1: "+milkTea2.cost()+" VNĐ");
		
	}
}
