package com.training.quest3;

import java.util.function.BiConsumer;

public class AdditionConsumer {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> add = (x, y) -> System.out.println("Adding these number gives: " + (x + y));

		add.accept(10, 20);
	}

}
