package ro.ase.acs.main;

import ro.ase.acs.adapter.AbstractFlightBooking;
import ro.ase.acs.adapter.FlightBooking;
import ro.ase.acs.adapter.LowCostFlightBooking;
import ro.ase.acs.adapter.LowCostToFlightBookingClassAdapter;
import ro.ase.acs.adapter.LowCostToFlightBookingObjectAdapter;

public class Main {

	public static void main(String[] args) {
		FlightBooking booking = new FlightBooking();
		booking.addBooking(2, 'B');
		booking.addBooking(2, 'C');
		booking.displaySeats();
		
		System.out.println();
		LowCostFlightBooking lowCostBooking= new LowCostFlightBooking();
		lowCostBooking.reserveSeat();
		lowCostBooking.reserveSeat();
		lowCostBooking.seatMap();
		
		System.out.println();
		FlightBooking newBooking = 
				new LowCostToFlightBookingObjectAdapter(lowCostBooking);
		newBooking.addBooking(2, 'B');
		newBooking.addBooking(2, 'C');
		newBooking.displaySeats();
		
		System.out.println();
		AbstractFlightBooking classBooking = 
				new LowCostToFlightBookingClassAdapter();
		classBooking.addBooking(2, 'B');
		classBooking.addBooking(2, 'C');
		classBooking.displaySeats();
	}

}
