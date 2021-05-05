package ro.ase.acs.state;

public class RefusingMoneyState implements VendingMachineState {

	@Override
	public void doAction() {
		System.out.println("Money returned :(");
	}
	

}
