package com.nhom8.design.patterns.StructuralPatterns.Decorator;

public class WhiteBubble extends MilkTeaDecorator{

	public WhiteBubble(IMilkTea inner) {
		super(inner);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 6000+milkTea.cost();
	}
}