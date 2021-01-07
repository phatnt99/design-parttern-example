package com.nhom8.design.patterns.BehaviorialPatterns.State;

public class Ringing implements MobileAlertState{
		@Override
		public void alert() {
			System.out.println("Phone is ringing");
		}
}
