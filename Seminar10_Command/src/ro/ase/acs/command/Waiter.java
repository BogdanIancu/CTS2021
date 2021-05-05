package ro.ase.acs.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
	private List<FoodOrder> orders = new ArrayList<FoodOrder>();
	
	public void addOrder(FoodOrder order) {
		orders.add(order);
	}
	
	public void sendOrdersToKitchen() {
		for(FoodOrder order : orders) {
			order.cook();
		}
		orders.clear();
	}
}
