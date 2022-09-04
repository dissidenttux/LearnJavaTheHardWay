import java.util.Scanner;

public class CountingWhile {
  public static void main (String args[]) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Type in a message, and I'll display it five times.");
    System.out.print("Message: ");
    String message = keyboard.nextLine();

    int n = 0;
    while (n < 5) {
      System.out.println((n+1) + ". " + message);
      n++;
    }

    /*
     * 1. What does dn++ do? Remove it and see what happens. (Then put it back.)
     *    (Answer like so here)
     * 
     * 2. Change the code so that the loop repeats ten times instead of five.
     *    (Answer like so here)
     * 
     * 3. See if you can change the code so that the message still prints ten times, but the numbers in front count by tens, like so:
     *    Type in a message, and I'll display it ten times.
          Message: I'm sending out an S.O.S.
          10. I'm sending out an S.O.S.
          20. I'm sending out an S.O.S.
          30. I'm sending out an S.O.S.
          40. I'm sending out an S.O.S.
          50. I'm sending out an S.O.S.
          60. I'm sending out an S.O.S.
          70. I'm sending out an S.O.S.
          80. I'm sending out an S.O.S.
          90. I'm sending out an S.O.S.
          100. I'm sending out an S.O.S.
     * 
     * 4. Change the code so that it asks the person how many times to display the message. Then, print it that many times. Still count by tens.
     *    Type in a message, and I'll display it several times.
          Message: HELLO! My name is Inigo Montoya. You killed my father; prepare to die.
          How many times? 3
          10. HELLO! My name is Inigo Montoya. You killed my father; prepare to die.
          20. HELLO! My name is Inigo Montoya. You killed my father; prepare to die.
          30. HELLO! My name is Inigo Montoya. You killed my father; prepare to die.
     *
     */

  }
}