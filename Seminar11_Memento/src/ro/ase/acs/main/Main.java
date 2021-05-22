package ro.ase.acs.main;

import ro.ase.acs.memento.DocumentEditor;

public class Main {

	public static void main(String[] args) {
		DocumentEditor editor = new DocumentEditor();
		editor.getDocument().setText("Memento ");
		editor.saveDocument();
		editor.getDocument().appendText("mori");
		editor.saveDocument();
		editor.getDocument().appendText("!");
		System.out.println(editor.getDocument().getText());
		editor.undo();
		System.out.println(editor.getDocument().getText());
		editor.undo();
		System.out.println(editor.getDocument().getText());
	}

}
