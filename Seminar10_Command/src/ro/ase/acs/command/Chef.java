package ro.ase.acs.command;

public class Chef {
	//...
	
	public void cookPizza() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The pizza is ready!");
	}
	
	public void cookBurger() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The burger is ready!");
	}
}
