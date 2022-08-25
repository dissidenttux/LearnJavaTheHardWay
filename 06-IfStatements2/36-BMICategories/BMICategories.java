import java.util.Scanner;

public class BMICategories {
	public static void main (String args[]) {

		Scanner kb = new Scanner(System.in);

    String BMICategory = "";
		float userHeight, userWeight, userBMI;

		System.out.println("Your height in inches: ");
		System.out.print("> ");
		userHeight = kb.nextFloat();
		
		System.out.println("Your weight in pounds: ");
		System.out.print("> ");
		userWeight = kb.nextFloat();

    kb.close();

		/* Metric calculations:
		userBMI = userWeight / (userHeight * userHeight); */
		/* Imperial calculations: */
		userBMI = ((userWeight / userHeight) / userHeight) * 703;
		// used to round userBMI to the nearest tenth AND properly display BMI
		double userBMIfinal = Math.round(userBMI * 10) / 10.0;

    if (userBMIfinal < 15.0) {
      BMICategory = BMICategory.replace("","very severely underweight");
    }
    if (userBMIfinal >= 15.0 && userBMIfinal <= 16.0) {
      BMICategory = BMICategory.replace("","severely underweight");
    }
    if (userBMIfinal >= 16.1 && userBMIfinal <= 18.4) {
      BMICategory = BMICategory.replace("","underweight");
    }
    if (userBMIfinal >= 18.5 && userBMIfinal <= 24.9) { 
      BMICategory = BMICategory.replace("","normal weight");
    }
    if (userBMIfinal >= 25.0 && userBMIfinal <= 29.9) {
      BMICategory = BMICategory.replace("","overweight");
    }
    if (userBMIfinal >= 30.0 && userBMIfinal <= 34.9) {
      BMICategory = BMICategory.replace("","moderately obese");
    }
    if (userBMIfinal >= 35.0 && userBMIfinal <= 39.9) {
      BMICategory = BMICategory.replace("","severely obese");
    }
    if (userBMIfinal >= 40.0) { //
      BMICategory = BMICategory.replace("","morbidly obese");
    }

		// output
		System.out.println("\nYour BMI is " + userBMIfinal);
    System.out.println("BMI Category: " + BMICategory);

	}
}
