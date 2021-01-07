package com.nhom8.design.patterns.BehaviorialPatterns.Iterpreter;

public class MonthExpression implements AbstractExpression{

	@Override
	public void Evaluate(Context context) {
		String expression=context.expression;
		context.expression = expression.replace("MM", String.valueOf(context.date.getMonth()+1));
	}

}
