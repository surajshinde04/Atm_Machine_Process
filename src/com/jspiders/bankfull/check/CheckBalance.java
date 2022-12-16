package com.jspiders.bankfull.check;

import com.jspiders.bankfull.account.Account;

public class CheckBalance {
	static Account account;
	
	public CheckBalance(Account account) {
		CheckBalance.account =account;
	}

	public static void checkBalance() {
		System.out.println("Checking AccountBalance......!");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Avaiable Account Balance is :-" +" "+ account.accountBalance);
	}

}
