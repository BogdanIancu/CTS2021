package ro.ase.acs.state;

public class DeliveringProductState implements VendingMachineState {

	@Override
	public void doAction() {
		System.out.println("Please pick-up your product :)");
	}

}
