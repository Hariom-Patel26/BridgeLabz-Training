package com.constructors.level1;

public class BookSystem {
	String title ;
    String author ;
	double price ;
	boolean available ;
	
	BookSystem(String title , String author , double price) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.available = true;
	}
	
	void borrowBook () {
		if (available) {
			available = false;
			System.out.println("Book Borrowed Successfully");
		}
		else {
			System.out.println("Book Is Not Available");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookSystem b1 = new BookSystem("java Programming", "James gosling", 480);
		b1.borrowBook();
		b1.borrowBook();

	}

}
