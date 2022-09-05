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
		int userBMIfinal = Math.round(userBMI);
		System.out.println("\nYour BMI is " + userBMIfinal);
		switch (userBMIfinal) {
			case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15: case 16:
				System.out.println("That's Severely Underweight");
			break;
			case 17: case 18:
				System.out.println("That's Underweight");
			break;
			case 19: case 20: case 21: case 22: case 23: case 24:
				System.out.println("That's Normal Weight");
			break;
			case 25: case 26: case 27: case 28: case 29:
				System.out.println("That's Overweight");
			break;
			case 30: case 31: case 32: case 33: case 34:
				System.out.println("That's Obesity class I");
			break;
			case 35: case 36: case 37: case 38: case 39:
				System.out.println("That's Obesity class II");
			break;
			case 40: case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49: case 50:
				System.out.println("That's Obesity class III");
			break;
			default:
				System.out.println("That's not a valid value");
			break;
		}

	}
}
