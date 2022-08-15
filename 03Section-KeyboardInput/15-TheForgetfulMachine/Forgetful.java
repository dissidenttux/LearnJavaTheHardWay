import java.util.Scanner;

public class Forgetful {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String word, word2;
		short num, num2;

		System.out.println("Give me a word!");
		keyboard.nextLine();
		System.out.println("Give me a second word!");
		keyboard.nextLine();

		System.out.println("Great, now your favorite number?");
		keyboard.nextShort();
		// keyboard.nextLine();
		System.out.println("And your second favorite number...");
		keyboard.nextShort();
		System.out.println("\nWhew! Wasn't that fun?");
	}
}
