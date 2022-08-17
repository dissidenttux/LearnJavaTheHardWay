import java.util.Scanner;

public class BMICalculator {
	public static void main (String args[]) {

		Scanner keyboard = new Scanner(System.in);

		float userHeight, userWeight, userBMI;

		System.out.println("Your height in inches: ");
		userHeight = keyboard.nextFloat();
		System.out.println("Your weight in pounds: ");
		userWeight = keyboard.nextFloat();
		/* Metric calculations:
		userBMI = userWeight / (userHeight * userHeight); */
		/* Imperial calculations: */
		userBMI = ((userWeight / userHeight) / userHeight) * 703;
		System.out.println("\nYour BMI is " + userBMI);

	}
}
