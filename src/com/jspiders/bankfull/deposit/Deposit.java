package com.jspiders.bankfull.deposit;

import com.jspiders.bankfull.account.Account;
import com.jspiders.bankfull.check.CheckBalance;

public class Deposit {
	int depositAmount;
	static Account account;
	
	public Deposit(int depositAmount,Account account ) {
		this.depositAmount=depositAmount;
		Deposit.account=account;
	}
	
	public void deposit() {
		System.out.println("Depositing Amount :-"+" "+ depositAmount);
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		account.accountBalance+=this.depositAmount;
		CheckBalance.checkBalance();
	}
}
