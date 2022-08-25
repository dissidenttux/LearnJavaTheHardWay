import java.util.Scanner;

public class TwoMoreQuestions {
  public static void main (String args[]) {

    String r1, r2, cr = "";

    Scanner kb = new Scanner(System.in);

    System.out.println("TWO MORE QUESTIONS\n\nThink of something, and I'll guess it\n\n");
    System.out.println("Question 1) Does it stay \"inside\", \"outside\", or \"both\"?");
    System.out.print("> ");
    r1 = kb.nextLine();
    System.out.println("Question 2) Is it a living thing?");
    System.out.print("> ");
    r2 = kb.nextLine();
    System.out.print("\n");

    // Inside options
    if (r1.equals("inside") && r2.equals("yes")) {
      cr = cr.replace("", "houseplant");
    }
    if (r1.equals("inside") && r2.equals("no")) {
      cr = cr.replace("", "shower curtain");
    }

    // Outside options
    if (r1.equals("outside") && r2.equals("yes")) {
      cr = cr.replace("", "bison");
    }
    if (r1.equals("outside") && r2.equals("no")) {
      cr = cr.replace("", "billboard");
    }

    // "Both" options
    if (r1.equals("both") && r2.equals("yes")) {
      cr = cr.replace("", "dog");
    }
    if (r1.equals("both") && r2.equals("no")) {
      cr = cr.replace("", "cell phone");
    }

    System.out.println("Well it's obviously a " + cr + ".");

    kb.close();
  }
}