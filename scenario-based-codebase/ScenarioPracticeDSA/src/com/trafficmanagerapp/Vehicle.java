package com.trafficmanagerapp;

class Vehicle {
	String numberPlate;
	Vehicle next;

	Vehicle(String numberPlate) {
		this.numberPlate = numberPlate;
		this.next = null;
	}
}