package ro.ase.acs.memento;

import java.util.ArrayList;
import java.util.List;

public class DocumentHistoryManager {
	private List<TextDocument> documents = new ArrayList<>();
	
	public void addDocument(TextDocument document) {
		try {
			documents.add((TextDocument)document.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	
	public TextDocument getPreviousVersion() {
		if(documents.size() > 0) {
			TextDocument document = documents.get(documents.size() - 1);
			documents.remove(document);
			return document;
		}
		return null;
	}
}
