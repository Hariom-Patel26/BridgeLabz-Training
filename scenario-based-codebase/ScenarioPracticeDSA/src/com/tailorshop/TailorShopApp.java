package com.tailorshop;

import java.util.ArrayList;

public class TailorShopApp {

	public static void main(String args[]) {
		
		ArrayList<Clothes> cloth = new ArrayList<>();
		
				cloth.add(new Clothes("Kurta" , "10:00"));
				cloth.add(new Clothes("Coat " , "21:00"));
				cloth.add(new Clothes("Shirt" , "07:00"));
				cloth.add(new Clothes("Upper" , "09:00"));
				
		InsertionSort.insertionSort(cloth);
		for(Clothes c : cloth) {
		System.out.println(  c.name+ " |" + c.deliverytime);
		}
	}
}