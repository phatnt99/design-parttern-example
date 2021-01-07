package com.nhom8.design.patterns.BehaviorialPatterns.Iterpreter;

public class DayExpression implements AbstractExpression{

	@Override
	public void Evaluate(Context context) {
		String expression=context.expression;
		context.expression = expression.replace("DD", String.valueOf(context.date.getDate()));
	}

}
