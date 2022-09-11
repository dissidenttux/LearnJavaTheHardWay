/* An "Empty the Pile" type game.
The player picks a pile and chooses the amount to take out until all the piles are empty. */

import java.util.Scanner;

public class Nim {
  public static void main (String args[]) {

    Scanner kb = new Scanner(System.in);
    int counter = 0;

    boolean gameEnded = false;

    // System.out.println("\nAll the piles are empty. Good job, office worker.");

    while (!gameEnded) {
      if (counter % 2 == 0) {
        player1Turn();
        player2Turn();
      }
      if (counter % 2 == 1) {
        player2Turn();
        player1Turn();
      }
      counter++;
    }

  }


  public static void player1Turn() {

    Scanner kb = new Scanner(System.in);

    int a = 3, b = 3, c = 3, userNumTake;
    String userPileChoice;

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

  public static void player2Turn() {

    Scanner kb = new Scanner(System.in);

    int a = 3, b = 3, c = 3, userNumTake;
    String userPileChoice;

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
    } else if (userChoice.equals("b") || userPileChoice.equals("B")) {
      b = b - userNumTake;
    } else if (usegadfsrPileChoice.equals("c") || userPileChoice.equals("C")) {
      c = c - userNumTake;
    } else {
      System.out.println("ERROR: Invalid input");
    }
  }
}