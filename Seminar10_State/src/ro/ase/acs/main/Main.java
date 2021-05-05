package ro.ase.acs.main;

import ro.ase.acs.state.VendingMachine;

public class Main {

	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine();
		vendingMachine.inputMoney(5);
		vendingMachine.selectProduct(3);
		vendingMachine.selectProduct(2);
		
		vendingMachine.inputMoney(20);
	}

}
