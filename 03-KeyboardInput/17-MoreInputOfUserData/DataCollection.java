import java.util.Scanner;

public class DataCollection {
	public static void main(String[] args) {

		//Class instantiation
		Scanner keyboard = new Scanner(System.in);

		// Variables
		String name, name2, login;
		byte grade;
		int id_student;
		float gpa;

		// CLI
		System.out.println("Please enter the following information so that I can profit!\n");

		// Input
		System.out.print("First name: ");
		name = keyboard.nextLine();
		System.out.print("Last name: ");
		name2 = keyboard.nextLine();
		System.out.print("Grade (9-12): ");
		grade = keyboard.nextByte();
		System.out.print("Student ID: ");
		id_student = keyboard.nextInt();
		keyboard.nextLine();
		System.out.print("Login: ");
		login = keyboard.nextLine();
		System.out.print("GPA (0.0-4.0): ");
		gpa = keyboard.nextFloat();

		// Output
		System.out.println("Your information:");
		System.out.println("\tLogin: " + login + "\n\tID: " + id_student + "\n\tName: " + name + "\n\tGPA: " + gpa + "\n\tGrade: " + grade);
	}
}
