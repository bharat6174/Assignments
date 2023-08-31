package com.training.scan;

import java.util.Scanner;

public class GreaterScan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 numbers seperated by space:");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();

		System.out.println(x > y && x > z ? x + " is the largest number."
				: y > z ? y + " is the largest" : z + " is the largest.");

		scanner.close();
	}

}
