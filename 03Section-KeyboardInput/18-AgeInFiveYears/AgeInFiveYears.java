import java.util.Scanner;

public class AgeInFiveYears {
	public static void main (String args[]) {

		String name;
		int age, agePlusFive, ageNegFive;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hello, what is your name?");
		name = keyboard.nextLine();
		System.out.println("Hi, " + name + " how old are you?");
		age = keyboard.nextInt();
		keyboard.nextLine();
		agePlusFive = age + 5;
		ageNegFive = age - 5;
		System.out.println("Did you know that in five years, you will be " + agePlusFive + "\nAnd five years ago, you were " + ageNegFive + "! Imagine that!");
	}
}
