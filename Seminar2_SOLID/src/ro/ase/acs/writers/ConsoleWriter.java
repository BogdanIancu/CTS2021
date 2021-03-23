package ro.ase.acs.writers;

import ro.ase.acs.contracts.Writeable;

public class ConsoleWriter implements Writeable {
	
	public void print(String message) {
		System.out.println(message);
	}	
}
