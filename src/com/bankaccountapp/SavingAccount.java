package com.bankaccountapp;
/*
 * name:
 *    	 Viswas Vatte              
 * date:
 *     	October 14,2019
 * description:
 * this application creates new bank account for new bank customers, 
 * this accounts include checking account and savings account.
 * It implements aspects of abstract classes, abstract methods, inheritance and method overriding.
 * 
 **/
public class SavingAccount extends Account {

	public SavingAccount(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
	}

	@Override
	public void showInfo() {

		super.showInfo();
		System.out.println("Account Type: Savings Account");
		System.out.println("=================================");
	}

	@Override
	public void setRate() {

		this.rate = BASE_RATE * 0.25;

	}

}
