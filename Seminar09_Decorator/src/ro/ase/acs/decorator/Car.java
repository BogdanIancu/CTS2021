package ro.ase.acs.decorator;

public final class Car implements Vehicle {
	private String color;
	private float power;
	private int noOfDoors;

	public Car() {
		this.color = "white";
		this.power = 50;
		this.noOfDoors = 2;
	}

	public Car(String color, float power, int noOfDoors) {
		this.color = color;
		this.power = power;
		this.noOfDoors = noOfDoors;
	}

	public String getColor() {
		return color;
	}

	public float getPower() {
		return power;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	@Override
	public void start() {
		System.out.println("The car has started!");
	}

	@Override
	public void stop() {
		System.out.println("The car has stopped!");

	}
}
