package com.constructors.level1;

public class HotelBooking {
	String guestName ;
	String roomType ;
	int nights ;
	
	HotelBooking () {
		guestName = "sohit";
		roomType = "deluxe";
		nights = 2;
	}
	HotelBooking (String guestName ,String roomType ,int nights) {
		this.guestName = guestName ;
		this.roomType = roomType ;
		this.nights = nights ;
	}
	HotelBooking (HotelBooking guest1) {
		this.guestName = guest1.guestName ;
		this.roomType = guest1.roomType ;
		this.nights = guest1.nights ;
	}
	void display () {
		System.out.println(guestName +" , "+ roomType+" , "+nights);
	}

	public static void main(String[] args) {
		HotelBooking guest = new HotelBooking();
		guest.display();
		HotelBooking guest1 = new HotelBooking("ashish","premium",4);
		guest1.display();
		HotelBooking guest2 = new HotelBooking(guest1);
		guest2.display();

	}

}
