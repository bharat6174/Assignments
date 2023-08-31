package com.training.scan;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		String[] usernames = {"Bharat", "Prathmest", "Anjani", "Sai"};
        
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name to register: ");
        String newUser = scanner.nextLine();
        
        boolean isUnique = true;
        
        for (String username : usernames) {
            if (username.equalsIgnoreCase(newUser)) {
                isUnique = false;
                break;
            }
        }
        
        if (isUnique) {
            System.out.println("You are registered");
        } else {
            System.out.println("Name is not unique");
        }
        
        scanner.close();
	}

}
