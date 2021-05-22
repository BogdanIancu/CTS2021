package ro.ase.acs.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
	private static Map<Character, CustomCharacter> map = new HashMap<>();

	public static CustomCharacter getCharacter(char character) {
		if (!map.containsKey(character)) {
			CustomCharacter customCharacter = new CustomFontCharacter(character, "Arial");
			map.put(character, customCharacter);
			System.out.println("Character created");
		} else {
			System.out.println("Character reused");
		}
		return map.get(character);
	};
}
