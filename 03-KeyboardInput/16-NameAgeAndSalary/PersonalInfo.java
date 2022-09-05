import java.util.Scanner;

public class PersonalInfo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String name;
		byte age;
		float wage;

		System.out.println("\nHello, what is your name?");
		name = keyboard.nextLine();

		System.out.println("\nHi, " + name + ". How old are you?");
		age = keyboard.nextByte();

		System.out.println("\nSo, you're " + age + ", eh? That's not old at all!\nHow much do you make, " + name + "?");
		wage = keyboard.nextFloat();

		System.out.println(wage + "! I hope that's per hour and not per year! LOL!");
	}
}
