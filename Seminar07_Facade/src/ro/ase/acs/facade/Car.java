package ro.ase.acs.facade;

public class Car {
	private Engine engine;
	private Brake brake;
	private Lights lights;
	
	//...
	
	public Engine getEngine() {
		return engine;
	}
	
	public Brake getBrake() {
		return brake;
	}
	
	public Lights getLights() {
		return lights;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void setBrake(Brake brake) {
		this.brake = brake;
	}
	
	public void setLights(Lights lights) {
		this.lights = lights;
	}
}
