package ro.ase.acs.chain;

public class CallCenterManager extends CallCenterHandler {
	@Override
	public boolean refund(double sum) {
		if (sum < 1000) {
			System.out.println("Refund was handled by the call center manager");
			return true;
		} else if (nextHandler != null) {
			return nextHandler.refund(sum);
		}
		System.out.println("Refund not possible");
		return false;
	}
}
