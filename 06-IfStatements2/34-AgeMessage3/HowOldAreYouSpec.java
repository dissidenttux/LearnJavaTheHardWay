import java.util.Scanner;

public class HowOldAreYouSpec {
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How old are you?");
		int userAge = keyboard.nextInt();


		if (userAge < 16) {
			System.out.println("You can't drive");
		}
		if (userAge > 15 && userAge < 18) {
			System.out.println("You can drive, but can't vote");
		}
		if (userAge >= 18 && userAge <= 24) {
			System.out.println("You can vote, but can't rent a car");
		}
		if (userAge > 24) {
			System.out.println("You can pretty much do anything that's legal");
		}
		
	}
}
