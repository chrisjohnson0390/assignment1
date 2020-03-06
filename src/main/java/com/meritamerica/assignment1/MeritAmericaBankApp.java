package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		
		// Calls the AccountHolder constructor and create a new AccountHolder object
		AccountHolder chris = new AccountHolder("Chris", "Patrick", "Johnson", "123456789", 100, 1000);
		
		// Prints out the values of the AccountHolder object
		System.out.println(chris.toString());
		
		// Prints blank line for readability
		System.out.println(" ");
		
		// Calls the deposit method on the AccountHolder CheckingAccount object
		chris.getCheckingAccount().deposit(500);
		
		// Calls the withdraw method on the AccountHolder SavingsAccount object
		chris.getSavingsAccount().withdraw(800);
		
		// Prints blank line for readability
		System.out.println(" ");
		
		// Prints out the values of the AccountHolder CheckingAccount Object
		System.out.println(chris.getCheckingAccount().toString());
		
		// Prints blank line for readability
		System.out.println(" ");
		
		// Prints out the values of the AccountHolder SavingsAccount Object
		System.out.println(chris.getSavingsAccount().toString());
		
		// Prints blank line for readability
		System.out.println(" ");
		
		// Calls the AccountHolder constructor and create a new AccountHolder object
		AccountHolder john = new AccountHolder("John", "James", "Doe", "987654321", 200, 500);
		
		// Prints blank line for readability
		System.out.println(" ");
		
		// Calls the deposit method on the AccountHolder CheckingAccount object
		john.getCheckingAccount().deposit(-500);
		
		// Calls the deposit method on the AccountHolder SavingsAccount object
		john.getSavingsAccount().deposit(600);
		
		// Prints blank line for readability
		System.out.println(" ");
		
		// Prints out the values of the AccountHolder object
		System.out.println(john.toString());
		
	}
	
}