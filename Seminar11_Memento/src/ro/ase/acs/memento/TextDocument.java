package ro.ase.acs.memento;

public class TextDocument implements Cloneable {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public void appendText(String text) { 
		this.text += text;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		TextDocument copy = (TextDocument)super.clone();
		copy.text = text;
		return copy;
	}
}
