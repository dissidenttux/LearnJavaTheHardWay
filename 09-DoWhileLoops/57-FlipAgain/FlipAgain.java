import java.util.Random;
import java.util.Scanner;

public class FlipAgain {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();

		// TODO: Find the method "equals" equivalent for "char" primitive data types
		System.out.println("Would you like to flip a coin? (y/n)");
		String again = keyboard.nextLine(); // take input from the user, a String

		while ( again.equals("y") ) {
			int flip = rng.nextInt(2); // pick a number between zero and one, zero is heads, tails is one
			String coin;

			if ( flip == 0 ) {
				coin = "HEADS"; // 0 is heads
			} else {
				coin = "TAILS"; // 1 is tails
			}

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? " );
			again = keyboard.next();
		}

	}
}
