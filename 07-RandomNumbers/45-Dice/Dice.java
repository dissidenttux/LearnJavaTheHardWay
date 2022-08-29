import java.util.Random;

public class Dice {
  public static void main(String args[]) {

    Random dice = new Random();

    int diceRoll, diceRoll2;

    diceRoll = 1 + dice.nextInt(5); // generates one of six numbers from 1-6
    diceRoll2 = 1 + dice.nextInt(5);

    // prompts
    System.out.println("Let's roll!\n");
    System.out.println("Roll 1: " + diceRoll);
    System.out.println("Roll 2: " + diceRoll2);
    System.out.println("Total is " + (diceRoll + diceRoll2) + "!");

  }
}