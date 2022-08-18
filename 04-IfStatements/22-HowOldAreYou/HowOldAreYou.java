import java.util.Scanner;

public class HowOldAreYou {
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How old are you?");
		int userAge = keyboard.nextInt();

		if (userAge < 16) {
			System.out.println("You can't drive");
		}
		if (userAge < 18) {
			System.out.println("You can't vote");
		}
		if (userAge < 25) {
			System.out.println("You can't rent a car");
		}
		if (userAge > 25) {
			System.out.println("You can do anything that's legal");
		}

	}
}
