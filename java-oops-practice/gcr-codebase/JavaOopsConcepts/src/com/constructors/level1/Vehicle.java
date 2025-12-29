package com.constructors.level1;

public class Vehicle {
	    String ownerName;
	    String vehicleType;
	    static double registrationFee = 5000;

	    // Constructor
	    Vehicle(String ownerName, String vehicleType) {
	        this.ownerName = ownerName;
	        this.vehicleType = vehicleType;
	    }

	    // Instance method
	    void displayVehicleDetails() {
	        System.out.println("Owner Name: " + ownerName);
	        System.out.println("Vehicle Type: " + vehicleType);
	        System.out.println("Registration Fee: " + registrationFee);
	    }

	    // Class method
	    static void updateRegistrationFee(double newFee) {
	        registrationFee = newFee;
	    }

	    public static void main(String[] args) {
	        Vehicle v1 = new Vehicle("Rahul", "Car");
	        Vehicle v2 = new Vehicle("Amit", "Bike");

	        v1.displayVehicleDetails();
	        v2.displayVehicleDetails();

	        Vehicle.updateRegistrationFee(6000);

	        v1.displayVehicleDetails();
	    }
	}
