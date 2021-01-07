package com.nhom8.design.patterns.StructuralPatterns.Facade;

public class Client {
	public static void main(String[] args) {
		BankFacade.getInstance().clientCheckBalance();
		
		BankFacade.getInstance().clientSendMoney();
		
		BankFacade.getInstance().clientWithdrawMoney();
	}
}
