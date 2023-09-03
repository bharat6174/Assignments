package com.training.quest2;

public class BasicCalculator implements ICalculator {

	@Override
	public void add(int x, int y) {
		System.out.println("Addition: " + (x + y));
	}

	@Override
	public void difference(int x, int y) {
		System.out.println("Difference: " + (x - y));

	}

	@Override
	public void product(int x, int y) {
		System.out.println("Product: " + (x * y));

	}

	@Override
	public void divide(int x, int y) {
		System.out.println("Division: " + (x / y));

	}

}
