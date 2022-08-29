import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
  public static void main (String args[]) {

    Scanner kb = new Scanner(System.in);
    Random rand = new Random();

    // >that one line of code where the secret number is
    int numSecret = 1 + rand.nextInt(10), numGuess;

    System.out.println("The Worst Guessing Game\nGuess a number from one-to-ten!");
    System.out.print("> ");
    numGuess = kb.nextByte();
    System.out.println();

    // logical success determiner
    if (numGuess == numSecret) {
      System.out.println("Good job, it was " + numSecret + ". :)");
    } else {
      System.out.println("Got you! No, it was actually " + numSecret + ".");
    }

  }
}
