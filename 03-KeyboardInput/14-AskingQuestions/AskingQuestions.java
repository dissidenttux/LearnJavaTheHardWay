import java.util.Scanner;

public class AskingQuestions {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int age;
		double weight;
		String heightFeet, heightInches;

		System.out.print("How old are you? ");
		age = keyboard.nextInt();

		System.out.print("How many feet tall are you? ");
		heightFeet = keyboard.next();
		System.out.print("And how many inches? ");
		heightInches = keyboard.next();

		System.out.print("How much do you weigh? ");
		weight = Math.round(keyboard.nextDouble());
		// TODO: Fix this | "weight" has to be initialized before weightOutput can be used
		String weightOutput = String.format("%.0f", weight);

		System.out.println("So you're " + age + " years old, " + heightFeet + "'" + heightInches + "\"" + " tall and you weigh " + weightOutput + " pounds.");
	}
}
