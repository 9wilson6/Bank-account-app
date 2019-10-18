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
import java.util.Random;

public abstract class Account {
	private String name;
	private String sSN;
	private double balance;
	// will be incremented every time we create a new account.
	private static int index = 10000;

	protected String accountNumber;
	protected double rate;
	static final double BASE_RATE = 2.5;

	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		index++;
		this.balance = initDeposit;
		setAccountNumber();
		setRate();

	}

	public abstract void setRate();

	// method to generate account number
	private String setAccountNumber() {
		// set Account number as per the three specified criteria;
		accountNumber = String.valueOf(sSN.substring(sSN.length() - 4,
				sSN.length()));
		accountNumber += String.valueOf(index);
		// random object.
		Random ran = new Random();
		accountNumber += String.valueOf(ran.nextInt(900) + 100);
		return accountNumber;
	}

	// method to show account information
	public void showInfo() {
		System.out.println("Name: " + name);
		System.out.println("sSN: " + sSN);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: $" + balance);
		System.out.println("rate " + rate + "%");

	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit: $" + amount);

		printBalance();
	}

	public void withDraw(double amount) {
		System.out.println("WithDraw: $" + amount);
		if (amount > balance) {
			System.out.println("Not enough balance available");
		} else {
			balance = balance - amount;
		}

		printBalance();
	}

	public void compound() {
		double accrued_interest = (rate / 100 * balance);
		System.out.println("Accrued Interest: $" + accrued_interest);
		balance += (accrued_interest);
		printBalance();
	}

	public void printBalance() {
		System.out.println("Your balance now is: $" + balance);
		System.out.println("=================================");
	}
}
