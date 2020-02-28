package com.meritamerica.assignment1;

public class CheckingAccount {
	
	private double balance;
	private double interestRate;
	
	public CheckingAccount(double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double getCheckingBalance() {
		return this.balance;
	}
	
	public double getCheckingInterestRate() {
		return this.interestRate;
	}
	
	public boolean withdraw(double amount) {
		if(amount <= 0 || amount>balance) {
			System.out.println("Invalid amount or insufficient funds.");
			return false;
		} else {
			balance -= amount;
			System.out.println("Successfuly withdrew $" + amount + "\n"
					+ "Your remaining balance is: $" + balance);
		} return true;
	}
	
	public boolean deposit(double amount) {
		if(amount <= 0) {
			System.out.println("Invalid amount.");
			return false;
		} else {
			balance += amount;
			System.out.println("Successfuly deposited $" + amount + "\n"
					+ "Your remaining balance is: $" + balance);
		} return true;
	}
	
	public double futureValue(int years) {
		double futureValue;
		if (years <= 0) {
			System.out.println("Invalid period of time");
			return -1;
		} else {
			futureValue = balance * Math.pow((1 + interestRate), years);
			System.out.println("Checking account balance in " + years + " years: $" + futureValue);
			return futureValue;
		}
	}

	@Override
	public String toString() {
		return "Checking Account Balance: $" + getCheckingBalance() + "\n" +
				"Checking Account Interest Rate: " + getCheckingInterestRate() + "\n" +
				futureValue(3);
	}
	
	
	

}