package com.training.scan;

import java.util.Scanner;

public class ArrayScanRoot {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array you want to input: ");
		int length = scanner.nextInt();
		int[] arr = new int[length];

		System.out.println("Enter the elements of array, seperate all elements by space:");

		for (int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Square root of elements of entered array is:");
		double[] rootarr = new double[arr.length];

		for (int i = 0; i < arr.length; i++) {
			rootarr[i] = Math.sqrt(arr[i]);
		}

		for (double val : rootarr) {
			System.out.println(val);
		}
	}

}
