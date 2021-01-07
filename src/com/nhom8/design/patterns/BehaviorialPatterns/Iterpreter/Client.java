package com.nhom8.design.patterns.BehaviorialPatterns.Iterpreter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Client {
	public static void main(String[] args){
		//System.out.print(Calendar.getInstance().getTime().getYear());
		Scanner sc= new Scanner(System.in);
		ArrayList<AbstractExpression> objExpressions = new ArrayList<AbstractExpression>();
        Context context = new Context(Calendar.getInstance().getTime());
        System.out.println("Please select the Expression  : MM DD YYYY or YYYY MM DD or DD MM YYYY ");
        context.expression = sc.nextLine();
        String[] strArray = context.expression.split(" ");
        for(String item: strArray)
        {
            if(item.equals("DD"))
            {
                objExpressions.add(new DayExpression());
            }
            else if (item.equals("MM"))
            {
                objExpressions.add(new MonthExpression());
            }
            else if (item.equals("YYYY"))
            {
                objExpressions.add(new YearExpression());
            }
        }
        objExpressions.add(new SeparatorExpression());
        for(AbstractExpression obj: objExpressions)
        {
            obj.Evaluate(context);
        }
        System.out.println(context.expression);
	}
}
