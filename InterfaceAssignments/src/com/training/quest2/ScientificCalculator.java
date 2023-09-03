package com.training.quest2;

public class ScientificCalculator extends BasicCalculator implements IScientific {

	@Override
	public void square(int x) {
		System.out.println("Square of " + x + " is: " + (x * x));

	}

	@Override
	public void cube(int x) {
		System.out.println("Cube of " + x + " is: " + Math.pow(x, 3));

	}

}
