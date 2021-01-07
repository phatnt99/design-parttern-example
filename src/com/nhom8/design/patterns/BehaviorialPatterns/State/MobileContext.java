package com.nhom8.design.patterns.BehaviorialPatterns.State;

public class MobileContext {
	MobileAlertState currentState;
	
	public MobileContext()
	{
		
	}
	
	public void setState(MobileAlertState state)
	{
		currentState=state;
	}
	
	public void showAlert()
	{
		currentState.alert();
	}
}
