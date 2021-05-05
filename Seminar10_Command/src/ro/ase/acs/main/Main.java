package ro.ase.acs.main;

import ro.ase.acs.command.BurgerOrder;
import ro.ase.acs.command.Chef;
import ro.ase.acs.command.FoodOrder;
import ro.ase.acs.command.PizzaOrder;
import ro.ase.acs.command.Waiter;

public class Main {

	public static void main(String[] args) {
		Chef chef = new Chef();
		Waiter waiter = new Waiter();
		
		FoodOrder order1 = new BurgerOrder(chef);
		waiter.addOrder(order1);
		
		FoodOrder order2 = new PizzaOrder(chef);
		waiter.addOrder(order2);
		
		FoodOrder order3 = new BurgerOrder(chef);
		waiter.addOrder(order3);
		
		waiter.sendOrdersToKitchen();
	}

}
