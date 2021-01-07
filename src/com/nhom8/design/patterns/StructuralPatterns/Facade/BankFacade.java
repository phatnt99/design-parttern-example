package com.nhom8.design.patterns.StructuralPatterns.Facade;

public class BankFacade {
	private static final BankFacade instance=new BankFacade();
	
	AccountCheckService accountCheckService;
	WelcomeService welcomeService;
	AccountService accountService;
	
	public BankFacade()
	{
		welcomeService=new WelcomeService();
		accountCheckService=new AccountCheckService();
		accountService=new AccountService();
	}
	
	public static BankFacade getInstance()
	{
		return instance;
	}
	
	public void clientCheckBalance()
	{
		welcomeService.sayHello();
		accountCheckService.check();
		accountService.checkBalance();
		welcomeService.sayGoodBye();
	}
	public void clientSendMoney()
	{
		welcomeService.sayHello();
		accountCheckService.check();
		accountService.sendMoney();
		welcomeService.sayGoodBye();
	}
	public void clientWithdrawMoney()
	{
		welcomeService.sayHello();
		accountCheckService.check();
		accountService.withdrawMoney();
		welcomeService.sayGoodBye();
	}
}
