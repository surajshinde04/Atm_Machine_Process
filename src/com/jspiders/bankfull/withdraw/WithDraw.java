package com.jspiders.bankfull.withdraw;

import com.jspiders.bankfull.account.Account;
import com.jspiders.bankfull.check.CheckBalance;

public class WithDraw {
	static Account account;
	int withdrawAmount;
	
	public WithDraw(int withdrawAmount , Account account) {
		WithDraw.account=account;
		this.withdrawAmount=withdrawAmount;
	}
	public void withdraw() {
		if(account.accountBalance>=this.withdrawAmount) {
			System.out.println("Withdrawing Amount Successfully :-"+" "+ withdrawAmount);
			account.accountBalance-=withdrawAmount;
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			CheckBalance.checkBalance();
		}else {
			System.out.println("Insufficient Account Balance");
		}
		
	}

}
