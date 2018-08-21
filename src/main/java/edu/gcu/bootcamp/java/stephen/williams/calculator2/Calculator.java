package edu.gcu.bootcamp.java.stephen.williams.calculator2;

import java.util.Scanner;

public class Calculator {
		// Rob was here

	static Scanner scanner = new Scanner(System.in);
	
	static int num1;
	static int num2;
	
	public static void main(String[] args) {
		
		num1 = getUserInput();
		num2 = getUserInput();
		
//		int resultOfCalculation = add(num1, num2);
		
		int resultOfCalculation = subtract(num1, num2);
		
		displayResult(resultOfCalculation);
		
		scanner.close();
	}
	
	private static int getUserInput() {
		System.out.print("Enter a number:  ");
		int userNum = scanner.nextInt();
		return userNum;
	}
	
	private static int add(int userNum1, int userNum2) {
		
		int sum = userNum1 + userNum2;
		return sum;
	}
	
	private static void displayResult(int result) {
		
		System.out.println("The difference between the two numbers is " + result);
	}
	
	private static int subtract(int num1, int num2) {
		
		int difference = num1 - num2;
		return difference;
	}
	
}