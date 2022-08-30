import java.util.Scanner;
import java.util.Random;

public class OneShotHilo {
  public static void main (String arg[]) {

    Scanner kb = new Scanner(System.in);
    Random numRand = new Random();

    int numGuess, numSecret;

    // logical imperative for determining the secret guessing number
    numSecret = 1 + numRand.nextInt(100); // generates a number between 1-100

    // user prompts
    System.out.println("I'm thinking of a number between 1-100... try it!");
    System.out.print("> ");
    numGuess = kb.nextInt();
    kb.close();

    if (numGuess == numSecret) {
      System.out.println("You guessed it! WHAT ARE THE ODDS!");
    } else if (numGuess > numSecret) {
      System.out.println("Sorry, you were too high, I was thinking of " + numSecret);
    } else {
      System.out.println("Sorry, you were too low, I was thinking of " + numSecret);
    }

  }
}