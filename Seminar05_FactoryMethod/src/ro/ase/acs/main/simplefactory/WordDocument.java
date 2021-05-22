package ro.ase.acs.main.simplefactory;

public class WordDocument implements Document{
	
	private String name;
	
	public WordDocument(String name) {
		this.name=name;
	}

	@Override
	public void open() {
		System.out.println(String.format("Opening file %s.docx...", name));
		
	}
}
