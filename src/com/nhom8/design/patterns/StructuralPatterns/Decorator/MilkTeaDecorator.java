package com.nhom8.design.patterns.StructuralPatterns.Decorator;

public abstract class MilkTeaDecorator implements IMilkTea{
	IMilkTea milkTea;
	
	public MilkTeaDecorator(IMilkTea wrappee)
	{
		milkTea=wrappee;
	}
	
	@Override
	public  double cost() {
		// TODO Auto-generated method stub
		return milkTea.cost();
	}
}
