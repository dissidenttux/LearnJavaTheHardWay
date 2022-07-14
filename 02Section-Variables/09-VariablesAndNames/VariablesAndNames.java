/* If you get stuck with this exercise, remember the tricks you've been taught so
   2far for finding differences and focusing on details:

    Write a comment above each line explaining to yourself what it does in English.
    Read your .java file backwards.
    Read your .java file out loud, saying even the punctuation and symbols.  */

public class VariablesAndNames {
	public static void main(String[] args) {
		int cars, drivers, passengers, cars_not_driven, cars_driven;
		double space_in_a_car, carpool_capacity, average_passengers_per_car;

		cars = 100;
		space_in_a_car = 4.0;
		drivers = 30;
		passengers = 90;
		cars_not_driven = cars - drivers; //by default, the pure value is "70"
		cars_driven = drivers;
		carpool_capacity = cars_driven * space_in_a_car; // default, pure value is "120.0"
		average_passengers_per_car = passengers / cars_driven; // pure value is "3"

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

	

    3. Write comments above each of the variable assignments.
    4. Make sure you know what = is called (equals) and that it's making names for things.
    5. Remember _ is an underscore character.
