package com.promineotech;

import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);   
		
	boolean loggedIn = false;

		int i = 3;
		while (!loggedIn && i > 0) {
		System.out.print("Enter username: ");   
		String username = sc.nextLine();   
		System.out.print("Enter password: ");  
		String password = sc.nextLine(); 
		i--;
		if (username.equals("samy123") && password.equals("12345")) {
		System.out.println("Welcome back " + username);
		    } else { 
		System.out.println("Inaccurate credentials"); 
		} // end of else 
		} // end of while
		System.out.println("You are locked out.");

		
		
	}

}
