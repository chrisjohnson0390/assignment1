package com.meritamerica.assignment1;

public class AccountHolder {
	private String firstName;
	private String middleName;
	private String lastName;
	private String SSN;
	private double checkingAccountOpeningBalance;
	private double savingsAccountOpeningBalance;
	
	public AccountHolder(String firstName, String middleName, String lastName, String SSN, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.SSN = SSN;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
		System.out.println(firstName + " " + lastName + " " + SSN);
		System.out.println(checkingAccountOpeningBalance);
		System.out.println(savingsAccountOpeningBalance);	
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return this.middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSSN() {
		return this.SSN;
	}
	
	public void setSSN(String SSN) {
		this.SSN = SSN;
	}
	
	/* public double getCheckingAccount() {
		return this.checkingAccount;
	}
	
	public double getSavingsAccount() {
		return this.savingsAccount;
	}
	
	*/
	
	
	
	public static void main(String[] args) {
		String firstName = "Shelby";
		String middleName = "Lynn";
		String lastName = "Johnson";
		String SSN = "123-45-6789";
		double checkingAccountOpeningBalance = 122.00;
		double savingsAccountOpeningBalance = 998.00;
		
		AccountHolder a = new AccountHolder(firstName, middleName, lastName, SSN, checkingAccountOpeningBalance, savingsAccountOpeningBalance);
		System.out.println(a.getFirstName());
		System.out.println(a.toString());
		
	}

	@Override
	public String toString() {
		return "Name: " + getFirstName() + " " + getMiddleName() + " " + getLastName() + "\n" + "SSN: " + getSSN();
	}
	
	
}