package com.training.scan;

import java.util.Scanner;

public class ShortesScan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 numbers seperated by space:");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();

		if (x < y && x < z) {
			System.out.println(x + " is the smalest number.");
		} else if (y < z) {
			System.out.println(y + " is the smallest number.");
		} else {
			System.out.println(z + " is the smallest number.");
		}
		scanner.close();
	}

}
