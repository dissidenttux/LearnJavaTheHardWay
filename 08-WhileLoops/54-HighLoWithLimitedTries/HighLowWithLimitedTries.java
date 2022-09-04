import java.util.Scanner; // classes
import java.util.Random;


public class HighLowWithLimitedTries {
  public static void main (String args[]) {

    // instances
    Scanner kb = new Scanner(System.in); // keyboard
    Random rand = new Random(); // random

    // variables
    int numRand = rand.nextInt(3) + 1; // generates a number between 1-100 //TODO: change num back to 100
    int numGuess; // number that the user inputs to guess numRand
    int numTurn = 0; // number of times user numGuess's

    // user prompts
    System.out.println("Guess a number between 1-100. ");
    numTurn++;
    System.out.print("Guess #" + numTurn + ": ");
    numGuess = kb.nextInt();

    while (numGuess != numRand && numTurn < 7) {
      numTurn++;
      System.out.print("Guess #" + numTurn + ": ");
      numGuess = kb.nextInt();
    }
    // user prompts final
    if (numGuess == numRand) {
      System.out.println("\nSuccess");
      System.out.println("Only took you " + numTurn + " of your tries.");
    } else {
      System.out.println("\nFail");
      System.out.println("You ran out of the full " + numTurn + " of your tries.");
    }
    kb.close();

  }
}