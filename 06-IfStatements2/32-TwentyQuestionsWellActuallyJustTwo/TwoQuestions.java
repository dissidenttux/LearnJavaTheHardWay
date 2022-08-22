import java.util.Scanner;

public class TwoQuestions {
  public static void main (String args[] ) {

    Scanner kb = new Scanner(System.in);

    String answer1, answer2, response;

    System.out.println("\n[Two Questions]\nThink of an object, and I'll try to guess it.\n");
    System.out.println("Is it an \"animal\", a \"vegetable\", or a \"mineral\"? (Type an answer exactly as quoted)");
    answer1 = kb.nextLine();
    System.out.println("Is it bigger than a breadbox? (yes/no)");
    answer2 = kb.nextLine();

    if (answer1.equals("animal")) {
      if (answer2.equals("yes")) {
        response = "moose";
      } else if (answer2.equals("no")) {
        response = "squirrel";
      } else {
        response = "RESPONSE_INVALID";
        System.out.println("Response invalid.");
      }
    } else if (answer1.equals("vegetable")) {
      if (answer2.equals("yes")) {
        response = "watermelon";
      } else if (answer2.equals("no")) {
        response = "carrot";
      } else {
        response = "RESPONSE_INVALID";
      }
    } else if (answer1.equals("mineral")) {
      if (answer2.equals("yes")) {
        response = "Camero";
      } else if (answer2.equals("no")) {
        response = "paper clip";
      } else {
        response = "RESPONSE_INVALID";
      }
    } else {
      response = "RESPONSE_INVALID";
    }


    System.out.println("\nMy guess is that you are thinking of a " + response + ".\nI would ask you if I'm right, but I don't actually care.\n");

  }
}