package ro.ase.acs.chain;

public class SalesManager extends CallCenterHandler {
	@Override
	public boolean refund(double sum) {
		if (sum < 5000) {
			System.out.println("Refund was handled by the sales manager");
			return true;
		} else {
			System.out.println("The refund can not be handled via call center");
			return false;
		}
	}
}
