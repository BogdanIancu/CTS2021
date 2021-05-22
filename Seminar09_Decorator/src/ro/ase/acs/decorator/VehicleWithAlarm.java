package ro.ase.acs.decorator;

public class VehicleWithAlarm extends VehicleDecorator {
	private boolean isAlarmOn;

	public VehicleWithAlarm(Vehicle vehicle) {
		super(vehicle);
	}
	
	public boolean getAlarmStatus() {
		return isAlarmOn;
	}

	public void activateAlarm() {
		isAlarmOn = true;
		System.out.println("The alarm has been activated!");
	}

	public void deactivateAlarm() {
		isAlarmOn = false;
		System.out.println("The alarm has been deactivated!");
	}

	@Override
	public void stop() {
		super.stop();
		activateAlarm();
	}
}
