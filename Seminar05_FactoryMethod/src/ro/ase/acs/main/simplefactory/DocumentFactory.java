package ro.ase.acs.main.simplefactory;

public class DocumentFactory {

	public Document getDocument(DocumentType type, String fileName) throws NoSuchDocumentException {
		if(type == DocumentType.EXCEL) {
			return new ExcelDocument(fileName);
		} else if(type == DocumentType.WORD) {
			return new WordDocument(fileName);
		} else if(type == DocumentType.OPENOFFICE_TEXT) {
			return new OpenOfficeText();
		} else if(type == DocumentType.OPENOFFICE_SPREADSHEET) {
			return new OpenOfficeSpreadsheet();
		} throw new NoSuchDocumentException();
	}
}
