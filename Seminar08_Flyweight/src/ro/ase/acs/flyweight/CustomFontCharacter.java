package ro.ase.acs.flyweight;

public class CustomFontCharacter implements CustomCharacter {

	private char character;
	private String font;
	private int fontSize;
	private boolean isBold;
	private boolean isItalic;

	public CustomFontCharacter(char character, String font) {
		this.character = character;
		this.font = font;
	}

	public char getCharacter() {
		return character;
	}

	public void setCharacter(char character) {
		this.character = character;
	}

	public String getFont() {
		return font;
	}

	public void setFont(String font) {
		this.font = font;
	}

	public int getFontSize() {
		return fontSize;
	}

	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}

	public boolean isBold() {
		return isBold;
	}

	public void setBold(boolean bold) {
		isBold = bold;
	}

	public boolean isItalic() {
		return isItalic;
	}

	public void setItalic(boolean italic) {
		isItalic = italic;
	}

	@Override
	public void display(Location location) {
		System.out.println(character + "@ " + location.getX() + ", " + location.getY() + font);
	}
}
