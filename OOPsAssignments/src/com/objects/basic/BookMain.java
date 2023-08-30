package com.objects.basic;

public class BookMain {

	public static void main(String[] args) {
		Book book1 = new Book("Antifragile", " Nassim Nicholas Taleb", 1500, "Non-Fiction");
		Book book2 = new Book("The Alchemist", "Paulo Coelho", 450, "Fiction");

		book1.getDetails();
		System.out.println("This is a " + book1.checkBookType());
		System.out.println();

		book2.getDetails();
		System.out.println("This is a " + book2.checkBookType());
		System.out.println();

	}

}
