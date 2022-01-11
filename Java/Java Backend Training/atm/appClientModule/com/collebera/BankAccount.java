package com.collebera;


import java.util.Scanner;

public class BankAccount{
	int balance;
	int customerId;
	String customerName;
	private Scanner scanner;
	BankAccount(String cName,int cId ,int cbalance){
		customerId=cId;
		balance=cbalance;
		customerName=cName;
		}
	
	void deposit(int amount)
	{
		if(amount!=0)
		{
			balance=balance+amount;
		}
	}
	void withdraw(int amount)
	{
		if(amount!=0)
		{
			balance=balance-amount;
		}
	}
	void showMenu() {
		int option=0;
		scanner = new Scanner(System.in);
		System.out.println("Welcome "+customerName);
		System.out.println("ID: "+customerId);
		System.out.println("\n");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
		do {
			int x=1;
			if(x==1) {
			System.out.println("Enter an option");
			option = scanner.nextInt();
			System.out.println("\n");}
			else {				
				System.out.println("Enter an option to continue or 4 to exit");
				option = scanner.nextInt();
				System.out.println("\n");
				x=2;
			}
			
			switch(option) {
			case 1:				
				System.out.println("Balance = "+balance);
				System.out.println("\n");
				break;
			case 2:				
				System.out.println("Enter an amount to deposit:");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
			case 3:
				System.out.println("Enter an amount to withdraw");	
			    int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
			case 4:
				System.out.println("Thank you come Again");
				break;
			default:
				System.out.println("Invalid option! Please try again");
			    break;
			}
	
	}while(option!=4);
	System.out.println("Incorrect Choice");
}
}