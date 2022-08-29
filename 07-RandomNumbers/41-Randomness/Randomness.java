import java.util.Random;

public class Randomness {
  public static void main (String args[]) {

    // random generator object
    Random r = new Random();

    // pick a random integer
    int x = 1 + r.nextInt(10);

    System.out.println("My random number is " + x);

    System.out.println("Here are some random numbers from 1 to 5!");
    System.out.print(1 + r.nextInt(5) + " ");
    System.out.print(1 + r.nextInt(5) + " ");
    System.out.print(1 + r.nextInt(5) + " ");
    System.out.print(1 + r.nextInt(5) + " ");
    System.out.print(1 + r.nextInt(5) + " ");
    System.out.print(1 + r.nextInt(5) + " ");
    System.out.println();

    System.out.println("Here are some random numbers from 1 to 100!");
    System.out.print(1 + r.nextInt(100) + "\t");
    System.out.print(1 + r.nextInt(100) + "\t");
    System.out.print(1 + r.nextInt(100) + "\t");
    System.out.print(1 + r.nextInt(100) + "\t");
    System.out.print(1 + r.nextInt(100) + "\t");
    System.out.print(1 + r.nextInt(100) + "\t");
    System.out.println();

    int num1 = 1 + r.nextInt(10);
    int num2 = 1 + r.nextInt(10);

    if (num1 == num2) {
      System.out.println("The random numbers were the same, weird!");
    }
    if (num1 != num2) {
      System.out.println("The random numbers were different. Not too suprising, really.");
    }


    /* WHAT YOU SHOULD DO ON YOUR OWN
     * 
     * 1. The range for the new random numbers 0-4
     * 2. The range for the new random numbers 3-8
     * 3. TODO: Answer this question
     * 4. TODO: Answer this question
     * 5. TODO: Delete the seed
     */

  }
}