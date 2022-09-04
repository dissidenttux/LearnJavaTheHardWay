import java.util.Scanner;
import java.util.Random;

public class NumberGuessingWithCounter {
  public static void main (String args[]) {

    Scanner kb = new Scanner(System.in);
    Random rand = new Random();

    // >that one line of code where the secret number is
    int numSecret = 1 + rand.nextInt(10), numGuess;

    System.out.println("The Worst Guessing Game: Keep Guessing!\nGuess a number from one-to-ten!");
    System.out.print("> ");
    numGuess = kb.nextByte();
    System.out.println();

    // logical success determiner

    while (numGuess != numSecret) {
      System.out.println("Incorrect. Let's see you guess again..");
      System.out.print("> ");
      numGuess = kb.nextByte();
      System.out.println();
    }

    System.out.println("Yes! You got it correct!");

  }
}
