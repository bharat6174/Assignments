package com.training.quest5;

import java.util.function.BiConsumer;

public class AdminAgeBiConsumer {
	public static void main(String[] args) {

		BiConsumer<String, Integer> checkAdmin = (name, age) -> {
			if ("Admin".equals(name) && age > 30) {
				System.out.println("Welcome admin");
			} else {
				System.out.println("Wrong User");
			}
		};
		
		checkAdmin.accept("Admin", 30);
		checkAdmin.accept("Admin", 31);
		checkAdmin.accept("ADmin", 30);

	}
}
