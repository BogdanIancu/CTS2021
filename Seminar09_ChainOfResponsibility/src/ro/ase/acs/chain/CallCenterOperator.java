package ro.ase.acs.chain;

public class CallCenterOperator extends CallCenterHandler {
	@Override
	public boolean refund(double sum) {
		if (sum < 100) {
			System.out.println("Refund was handled by the call center operator");
			return true;
		} else if (nextHandler != null) {
			return nextHandler.refund(sum);
		}
		System.out.println("Refund not possible");
		return false;
	}
}
