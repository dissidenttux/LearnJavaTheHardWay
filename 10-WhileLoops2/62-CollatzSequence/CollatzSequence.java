import java.util.Scanner;

public class CollatzSequence {
  public static void main (String args[]) {

    Scanner kb = new Scanner(System.in);

    // numInput = the number the user inputs, numSteps = the number of steps the machine took
    int numInput, numSteps = 0;

    // user input
    System.out.print("Starting number: ");
    numInput = kb.nextInt();
    kb.close();

    // do not stop this loop until the sequence's target (userInput) reaches 1
    while (numInput != 1) {
      if (numInput % 2 == 0) { // if the number is the even, use this sequence
        numInput /= 2;
        System.out.print("\t" + numInput);
        numSteps++;
      } else { // if the number is the odd, use this sequence
        numInput *= 3;
        numInput += 1;
        System.out.print("\t" + numInput);
        numSteps++;
      }      
    }

    // user prompts final
    System.out.println();
    System.out.println("\nTerminated after " + numSteps + " steps.");

  }
}