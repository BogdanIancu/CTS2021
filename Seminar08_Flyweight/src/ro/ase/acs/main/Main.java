package ro.ase.acs.main;

import java.util.Scanner;

import ro.ase.acs.flyweight.CharacterFactory;
import ro.ase.acs.flyweight.CustomCharacter;
import ro.ase.acs.flyweight.Location;

public class Main {

	public static void main(String[] args) {
		char key = 0;
		int x = 0;
		int y = 0;

		Scanner scanner = new Scanner(System.in);

		while (key != '^') {
			x++;
			if (x > 10) {
				y++;
				x = 0;
			}
			key = scanner.next().charAt(0);
			CustomCharacter customCharacter = CharacterFactory.getCharacter(key);
			customCharacter.display(new Location(x, y));
		}	
		scanner.close();
	}

}
