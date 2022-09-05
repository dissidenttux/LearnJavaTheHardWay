import java.util.Scanner;

public class SafeSquareRoot {
  public static void main (String arg[]) {

    Scanner kb = new Scanner(System.in);

    int numUserDisplay;
    double numUser, numRooted;

    /* BASIC ALGORITHM
     * 1. Take a user's number
     * 2. Take the square root of user's number
     * 3. Use a loop to check if the number is positive
     * 4. IF number is negative, THEN print a warning and make them type another number
    */

    // user input & prompt, plus idiot proofing
    do {
      System.out.println("Please insert a valid number...");
      System.out.print("> ");
      numUser = kb.nextDouble();
      numUserDisplay = (int) numUser; // converts an integer display to show a similar number at the end prompt
    } while (numUser < 0); // idiot proof tester (you can't sqrt a negative number)

    // calculations
    numRooted = Math.sqrt(numUser); // square roots the number the user inputted

    // user output prompt
    System.out.println("The square root of " + numUserDisplay + " is " + numRooted);

  }
}