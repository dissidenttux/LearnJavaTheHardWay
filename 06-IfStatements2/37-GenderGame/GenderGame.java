import java.util.Scanner;

public class GenderGame {
  public static void main (String args[]) {

    // variables and classes
    String gender, nameFirst, nameLast, marriedStatus, nameFinal = "";
    int age;

    Scanner kb = new Scanner(System.in);

    // prompts
    System.out.println("\nWhat is your gender (\"m\" or \"f\")?");
    System.out.print("> ");
    gender = kb.nextLine();
    System.out.println("\nFirst name: ");
    System.out.print("> ");
    nameFirst = kb.nextLine();
    System.out.println("\nLast name: ");
    System.out.print("> ");
    nameLast = kb.nextLine();
    System.out.println("\nAge: ");
    System.out.print("> ");
    age = kb.nextInt();
    kb.nextLine();

    // logic
    if (gender.equals("m")) {

      if (age >= 20) {
        nameFinal = nameFinal.replace("","Mr. " + nameLast);
      } else {
        nameFinal = nameFinal.replace("", nameFirst + " " + nameLast);
      }

    } else {

      if (age >= 20) {

        System.out.println("\nAre you married, " + nameFirst + "? (\"yes\"/\"no\")");
        System.out.print("> ");
        marriedStatus = kb.nextLine();

        if (marriedStatus.equals("yes")) {
          nameFinal = nameFinal.replace("","Mrs. " + nameLast);
        } else {
          nameFinal = nameFinal.replace("","Ms. " + nameLast);
        }

      } else {
        nameFinal = nameFinal.replace("", nameFirst + " " + nameLast);
      }

    }

    // close input resource
    kb.close();
    // final prompt
    System.out.println("\nThen I shall call you, " + nameFinal + ".");
  }
}