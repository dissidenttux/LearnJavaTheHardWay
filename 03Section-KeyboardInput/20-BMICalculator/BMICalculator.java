import java.util.Scanner;

public class BMICalculator {
	public static void main (String args[]) {

		Scanner keyboard = new Scanner(System.in);

		float userHeight, userWeight, userBMI;

		System.out.println("Your height in m: ");
		userHeight = keyboard.nextFloat();
		System.out.println("Your weight in kg: ");
		userWeight = keyboard.nextFloat();
		userBMI = userWeight / ( userHeight * userHeight);
		System.out.println("\nYour BMI is " + userBMI);

	}
}
