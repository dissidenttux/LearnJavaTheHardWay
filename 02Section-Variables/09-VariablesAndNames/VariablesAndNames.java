/* If you get stuck with this exercise, remember the tricks you've been taught so
   2far for finding differences and focusing on details:

    Write a comment above each line explaining to yourself what it does in English.
    Read your .java file backwards.
    Read your .java file out loud, saying even the punctuation and symbols.  */

public class VariablesAndNames {
	public static void main(String[] args) {
		int cars, drivers, passengers, cars_not_driven, cars_driven;
		double space_in_a_car, carpool_capacity, average_passengers_per_car;

		// Variable assignment of an integer value of "100" to the variable "cars"
		cars = 100;
		// Variable assignment of a floating point value of "4.0" to the variable "space_in_a_car"
		space_in_a_car = 4.0;
		// assign int "30" to the var "cars"
		drivers = 30;
		// assign int "90" to the var "passengers"
		passengers = 90;
		// assign value of cars (100) negative drivers (30) to the var "cars_not_driven" (70)
		cars_not_driven = cars - drivers;
		// assign val drivers (30) to the var "cars_driven"
		cars_driven = drivers;
		// assign val cars_driven (drivers, 30) times space_in_a_car (4.0) to the var "cars" (120.0)
		carpool_capacity = cars_driven * space_in_a_car;
		// assign val passengers (90) divided by cars_driven (drivers, 30) to the var "cars" (3)
		average_passengers_per_car = passengers / cars_driven;

		System.out.println("There are " + cars + " cars available.");
		System.out.println("There are only " + drivers + " drivers available.");
		System.out.println("There will be " + cars_not_driven + " empty cars today.");
		System.out.println("We can transport " + carpool_capacity + " people today.");
		System.out.println("We have " + passengers + " to carpool today.");
		System.out.println("We need to put about " + average_passengers_per_car + " in each car.");
	}
}

/* Assignments turned in without these things will not receive any points.

    1. I used 4.0 for space_in_a_car, but is that necessary? What happens if it's just 4?

	No, it's not necessary. The floating point number just reverts to "120" without the 0-hundreth.

    2. Remember that 4.0 is a "floating point" number. Find out what that means.

	Floats represent a bypass in how computers represent non-integer, decimal numbers, (i.e. "floating point representation")
	with "floating" referring to how the radix point (or radix character, or the "dot" ".") can more higher or lower when
	multipled by a exponent (power).

    3. Write comments above each of the variable assignments.
    4. Make sure you know what = is called (equals) and that it's making names for things.
    5. Remember _ is an underscore character.
