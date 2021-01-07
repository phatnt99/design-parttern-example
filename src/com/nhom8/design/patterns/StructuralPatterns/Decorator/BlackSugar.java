package com.nhom8.design.patterns.StructuralPatterns.Decorator;

public class BlackSugar extends MilkTeaDecorator{

	public BlackSugar(IMilkTea inner) {
		super(inner);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 5000+milkTea.cost();
	}
}
