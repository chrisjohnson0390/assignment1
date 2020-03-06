package com.meritamerica.assignment1;

public class CheckingAccount {
	
	// Establishes class variables
	private double balance;
	private final double INTERESTRATE = 0.0001;
	
	// Default constructor method for the class
	public CheckingAccount(double openingBalance) {
		this.balance = openingBalance;
	}
	
	// Returns the balance value of the object
	public double getBalance() {
		return this.balance;
	}
	
	// Returns the Interest Rate value of the object
	public double getInterestRate() {
		return INTERESTRATE;
	}
	
	/* Method to withdraw an entered amount from the balance. 
	 * Ensures the amount parameter is not greater than the balance value.
	 * Ensures the amount parameter isn't a negative value. 
	 * Returns the balance value after computation.
	 */
	public boolean withdraw(double amount) {
		if(amount <= balance && amount>0) {
			this.balance -= amount;
			System.out.println("You withdrew: $" + amount);
			System.out.println("Your remaining balance is: $" + balance);
			return true;
		}
		System.out.println("Insufficient Funds.");
		return false;
	}
	
	/* Method to deposit an entered amount to the balance.
	 * Ensures the amount parameter isn't a negative value.
	 * Returns the balance value after computation.
	 */
	public boolean deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
			return true;
		}
		System.out.println(amount + " - Invalid amount.");
		return false;
	}
	
	/* Method to calculate the value of the balance in a given amount of time.
	 * Ensures the years parameter is a valid value.
	 * Returns the balance value after computation.
	 */
	public double futureValue(int years) {
		double futureValue;
		if (years <= 0) {
			System.out.println("Invalid period of time");
			return -1;
		} else {
			futureValue = balance * Math.pow((1 + INTERESTRATE), years);
			return futureValue;
		}
	}

	// Overrides the toString method to print out readable values instead of a generic hashstring
	@Override
	public String toString() {
		return  "Checking Account Balance: $" + getBalance() + "\n" +
				"Checking Account Interest Rate: " + String.format( "%.4f", INTERESTRATE)+ "%" + "\n" +
				"Checking Account Balance in 3 years: $" + String.format( "%.2f", futureValue(3));
	}
	
	
	

}