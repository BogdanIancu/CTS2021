package ro.ase.acs.memento;

public class DocumentEditor {
	private TextDocument document;
	private DocumentHistoryManager historyManager = 
			new DocumentHistoryManager();
	
	public DocumentEditor() {
		document = new TextDocument();
		document.setText("");
	}
	
	public TextDocument getDocument() {
		return document;
	}
	
	public void saveDocument() {
		historyManager.addDocument(document);
	}
	
	public void undo() {
		this.document = historyManager.getPreviousVersion();
	}
}
