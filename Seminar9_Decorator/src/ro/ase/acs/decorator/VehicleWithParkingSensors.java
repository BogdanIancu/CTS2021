package ro.ase.acs.decorator;

public class VehicleWithParkingSensors extends VehicleDecorator {
	private int noOfSensors;

	public VehicleWithParkingSensors(Vehicle vehicle, int noOfSensors) {
		super(vehicle);
		this.noOfSensors = noOfSensors;
	}

	@Override
	public void start() {
		super.start();
		System.out.println(String.format("%d sensors have been activated!", noOfSensors));
	}

	@Override
	public void stop() {
		super.stop();
		System.out.println(String.format("%d sensors have been deactivated!", noOfSensors));
	}
}
