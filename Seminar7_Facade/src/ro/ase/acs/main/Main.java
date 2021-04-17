package ro.ase.acs.main;

import ro.ase.acs.facade.Cockpit;

public class Main {
	public static void main(String[] args) {
		Cockpit cockpit = new Cockpit();
		
		cockpit.startCar();
		System.out.println("-----");
		cockpit.stopCar();
		System.out.println("-----");
		cockpit.emergencyStop();
		System.out.println("-----");
	}
}
