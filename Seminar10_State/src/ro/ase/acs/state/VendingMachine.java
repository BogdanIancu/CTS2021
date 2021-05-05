package ro.ase.acs.state;

public class VendingMachine {
	private VendingMachineState state;
	private float amount;
	private float price;
	
	public VendingMachine() {
		state = new AcceptingMoneyState();
		state.doAction();
	}
	
	public void setState(VendingMachineState state) {
		this.state = state;
	}
	
	public void inputMoney(float amount) {
		this.amount = amount;
		if(amount < 1 || amount > 10) {
			setState(new RefusingMoneyState());
			state.doAction();
		} else {
			setState(new ProductSelectionState());
			state.doAction();
		}
	}
	
	public void selectProduct(float price) {
		this.price = price;
		if(amount >= this.price) {
			setState(new DeliveringProductState());
			state.doAction();
			this.amount -= price;
		} else {
			setState(new RefusingMoneyState());
			state.doAction();
		}
	}
}
