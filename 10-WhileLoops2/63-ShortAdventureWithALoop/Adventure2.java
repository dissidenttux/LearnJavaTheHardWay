import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;


/* BASIC ALGORITHM
 * 
 * There are six rooms, & two endings.
 * Let's do a haunted house theme and find a wolf.
 * 
 * 1. Foyer * 2. Staircase * 3. Kitchen *
 * 					4. Master Bedroom * 5. Living room * 6. Ballet room *
 */

public class Adventure2
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int nextroom = 1;
		String choice = "";

		while ( nextroom != 0 ) {

			/* Section 1: Beginning */
			if ( nextroom == 1 ) // Foyer
			{
				System.out.println( "You start in the foyer of a haunted house that has been rumoured to be, well, haunted. " +
				"There are creaks and slides that occupy the airspace, but nothing that tips you too over the edge. " +
				"You see two ways to traverse the house: one is a \"Staircase\", and another is what appears to be the \"Kitchen\"" );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("Staircase") )
					nextroom = 2;
				else if ( choice.equals("Kitchen") )
					nextroom = 3;
				else
					System.out.println( "ERROR." );
			}

			/* Section 2: Middle?? */
			if ( nextroom == 2 ) // Staircase
			{
				System.out.println( "The top of the staircase leads to a three-way split between three rooms:" +
				"\n- a \"Master bedroom\"\n- a \"Living room\"\n- a \"Ballet room\"\nAnd of course, you can always go \"back\"." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if (choice.equals("back"))
					nextroom = 1; // Foyer
				else if ( choice.equals("Master bedroom"))
					nextroom = 4;
				else if ( choice.equals("Living room"))
					nextroom = 5;
				else if ( choice.equals("Ballet room"))
					nextroom = 6;
				else
					System.out.println( "ERROR." );
			}

			if ( nextroom == 3 ) // Kitchen
			{
				System.out.println( "Seems like an ordinary kitchen that's caddy cornered. " +
				"There doesn't seem to be a crazy lot here, let's go \"back\"." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if (choice.equals("back"))
					nextroom = 1; // Foyer
				else
					System.out.println( "ERROR." );
			}

			/* Third Set - Upstairs */
			if ( nextroom == 4 ) // Master bedroom
			{
				System.out.println( "The master bedroom carries a slight cherry scent, and a warmth. Was someone.. here?" +
				"\nIt is probably for the best that we turn \"back\"." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("back") )
					nextroom = 2; // Staircase
				else
					System.out.println( "ERROR." );
			}

			if ( nextroom == 5 ) // Living room
			{
				nextroom = 0;
				System.out.println( "The end of the living room sat another being that was to alien to the 3rd dimension" +
					       "to describe. The shadow showed a stereotypical grey, with a certain mist flowing around " +
				       	       " it.\n\t\"You must leave.\"\nAnd so you did, but how you got back here is something that is"+
					       " a complete blur to you now, perhaps even completely lost."	       );
			}
			if ( nextroom == 6 ) // Ballet room
			{
				System.out.println( "This is the Ballet room, please \"dance\" now." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if (choice.equals("dance")) {
					System.out.println("And you danced until sunrise, then they came. Men in black. Flash. You sit at your" +
							"desk, this text being the only remnant of said memory.");
					nextroom = 0;
				}
				else
					System.out.println( "ERROR." );
			}
		}

		System.out.println( "\nEND." );
	}
	
}
