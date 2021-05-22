package ro.ase.acs.facade;

//FACADE
public class Cockpit {
	private Engine engine = new Engine();
	private Brake brake = new Brake();
	private Lights lights = new Lights();
	
	public void startCar() {
		brake.setLoad(1);
		engine.start();
		engine.setThrottle(0.1f);
		lights.setHeadLightsOn(true);
		lights.setBrakeLightsOn(true);
	}
	
	public void stopCar() {
		engine.stop();
		brake.setLoad(1);
		lights.setBrakeLightsOn(false);
		lights.setHeadLightsOn(false);
	}
	
	public void emergencyStop() {
		brake.setLoad(1);
		engine.stop();
		lights.setBrakeLightsOn(true);
		lights.setHazardLightsOn(true);
	}
	
	//..
}
