package com.meritamerica.assignment1;

public class AccountHolder {
	
	// Establishes variables for the class
	private String firstName;
	private String middleName;
	private String lastName;
	private String SSN;
	
	// Sets the CheckingAccount and SavingsAccounts as class variables
	CheckingAccount checking;
	SavingsAccount savings;
	
	// Default constructor for the AccountHolder class	
	public AccountHolder() {
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.SSN = "";
		this.checking = new CheckingAccount(0.0);
		this.savings = new SavingsAccount(0.0);
	}

	// Constructor method to pass in class variables as parameters
	public AccountHolder(String firstName, String middleName, String lastName, String SSN, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.SSN = SSN;
		checking = new CheckingAccount(checkingAccountOpeningBalance);
		savings = new SavingsAccount(savingsAccountOpeningBalance);
	}

	// Returns the first name value of the object
	public String getFirstName() {
		return this.firstName;
	}

	// Sets the first name value of the object
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// Returns the middle name value of the object
	public String getMiddleName() {
		return this.middleName;
	}
	
	// Sets the middle name value of the object
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	// Returns the last name value of the object
	public String getLastName() {
		return this.lastName;
	}
	
	// Sets the fist name value of the object
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// Returns the ssn value of the object
	public String getSSN() {
		return this.SSN;
	}
	
	// Sets the ssn value of the object
	public void setSSN(String SSN) {
		this.SSN = SSN;
	}
	
	// Returns the values of the object associated with the CheckingAccount Class
	public CheckingAccount getCheckingAccount() {
		return checking;
	}
	
	// Returns the values of the object associated with the SavingsAccount Class
	public SavingsAccount getSavingsAccount() {
		return savings;
	}
	
	// Overrides the toString method to print out readable values instead of a general hashstring
	@Override
	public String toString() {
		return "Name: " + getFirstName() + " " + getMiddleName() + " " + getLastName() 
		+ "\n" + "SSN: " + getSSN() + "\n" +
		getCheckingAccount().toString() + "\n" +
		getSavingsAccount().toString(); 
	}


	
}
	
