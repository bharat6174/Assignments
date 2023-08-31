package com.training.basic;

import java.util.Scanner;

public class Fibbonaci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to calculate fibonacci series: ");
		int number = scanner.nextInt();
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
