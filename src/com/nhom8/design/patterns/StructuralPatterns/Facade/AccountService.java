package com.nhom8.design.patterns.StructuralPatterns.Facade;

public class AccountService {
	public void checkBalance()
	{
		System.out.println("Đang kiểm tra số dư...");
		System.out.println("Số dư của bạn là 50.000.000 VNĐ");
	}
	public void sendMoney()
	{
		System.out.println("Đang thực hiện giao dịch Gửi tiền...");
		System.out.println("Giao dịch Gửi tiền thành công");
	}
	public void withdrawMoney()
	{
		System.out.println("Đang thực hiện giao dịch Rút tiền...");
		System.out.println("Giao dịch Rút tiền thành công");
	}
}
