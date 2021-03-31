package ro.ase.acs.factorymethod;

import ro.ase.acs.main.simplefactory.Document;
import ro.ase.acs.main.simplefactory.NoSuchDocumentException;

public interface AbstractDocumentFactory {

	public Document getDocument(FileType type, String fileName) throws NoSuchDocumentException;
}
