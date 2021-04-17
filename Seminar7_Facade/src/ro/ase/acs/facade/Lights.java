package ro.ase.acs.facade;

public class Lights {
	private boolean areHeadLightsOn;
	private boolean areBrakeLightsOn;
	private boolean areHazardLightsOn;
	private boolean isSignalLeftOn;
	private boolean isSignalRightOn;
	
	public boolean areHeadLightsOn() {
		return areHeadLightsOn;
	}
	
	public boolean areBrakeLightsOn() {
		return areBrakeLightsOn;
	}
	
	public boolean areHazardLightsOn() {
		return areHazardLightsOn;
	}
	
	public boolean isSignalLeftOn() {
		return isSignalLeftOn;
	}
	
	public boolean isSignalRightOn() {
		return isSignalRightOn;
	}
	
	public void setHeadLightsOn(boolean areHeadLightsOn) {
		this.areHeadLightsOn = areHeadLightsOn;
		System.out.println(areHeadLightsOn ? "HeadLights On" : "HeadLights Off");

	}
	
	public void setBrakeLightsOn(boolean areBrakeLightsOn) {
		this.areBrakeLightsOn = areBrakeLightsOn;
		System.out.println(areBrakeLightsOn ? "BrakeLights On" : "BrakeLights Off");
	}
	
	public void setHazardLightsOn(boolean areHazardLightsOn) {
		this.areHazardLightsOn = areHazardLightsOn;
		System.out.println(areHazardLightsOn ? "HazardLights On" : "HazardLights Off");
	}
	
	public void setSignalLeftOn(boolean isSignalLeftOn) {
		this.isSignalLeftOn = isSignalLeftOn;
		System.out.println(isSignalLeftOn ? "SignalLeft On" : "SignalLeft Off");
	}
	
	public void setSignalRightOn(boolean isSignalRightOn) {
		this.isSignalRightOn = isSignalRightOn;
		System.out.println(isSignalRightOn ? "SignalRight On" : "SignalRight Off");
	}
}
