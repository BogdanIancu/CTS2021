package ro.ase.acs.main;

import ro.ase.acs.template.PartsMover;
import ro.ase.acs.template.Robot;
import ro.ase.acs.template.Worker;

public class Main {

	public static void main(String[] args) {
		PartsMover partsMover = new Robot();
		partsMover.movePart();
		
		partsMover = new Worker();
		partsMover.movePart();
	}

}
