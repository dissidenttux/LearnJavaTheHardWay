import java.util.Scanner;

public class RightTriangleChecker {
  /* ALGORITHM
   * 1. Take user input of two shorter sides of a triangle.
   * 2. Check and see if these sides are in ascending order in order to continue.
   * 3. Take user input of the last, longer side of the triangle.
   * 4. Compare the summed up squared lengths of the sides first two sides the user inputted, to the squared third side.
   * 5. IF the squared two short sides are equal to the squared longer side, THEN it is a right triangle, ELSE it's not.
  */
  public static void main (String args[]) {

    Scanner kb = new Scanner(System.in);
    
    int triSide1, triSide2, triSide3;

    do {
      System.out.print("> ");
      triSide1 = kb.nextInt();
      System.out.print("> ");
      triSide2 = kb.nextInt();
      if (triSide1 > triSide2) {
        System.out.print("\n" + triSide1 + " is bigger than " + triSide2 + ". Try Again!\n");
      }
    } while (triSide1 > triSide2); // if the numbers are not in sequential order, then run the loop again

    System.out.print("> ");
    triSide3 = kb.nextInt();

    if ((triSide1 * triSide1) + (triSide2 * triSide2) == (triSide3 * triSide3)) {
      System.out.println("\nThese sides make a right triangle.");
    } else {
      System.out.println("\nThese sides don't make a right triangle.");
    }

  }

}
