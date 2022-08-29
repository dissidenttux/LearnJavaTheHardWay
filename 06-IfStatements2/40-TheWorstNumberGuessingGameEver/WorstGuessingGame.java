import java.util.Scanner;

public class WorstGuessingGame {
  public static void main (String args[]) {

    Scanner kb = new Scanner(System.in);

    // >that one line of code where the secret number is
    byte numSecret = 7, numGuess;

    System.out.println("The Worst Guessing Game\nGuess a number from one-to-ten!");
    System.out.print("> ");
    numGuess = kb.nextByte();
    System.out.println();

    // logical success determiner
    if (numGuess == numSecret) {
      System.out.println("Good job, it was " + numGuess + ". :)");
    } else {
      System.out.println("Got you! No, it was actually " + numGuess + ".");
    }

  }
}
