import java.util.Scanner;

public class DumbCalculator {
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);

		float numFirst, numSecond, numThird;

		System.out.println("What is the first number?");
		numFirst = keyboard.nextFloat();
		System.out.println("What is the second number?");
		numSecond = keyboard.nextFloat();
		System.out.println("What is the third number?");
		numThird = keyboard.nextFloat();
		System.out.println("(" + numFirst + " + " + numSecond + " + " +  numThird + ") / 2 is.. " + ((numFirst + numSecond + numThird) / 2));
	}
}
