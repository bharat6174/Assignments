package com.training.basic;

public class ArraySum {

	public static void main(String[] args) {
		
		int[] arr = {3,4,8,9};
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
	}

}
