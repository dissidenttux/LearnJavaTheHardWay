import java.util.Random;

public class ShorterDoubleDice {
  public static void main(String args[]) {

    Random dice = new Random();

    int diceRoll, diceRoll2;

    diceRoll = 1 + dice.nextInt(6); // generates one of six numbers from 1-6
    diceRoll2 = 1 + dice.nextInt(6);
    
    System.out.println("\n=*=Let's Roll!=*=\n");

    do {
      diceRoll = 1 + dice.nextInt(6); // generates one of six numbers from 1-6
      diceRoll2 = 1 + dice.nextInt(6);

      // prompts
      System.out.println("ROLL AGAIN\n");
      System.out.println("Roll 1: " + diceRoll);
      System.out.println("Roll 2: " + diceRoll2);
      System.out.println("Total is " + (diceRoll + diceRoll2) + "!");
      System.out.println("");

    } while (diceRoll != diceRoll2);

  }
}