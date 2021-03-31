package ro.ase.acs.main.simplefactory;

public class OpenOfficeSpreadsheet implements Document {

	private String name="NewSpreadsheet";
	
	@Override
	public void open() {
		System.out.println(String.format("Opening file %s.ods...", name));		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
