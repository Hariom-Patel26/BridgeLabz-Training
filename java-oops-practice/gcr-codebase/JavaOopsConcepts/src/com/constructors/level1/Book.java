package com.constructors.level1;

public class Book {
	
    String title ;
    String author ;
	double price ;
	
	Book() {
		title = "The Ramayan";
		author = "Tulsidas ji";
		price = 980;
	}
	Book(String title , String author , double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public void getDetails() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
}
