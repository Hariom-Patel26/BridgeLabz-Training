package com.FoodLoop;

public class FoodItem {
	private String name ;
	private String category;
	private double price ;
	private boolean availability;
	
	FoodItem (String name, String category, double price, boolean availability){
		this.name = name;;
		this.category=category;
		this.price=price;
		this.availability=availability;
	}
	public double getPrice() {
		return price;
	}
	public boolean getAvailability() {
		return availability;
	}
}
