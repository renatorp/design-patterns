package factoryMethod;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner userInput =  new Scanner(System.in);

		System.out.print("Type what kind of enemy(D/U): ");
		
		if (userInput.hasNextLine()) {
			Enemy e = EnemyFactory.createEnemy(userInput.nextLine());
			e.causeDamage();
		}
		
		userInput.close();
	}

}
