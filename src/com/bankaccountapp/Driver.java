package com.bankaccountapp;
/*
 * name:
 *    	 Viswas Vatte              
 * date:
 *     	October 14,2019
 * description:
 * this application creates new bank account for new bank customers, 
 * this accounts include checking account and savings account.
 * It implements aspects of abstract classes, abstract methods, 
 * inheritance and method overriding.
 * 
 **/
public class Driver {

	public static void main(String[] args) {
		CheckingAccount myAccount = 
				new CheckingAccount("Xin Yang", "6857345856", 1000);
		myAccount.showInfo();
		myAccount.deposit(2000);
		myAccount.withDraw(4000);
		myAccount.withDraw(1500);
		myAccount.compound();
		System.out.println("****************************************");
		SavingAccount myAccount2 = 
				new SavingAccount("Ada Zhang", "684321924", 5000);
		myAccount2.showInfo();
		myAccount2.deposit(200);
		myAccount2.withDraw(45000);
		myAccount2.withDraw(550);
		myAccount2.compound();

	}

}
