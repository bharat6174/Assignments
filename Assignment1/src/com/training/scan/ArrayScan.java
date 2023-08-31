package com.training.scan;

import java.util.Scanner;

public class ArrayScan {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array you want to input: ");
		int length = scanner.nextInt();
		int[] arr = new int[length];

		System.out.println("Enter the elements of array, seperate all elements by space");

		for (int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Entered array is");
		for (int val : arr) {
			System.out.println(val);
		}

		int sum = 0;
		for (int val : arr) {
			sum = sum + val;
		}

		double avg = (double) sum / arr.length;
		System.out.println("Sum of the array elements is: " + sum);
		System.out.println("Average of the array elements is: " + avg);
		scanner.close();
	}

}
