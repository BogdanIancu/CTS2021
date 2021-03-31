package ro.ase.acs.factorymethod;

import ro.ase.acs.main.simplefactory.Document;
import ro.ase.acs.main.simplefactory.ExcelDocument;
import ro.ase.acs.main.simplefactory.NoSuchDocumentException;
import ro.ase.acs.main.simplefactory.WordDocument;

public class MicrosoftOfficeFactory implements AbstractDocumentFactory {

	@Override
	public Document getDocument(FileType type, String fileName) throws NoSuchDocumentException {
		if(type == FileType.DOCUMENT) {
			return new WordDocument(fileName);
		} else if(type == FileType.SPREADSHEET) {
			return new ExcelDocument(fileName);
		} throw new NoSuchDocumentException();
	}

}
