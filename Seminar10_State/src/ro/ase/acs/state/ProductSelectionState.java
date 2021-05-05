package ro.ase.acs.state;

public class ProductSelectionState implements VendingMachineState {

	@Override
	public void doAction() {
		System.out.println("Please select your product...");
	}

}
