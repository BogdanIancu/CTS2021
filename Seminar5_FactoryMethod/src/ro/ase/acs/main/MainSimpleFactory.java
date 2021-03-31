package ro.ase.acs.main;

import ro.ase.acs.main.simplefactory.Document;
import ro.ase.acs.main.simplefactory.DocumentFactory;
import ro.ase.acs.main.simplefactory.DocumentType;
import ro.ase.acs.main.simplefactory.NoSuchDocumentException;

public class MainSimpleFactory {
	public static void main(String[] args) {
		DocumentFactory documentFactory = new DocumentFactory();
		try {			
			Document document = documentFactory.getDocument(
							DocumentType.OPENOFFICE_SPREADSHEET, "Doc");
			document.open();
		} catch (NoSuchDocumentException e) {
			e.printStackTrace();
		}
	}
}
