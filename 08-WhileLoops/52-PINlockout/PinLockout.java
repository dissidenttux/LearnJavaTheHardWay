import java.util.Scanner;

public class PinLockout {
  public static void main (String args[]) {
    Scanner keyboard = new Scanner(System.in);
    int pin = 12345;
    int tries = 0;
    int triesMax = 4; // max tries variable

    System.out.println("WELCOME TO THE BANK OF MITCHELL");
    System.out.print("ENTER YOUR PIN: ");
    int entry = keyboard.nextInt();
    tries++;

    while ( entry != pin && tries < triesMax ) { // changed to lock user after four tries rather than three
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.println("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
      tries++;
    }

    if (entry == pin) {
      System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
    } else if (tries >= triesMax) { // changed to lock user after four tries rather than three
      System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
    }

    /*
     * WHAT YOU SHOULD DO ON YOUR OWN
     * 1. Change the code so that it locks them out after 4 tries instead of 3. Make sure to change the message at the bottom, too.
     * 
     * 2. Move the "maximum tries" value into a variable, and use that variable everywhere instead of just the number.
     * 
     */

  }
}