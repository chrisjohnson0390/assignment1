package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		String firstName = "John";
		String middleName = "James";
		String lastName = "Doe";
		String SSN = "123-45-6789";
		double checkingAccountOpeningBalance = 100.00;
		double savingsAccountOpeningBalance = 1000.00;
		double checkingInterestRate = 0.0001;
		
		AccountHolder a = new AccountHolder(firstName, middleName, lastName, SSN, checkingAccountOpeningBalance, savingsAccountOpeningBalance);
		CheckingAccount ac = new CheckingAccount(checkingAccountOpeningBalance, checkingInterestRate);
		SavingsAccount as = new SavingsAccount(savingsAccountOpeningBalance, 0.01);
		System.out.println(a.toString());
		System.out.println("test line 1");
		System.out.println(ac.toString());
		System.out.println("test line 2");
		System.out.println(as.toString());
		
	}
	
	
}