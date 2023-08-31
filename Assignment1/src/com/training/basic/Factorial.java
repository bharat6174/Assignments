package com.training.basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to calculate factorial: ");
		int number = scanner.nextInt();

		long factorial = calcFactorial(number);

		System.out.println("Factorial of " + number + " is " + factorial);
		scanner.close();
	}

	public static long calcFactorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * calcFactorial(n - 1);
	}
}
