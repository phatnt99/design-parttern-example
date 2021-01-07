package com.nhom8.design.patterns.StructuralPatterns.Decorator;

public class BlackBubble extends MilkTeaDecorator{

	public BlackBubble(IMilkTea inner) {
		super(inner);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 7000+milkTea.cost();
	}
}
