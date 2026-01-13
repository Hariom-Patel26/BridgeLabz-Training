package com.FoodLoop;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class FoodLoopDriver {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("========= Welcome To Foodie Cafe =========\n");
		
		System.out.println("===================Veg Items=======================\n"
				+ "1. Noodles            --->  180\n"
				+ "2. Momos              --->  90\n"
				+ "3. Dosa               --->  120\n\n"
				+ "===================NonVeg Items====================\n\n"
				+ "4. Eggs Rice          --->  80\n"
				+ "5. Chicken lolipoop   --->  280\n"  
				+ "6. Muton              --->  400\n");
		
		
		List<FoodItem> items = new ArrayList<>();
		items.add(new VegItem ("Noodles", "veg",180,true ));
		items.add(new VegItem ("momos", "veg",90,true ));
		items.add(new VegItem ("Dosa", "veg",120,false ));
		items.add(new NonVegItem ("Eggs Rice", "NonVeg",80,true ));
		items.add(new NonVegItem ("Chicken lolipoop", "NonVeg",280,false ));
		items.add(new NonVegItem ("Muton", "NonVeg",400,true ));
		
		while(true) {
		
		Order o = new Order();
		  
		while (true) {
			
			System.out.print("Enter item number (1 to 6) to place order and -1 to cancle item: ");
	        int choice = sc.nextInt();

	        switch (choice) {
	        
	            case -1:
	            	System.out.print("Enter cancle item number from 1 to 6:");
	            	int cancleItem = sc.nextInt();
	            	sc.nextLine();
	                o.cancleOrder(items.get(cancleItem-1));
	                break;
	            case 1:
	            	o.placeOrder(items.get(0));
	                break;

	            case 2:
	            	o.placeOrder(items.get(1));
	                break;

	            case 3:
	            	o.placeOrder(items.get(2));
	                break;

	            case 4:
	            	o.placeOrder(items.get(3));
	                break;

	            case 5:
	            	o.placeOrder(items.get(4));
	                break;

	            case 6:
	            	o.placeOrder(items.get(5));
	                break;

	            default:
	                System.out.println("Invalid choice! Please select between 1 and 6.");
	        }
	        
			
			System.out.println("Do you want to continue : Enter any number else 0");
			int number1= sc.nextInt();
			if (number1 == 0) {
				System.out.println("Total Bill :"+o.getTotal());
				System.out.println("Total Bill (Ater discount )"+o.applyDiscount());
				System.out.println("Thank you !");
				break;
			}
		}
		System.out.println("Another customer is there ? if No press 0 else press any number");
		int number1 = sc.nextInt();
		if (number1 == 0) {
			System.out.println("Thank you !");
			break;
		}
	}
		sc.close();
	}

}
