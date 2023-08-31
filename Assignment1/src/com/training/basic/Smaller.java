package com.training.basic;

import java.util.Scanner;

public class Smaller {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of 1-D array you want to input:");
		int len = scanner.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter elements of the array:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Smallest element in the array is: " + min);
	}

}
