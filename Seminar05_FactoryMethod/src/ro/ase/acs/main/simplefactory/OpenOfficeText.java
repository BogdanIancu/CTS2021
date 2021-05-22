package ro.ase.acs.main.simplefactory;

public class OpenOfficeText implements Document {

	private String name="NewTextDocument";
	
	@Override
	public void open() {
		System.out.println(String.format("Opening file %s.odt...", name));		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
