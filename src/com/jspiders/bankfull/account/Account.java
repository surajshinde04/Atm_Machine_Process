package com.jspiders.bankfull.account;

public class Account {

	public int accountBalance;
	static Account account=new Account(10000);
	
	private Account(int accountBalance) {
		this.accountBalance=accountBalance;
		System.out.println();
		System.out.println("Account Created Successfully with Inital Balance :-" +" "+ this.accountBalance);
	}
	
	public static Account getAccount() {
		return account;
	}

}
