package com.jspiders.bankfull.main;

import java.util.Scanner;

import com.jspiders.bankfull.account.Account;
import com.jspiders.bankfull.check.CheckBalance;
import com.jspiders.bankfull.deposit.Deposit;
import com.jspiders.bankfull.withdraw.WithDraw;

public class AccountMain {
	
	private static int choice;
	private static boolean loop=true;
	private static Scanner scanner= new Scanner(System.in);
	static CheckBalance checkBalance= new CheckBalance(Account.getAccount());
	
	public static void main(String[] args) {
		
		while(loop) {
			System.out.println();
			System.out.println("\n<========MENU========>\n"
					+"\n 1--> For WITHDRAW MONEY \n"
					+"\n 2--> FOR DEPOSIT MONEY \n"
					+"\n 3--> FOR CHECK BALANCE \n"
					+"\n 4--> FOR EXIT");
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the Amount you want to Withdraw");
				int withdrawAmount = scanner.nextInt();
				
				WithDraw withDraw = new WithDraw(withdrawAmount, Account.getAccount());
				withDraw.withdraw();
				break;
				
			case 2:
				System.out.println("Enter the Amount you want to Deposit");
				int depositAmount=scanner.nextInt();
				Deposit deposit= new Deposit(depositAmount, Account.getAccount());
				deposit.deposit	();
				break;
			
			case 3:
				CheckBalance.checkBalance();
				break;
				
			case 4:
				String string="Thank You....!  Visit Again....!";
				for(int i=0;i<string.length();i++) {
					System.out.print(string.charAt(i));
					try {
						Thread.sleep(70);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				loop=false;
				break;
			default:
				System.out.println("Select Option is Invalid");
				break;
			}
		}
	}

}
