package com.nhom8.design.patterns.BehaviorialPatterns.Iterpreter;

public class YearExpression implements AbstractExpression{

	@Override
	public void Evaluate(Context context) {
		String expression=context.expression;
		context.expression = expression.replace("YYYY", String.valueOf(context.date.getYear()+1900));
	}

}
