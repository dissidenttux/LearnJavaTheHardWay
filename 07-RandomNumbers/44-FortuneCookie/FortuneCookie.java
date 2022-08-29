import java.util.Random;

public class FortuneCookie {
  public static void main (String args[]) {
    
    Random rand = new Random();

    int numFortune, numLotto1, numLotto2, numLotto3, numLotto4, numLotto5, numLotto6;

    // Index for fortune values
    numFortune = rand.nextInt(5);
    // Texan lottery numbers are generated from 1-54
    numLotto1 = 1 + rand.nextInt(53);
    numLotto2 = 1 + rand.nextInt(53);
    numLotto3 = 1 + rand.nextInt(53);
    numLotto4 = 1 + rand.nextInt(53);
    numLotto5 = 1 + rand.nextInt(53);
    numLotto6 = 1 + rand.nextInt(53);

    if (numFortune == 0) {
      System.out.println("A dubious friend may be an enemy in camouflage.");
    } else if (numFortune == 1) {
      System.out.println("A gambler not only will lose what he has, but also will lose what he doesn't have.");
    } else if (numFortune == 2) {
      System.out.println("A person of words and not deeds is like a garden full of weeds.");
    } else if (numFortune == 4) {
      System.out.println("A short pencil is usually better than a long memory.");
    } else { // fifth fortune by numFortune value, "5"
      System.out.println("Advice, when most needed, is least heeded.");
    }

    // lotto numbers
    System.out.println(numLotto1 + " - " + numLotto2 + " - " + numLotto3 + " - " + numLotto4 + " - " + numLotto5 + " - " + numLotto6);

  }
}