package com.training.scan;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String[] registereduser = { "Bharat", "Prathmest", "Anjani", "Sai" };

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter username to login: ");
		String enterusername = scanner.nextLine();

		boolean isValid = false;
		for (String username : registereduser) {
			if (username.equalsIgnoreCase(enterusername)) {
				isValid = true;
				break;
			}
		}

		if (isValid) {
			System.out.println("You are logged in successfully");
		} else {
			System.out.println("Invalid username");
		}

		scanner.close();
	}

}
