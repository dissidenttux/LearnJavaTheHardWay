import java.util.Scanner;

public class AlphabeticalOrder {
  public static void main(String args[]) {

    Scanner kb = new Scanner(System.in);

    String lastName;
    int compare0, compare1, compare2, compare3;

    // prompts
    System.out.println("What is your last name?");
    System.out.print("> ");
    lastName = kb.nextLine();
    System.out.println("");
    kb.close();

    // calculative response determiners
    compare0 = lastName.compareTo("Carswell");
    compare1 = lastName.compareTo("Jones");
    compare2 = lastName.compareTo("Smith");
    compare3 = lastName.compareTo("Young");

    // if name is "Carswell" or before, say the printed statment
    if (compare0 < 0 || compare0 == 0) {
      System.out.println("You don't have to wait long, \"" + lastName + "\".");
    } else if (compare1 < 0 || compare1 == 0) {
      System.out.println("That's not bad, \"" + lastName + "\".");
    } else if (compare2 < 0 || compare2 == 0) {
      System.out.println("Looks like a bit of a wait, \"" + lastName + "\".");
    } else if (compare3 < 0 || compare3 == 0) {
      System.out.println("It's going to be a while, \"" + lastName + "\".");
    } else if (compare3 > 0) {
      System.out.println("Not going anywhere for a while, \"" + lastName + "\"?");
    } else {
      System.out.println("ERROR DOES NOT COMPUTE!!!");
    }

  }
}