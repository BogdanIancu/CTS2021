package ro.ase.acs.main;

import ro.ase.acs.contracts.Writeable;
import ro.ase.acs.contracts.Readable;

public class Orchestrator {
	private Readable reader;
	private Writeable writer;
	
	public Orchestrator(Readable reader, Writeable writer) {
		this.reader = reader;
		this.writer = writer;
	}
	
	public void execute() {
		writer.print(reader.read());
	}
}
