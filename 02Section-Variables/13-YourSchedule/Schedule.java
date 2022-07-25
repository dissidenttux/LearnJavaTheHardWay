public class Schedule {
	public static void main( String[] args ) {
		/* Variables for the user, ie the courses and the teachers associated */
		// declaring
		String course1, course2, course3, course4, course5, course6, course7, course8;
		String mentor1, mentor2, mentor3, mentor4, mentor5, mentor6, mentor7, mentor8;

		// initialization
		course1 = "Gym";
		course2 = "Sex Ed";
		course3 = "Philosophy";
		course4 = "Theoretical Physics";
		course5 = "Algebra";
		course6 = "Defense Against the Dark Arts";
		course7 = "Basic Economics";
		course8 = "Writing for Visual Theatre";

		mentor1 = "Sgt. Hardie";
		mentor2 = "Dr. Kurtas";
		mentor3 = "Mr. Etruscas";
		mentor4 = "Dr. Freeman";
		mentor5 = "Ms. Avaelon";
		mentor6 = "Prof. Snape";
		mentor7 = "Dr. Sowell";
		mentor8 = "The Joker";

		// TUI
		System.out.println("+------------------------------------------------------------+");
		System.out.println("| 1 |                                   " + course1 + "|      " + mentor1 + "|");
		System.out.println("| 2 |                                " + course2 + "|       " + mentor2 + "|");
		System.out.println("| 3 |                            " + course3 + "|     " + mentor3 + "|");
		System.out.println("| 4 |                   "+ course4 + "|      " + mentor4 + "|");
		System.out.println("| 5 |                               " + course5 + "|      " + mentor5 + "|");
		System.out.println("| 6 |         " + course6 + "|      " + mentor6 + "|");
		System.out.println("| 7 |                       " + course7 + "|       " + mentor7 + "|");
		System.out.println("| 8 |            " + course8 + "|        " + mentor8 + "|");
		System.out.println("+------------------------------------------------------------+");
	}
}
