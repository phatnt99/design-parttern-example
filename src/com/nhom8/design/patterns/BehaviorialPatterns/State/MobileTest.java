package com.nhom8.design.patterns.BehaviorialPatterns.State;

public class MobileTest {
	public static void main(String[] args) {
		MobileContext mobileContext=new MobileContext();
		
		mobileContext.setState(new Ringing());
		mobileContext.showAlert();
		
		mobileContext.setState(new Silent());
		mobileContext.showAlert();
	}
}
