package com.constructors.level1;

public class CarRental {
	String customerName ;
	String carModel ;
	int rentalDays ;
	double costPerDay = 1000;
	
	CarRental (String customerName ,String carModel , int rentalDays) {
		this.carModel=carModel ;
		this.customerName = customerName;
		this.rentalDays = rentalDays;
	}
	double calculateTotalCost() {
		return rentalDays * costPerDay;
	}
	void display () {
		System.out.println(customerName+" , "+carModel+" , "+rentalDays+" , "+calculateTotalCost());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarRental car = new CarRental ("amit","swift",5);
		car.display();

	}

}
