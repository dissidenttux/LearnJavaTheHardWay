/* An "Empty the Pile" type game.
The player picks a pile and chooses the amount to take out until all the piles are empty. */

import java.util.Scanner;

public class Nim {
  public static void main (String args[]) {

    Scanner kb = new Scanner(System.in);

    User player1 = new User();
    
    int a = 3, b = 3, c = 3, userNumTake;
    String userPileChoice;

    /* execute this loop while a, b, and c are more than zero. If all three are less than, the loop will stop. */
    while (a > 0 || b > 0 || c > 0) { // the OR conditionals essentially allow the exit conditions to fall back on each other
      System.out.println("\nA: " + a + "\tB: " + b + "\tC:" + c);
      System.out.println("Choose a pile:");
      System.out.print("> ");
      userPileChoice = kb.nextLine();
      System.out.println("\nHow many do you want to take from the pile?");
      System.out.print("> ");
      userNumTake = kb.nextInt();
      kb.nextLine(); //consume dangling newline


      if (userPileChoice.equals("a") || userPileChoice.equals("A")) {
        a = a - userNumTake;
      } else if (userPileChoice.equals("b") || userPileChoice.equals("B")) {
        b = b - userNumTake;
      } else if (userPileChoice.equals("c") || userPileChoice.equals("C")) {
        c = c - userNumTake;
      } else {
        System.out.println("ERROR: Invalid input");
      }
    }

    System.out.println("\nAll the piles are empty. Good job, office worker.");

  }
}