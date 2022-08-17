public class WhatIf {
	public static void main( String[] args ) {

		int people = 20;
		int cats = 20;
		int dogs = 15;

		if (people < cats) {
			System.out.println("Too many cats! The world is doomed!");
		}

		if (people > cats) {
			System.out.println("Not many cats! The world is saved!");
		}

		if (people < dogs) {
			System.out.println("The world is drooled on!");
		}

		if (people > dogs) {
			System.out.println("The world is dry!");
		}

		dogs += 5;

		if (people >= dogs) {
			System.out.println("People are greater than or equal to dogs.");
		}

		if (people <= dogs) {
			System.out.println("People are less than or equal to dogs.");
		}

		if (people == dogs) {
			System.out.println("People are dogs.");
		}
	}
}

/* WHAT YOU SHOULD DO ON YOUR OWN
	1. The if statement is a programming conditional statement that, if proved true, performs a function.
	2. The purpose of the curly braces in an if statement is to separate the conditional parto from the
		function it performs.
	3. n/a



*/
