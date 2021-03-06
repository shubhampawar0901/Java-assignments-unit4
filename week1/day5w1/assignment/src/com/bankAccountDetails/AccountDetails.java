package com.bankAccountDetails;

import java.util.Scanner;

public class AccountDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDetails ad1= new AccountDetails();
		Account account1 = ad1.getAccountDetails();
		int withdraw = ad1.getWithdrawAmount();	
		account1.withdraw(withdraw);
		

	}
	
	public Account getAccountDetails() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Account ID :");
		int accID = scan.nextInt();
		System.out.println("Enter Account type :");
		String accType = scan.next();
		System.out.println("Enter balance :");
		int balance = scan.nextInt();
		if(balance == 0) {
			while(balance<=0) {
				System.out.println("Balance should be positive \nEnter balance :");
				balance = scan.nextInt();
			}
		}
		
		Account a1 = new Account();
		a1.setAccountId(accID);
		a1.setAccountType(accType);
		a1.setBalance(balance);
		return a1;
	}

	public int getWithdrawAmount() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Amount to be Withdrawn :");
		int withdraw = scan.nextInt();
		if(withdraw<=0) {
			while(withdraw<=0) {
				System.out.println("Amount should be positive \nEnter Amount to be withdrawn :");
				withdraw = scan.nextInt();
			}
		}
		return withdraw;
	}
}

class Account{

	private int accountId;
	private String accountType;
	private int balance; 
	
	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	public boolean withdraw(int amount) {
		if( balance >= amount) {
			this.balance = this.balance - amount;
			System.out.println("Balance amount after withdrawal : " + this.balance);
			return true;
		}else {
			System.out.println("Sorry!!! No enough balance");
			return false;
		}
		
	}
	
}
