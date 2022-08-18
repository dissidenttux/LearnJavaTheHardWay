import java.util.Scanner;

public class HowOldAreYouSpec {
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How old are you?");
		int userAge = keyboard.nextInt();

		if (userAge < 16) {
			System.out.println("You can't drive");
		} else if (userAge < 18) {
			System.out.println("You can't vote");
		} else if (userAge <= 25) {
			System.out.println("You can't rent a car");
		} else {
			System.out.println("You can do anything that's legal");
		}

	}
}
