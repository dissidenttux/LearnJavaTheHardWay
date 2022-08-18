public class ElseAndIf {
	public static void main ( String args[] ) {
		int people = 30;
		int cars = 40;
		int buses = 15;

		if (cars > people) {
			System.out.println("We should take the cars.");
		}
		if (cars < people) {
			System.out.println("We should not take the cars.");
		}
		else {
			System.out.println("We can't decide.");
		}

		if (buses > cars) {
			System.out.println("That's too many buses.");
		}
		else if (buses < cars) {
			System.out.println("Maybe we could take the buses");
		}
		else {
			System.out.println("We still can't decide");
		}

		if ( people > buses ) {
			System.out.println("All right, let's just take the buses.");
		}
		else {
			System.out.println("Fine, let's just stay home then.");
		}
	}
}

/* WHAT YOU SHOULD DO ON YOUR OWN
	1. "Else if" is a statement that will serve as the next conditional following the failure of conditions qualifying an if conditional.
	   "Else" serves as the following conditional provided the "else if" fails
	2. Removing the else part at the beginning of the one of the else if statements enables the "else" statement to fire on it's own,
	   removing the conditional properties of the if-else_if-else chain, and printing the function of both the "if" and the "else" statement, causing logical error.

*/
