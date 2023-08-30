package com.objects.basic;

public class Book {
	String title;
	String author;
	double price;
	String category;

	public Book(String title, String author, double price, String category) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}

	void getDetails() {
		System.out.println("Title of the book is: " + title);
		System.out.println("Author of the book is: " + author);
		System.out.println("Price of the book is: Rs." + price);
		System.out.println("Book is of " + category + " category");
	}

	String checkBookType() {
		if (price > 5000d) {
			return ("Premium Book");
		} else {
			return ("Standard Book");
		}
	}
}
