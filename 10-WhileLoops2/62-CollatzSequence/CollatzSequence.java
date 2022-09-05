import java.util.Scanner;

public class CollatzSequence {
  public static void main (String args[]) {

    Scanner kb = new Scanner(System.in);

    int numInput;

    numInput = kb.nextInt();

    while (numInput % 2 == 0) {
      numInput /= 2;
      System.out.print("\t" + numInput);
      System.out.println();
    }

    while (numInput % 2 != 0) {
      numInput *= 3;
      numInput += 1;
      System.out.print("\t" + numInput);
      System.out.println();
    }
  }
}