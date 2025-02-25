package com.wipro.java.microservices.solid;
 
class book {
	String name;
	String authorName;
	int year;
	int price;
	String isbn;
 
	public book(String name, String authorName, int year, int price, String isbn) {
		this.name = name;
		this.authorName = authorName;
		this.year = year;
        this.price = price;
		this.isbn = isbn;
	}
}