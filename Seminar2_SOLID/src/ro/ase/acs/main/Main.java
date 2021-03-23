package ro.ase.acs.main;

import ro.ase.acs.contracts.Readable;
import ro.ase.acs.contracts.Writeable;
import ro.ase.acs.readers.ConsoleReader;
import ro.ase.acs.writers.ConsoleWriter;
import ro.ase.acs.writers.FileWriter;

public class Main {

	public static void main(String[] args) {
		IoC ioc = new IoC();
		ioc.register(Writeable.class, FileWriter.class);
		ioc.register(Readable.class, ConsoleReader.class);
		Orchestrator orchestrator =  
				new Orchestrator(
						ioc.resolve(Readable.class), 
						ioc.resolve(Writeable.class));
		orchestrator.execute();
	}

}
