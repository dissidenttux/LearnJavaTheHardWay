import java.util.Scanner;
import java.util.Random;

public class AgainWithNumberGuessing {
  public static void main (String args[]) {

    Scanner kb = new Scanner(System.in);
    Random rand = new Random();

    int numGuess, numRand, numTries = 0; // numGuess = # the user guesses on the kb, numRand = # generated to guess and match, numTries = # of guesses the user actually goes through
    numRand = rand.nextInt(10) + 1; // gens a number between 1-10

    do {
      System.out.println("I have chosen a number between 1 and 10");
      System.out.print("> ");
      numGuess = kb.nextInt();
      numTries++;
    } while (numGuess != numRand);

    kb.close();
    System.out.println("That's correct! You're a good guesser.\n" + "Only took you " + numTries + " tries.");
  }
}