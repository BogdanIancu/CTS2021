package ro.ase.acs.adapter;

public class LowCostToFlightBookingObjectAdapter extends FlightBooking {
	private LowCostFlightBooking lowCostFlightBooking;

	public LowCostToFlightBookingObjectAdapter(LowCostFlightBooking lowCostFlightBooking) {
		this.lowCostFlightBooking = lowCostFlightBooking;
	}

	@Override
	public boolean addBooking(int row, char seat) {
		lowCostFlightBooking.reserveSeat();
		return true;
	}

	@Override
	public void displaySeats() {
		lowCostFlightBooking.seatMap();
	}
}
