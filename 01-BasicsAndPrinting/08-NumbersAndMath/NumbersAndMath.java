// declares a Java class
public class NumbersAndMath {
	/* 	PRE-REWRITE CODE
	//creates a main method
	public static void main(String[] args){
		// print statement that produces whatever it's between the parenthesis on stdout
		System.out.println( "I will now count my chickens:" );
                // print statement that prints the string + the number "30"
		System.out.println( "Hens " + (25 + 30 / 6) );
                // print statement that prints the string and the number "97"
		System.out.println( "Roosters " + (100 - 25 * 3 % 4) );
                // print statement that produces whatever it's between the parenthesis on stdout
		System.out.println( "Now I will count the eggs:" );
                // print statement that prints the number 7
		System.out.println( 3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6 );
                 // print statement that prints the following string to stdout
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
		// print boolean statment that prints "false"
		System.out.println( 3 + 2 < 5 - 7 );
		// print statment that prints the following string, with the number "5" concatenated to it
		System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );
		// print statement that prints the following string, with the number "-2" concatenated to it
		System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );
		// print statement that prints the following string
		System.out.println( "Oh, that's why it's false." );
		// print statement that prints the following string
		System.out.println( "How about some more." );
		// print boolean statement that prints the string plus "true"
		System.out.println( "Is it greater? " + ( 5 > -2 ) );
		// print boolean statement that prints the string plus "true"
		System.out.println( "Is it greater or equal? " + (5 >= -2) );
		// print boolean statement that prints the string plus "false"
		System.out.println( "Is it less or equal? " + ( 5 <= -2) );
	}
	*/

	/* 	QUESTIONS
		2. Floating point numbers are decimal point numbers that are used to calculate imprecise equations
		within the single-precision 32 bit format.
		3. Below is a rewrite of the NumbersAndJava program with float in mind in order to have more correct math.
	*/
	/* 	REWRITE CODE	*/
	// creates a main method
        public static void main(String[] args) {
               // print statement that produces whatever it's between the parenthesis on stdout
               System.out.println( "I will now count my chickens:" );
               // print statement that prints the string + the number "30"
               System.out.println( "Hens " + (25.0f + 30.0f / 6.0f) );
               // print statement that prints the string and the number "97"
               System.out.println( "Roosters " + (100.0f - 25.0f * 3.0f % 4.0f) );
               // print statement that produces whatever it's between the parenthesis on stdout
               System.out.println( "Now I will count the eggs:" );
               // print statement that prints the number 7
               System.out.println( 3.0f + 2.0f + 1.0f - 5.0f + 4.0f % 2.0f - 1.0f / 4.0f + 6.0f );
               // print statement that prints the following string to stdout
               System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
               // print boolean statment that prints "false"
               System.out.println( 3.0f + 2.0f < 5.0f - 7.0f );
               // print statment that prints the following string, with the number "5" concatenated to it
               System.out.println( "What is 3 + 2? " + ( 3.0f + 2.0f ) );
               // print statement that prints the following string, with the number "-2" concatenated to it
               System.out.println( "What is 5 - 7? " + ( 5.0f - 7.0f ) );
               // print statement that prints the following string
               System.out.println( "Oh, that's why it's false." );
               // print statement that prints the following string
               System.out.println( "How about some more." );
               // print boolean statement that prints the string plus "true"
               System.out.println( "Is it greater? " + ( 5.0f > -2.0f ) );
               // print boolean statement that prints the string plus "true"
               System.out.println( "Is it greater or equal? " + (5.0f >= -2.0f) );
               // print boolean statement that prints the string plus "false"
               System.out.println( "Is it less or equal? " + ( 5.0f <= -2.0f) );
	}
}
