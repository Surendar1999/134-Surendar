package com.collabera;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

private static Scanner scanner;

public static void main(String[] args) throws InputMismatchException {
	
	Bank obj1 = new Bank("Ramesh",007,10000);
	Bank obj2 = new Bank("Suresh",005,10000);
	Boolean x=true;
	try {
	do {
	System.out.println("Enter user ID: ");
	scanner = new Scanner(System.in);
	int option = scanner.nextInt();
	if(option==obj1.customerId) {
		obj1.showMenu();
		x=false;
	}else{
		if(option==obj2.customerId) {
			obj2.showMenu();
			x=false;
		}
		else {
			System.out.println("Invalid User ID try Again");
		}
	}
	
}while(x);}catch(InputMismatchException e) {
	System.out.println("invalid input");
}
}

}