import java.util.Scanner;

public class AddValuesInALoop {
  public static void main (String args[]) {
    
    Scanner kb = new Scanner(System.in);

    int inputNum, inputNumTotal = 0;

    // prompt the user
    System.out.println("I'll add up the numbers you give me.");
    System.out.print("> ");
    inputNum = kb.nextInt();
    inputNumTotal += inputNum;

    // loop:
    // have a number to input
    // take another number for input
    // break loop when the user inputs "0"

    while (inputNum != 0) {
      System.out.println("The total so far is " + inputNumTotal);
      System.out.print("> ");
      inputNum = kb.nextInt();
      inputNumTotal += inputNum;
    }

    System.out.println("\nThe total is " + inputNumTotal + ".");
  }
}