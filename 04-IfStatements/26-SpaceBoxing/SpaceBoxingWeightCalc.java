import java.util.Scanner;

public class SpaceBoxingWeightCalc {

	public static float PlanetWeighter(byte planet) {

		float planetWeightMult = 0.0f; // "Mult" being Multiplier

		if (planet == 1) { // Venus
			planetWeightMult = .78f;
		} else if (planet == 2) { // Mars
			planetWeightMult = .39f;
		} else if (planet == 3) { // Jupiter
			planetWeightMult = 2.65f;
		} else if (planet == 4) { // Saturn
			planetWeightMult = 1.17f;
		} else if (planet == 5) { // Uranus
			planetWeightMult = 1.05f;
		} else if (planet == 6) { // Neptune
			planetWeightMult = 1.23f;
		} else {
			System.out.println("Not a valid option.");
		}
		return planetWeightMult;
	}


	public static void main (String args[]) {

		Scanner keyboard = new Scanner(System.in);

		byte userChoicePlanet;
		int userEarthWeight;
		float userPlanetWeight;

		System.out.println("\nPlease enter your current Earth weight:");
		userEarthWeight = keyboard.nextInt();
		System.out.println("\nI have information on the following planets:\n1. Venus\t2. Mars\t\t3. Jupiter\t4. Saturn\t5. Uranus\t6. Neptune\n\nWhich planet are you visiting?");
		userChoicePlanet = keyboard.nextByte();
		System.out.println("\nYour weight for the selected planet is " + PlanetWeighter(userChoicePlanet) * userEarthWeight + " pounds.");

	}
}
