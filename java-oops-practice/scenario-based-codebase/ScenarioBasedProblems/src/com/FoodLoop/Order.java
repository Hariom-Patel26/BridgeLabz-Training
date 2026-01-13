package com.FoodLoop;
import java.util.ArrayList;
import java.util.List;
public class Order implements IOrderable{
	
	private List<FoodItem> orderList;
	
	Order (){
		orderList = new ArrayList<>();
	}
	@Override
	public void placeOrder(FoodItem item) {
		if (!item.getAvailability()) {
			System.out.println("Sorry ! The item is not available. Please try anything else");
		}
		else {
		orderList.add(item);
		}
	}
	@Override
    public void cancleOrder(FoodItem item) {
		if (orderList.contains(item)) {
		orderList.remove(item);
		}
		else {
			System.out.println("You haven't order this item yet ! Item cannot cancled");
		}
	}
	double total;
	public double getTotal() {
		for (FoodItem cost : orderList) {
		total+=cost.getPrice();
		}
		return total;
	}
	public double applyDiscount () {
		if (total >=1000) {
			total -= (total/100)*15;
			return total;
		}
		if (total >=500) {
			total -= (total/100)*10;
			return total;
		}
		System.out.println("No discount is available");
		return total;
		
		    
	}
	
	
}
