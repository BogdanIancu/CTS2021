package ro.ase.acs.obsever;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
	private List<Observer> observers = new ArrayList<>();
	
	public void subscribe(Observer observer) {
		observers.add(observer);
	}
	
	public void unsubscribe(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers(String message) {
		for(Observer o : observers) {
			o.notification(message);
		}
	}
}
