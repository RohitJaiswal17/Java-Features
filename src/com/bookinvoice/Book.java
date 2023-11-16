package com.bookinvoice;

public class Book {

	String name;
	String authorName;
	double price;
	int year;
	String isbn;

	public Book(String name, String authorName, double price, int year, String isbn) 
	{
		super();
		this.name = name;
		this.authorName = authorName;
		this.price = price;
		this.year = year;
		this.isbn = isbn;
	}

}
