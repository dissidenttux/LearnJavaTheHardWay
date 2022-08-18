import java.util.Scanner;

public class ALittleQuiz {
  public static void main (String args[]) {
    Scanner keyboard = new Scanner(System.in);

    char choiceQuizStart, choiceQ1, choiceQ2, choiceQ3;
    byte totalScore = 0;

    System.out.println("\nAre you ready for a quiz (y/n)?");
    choiceQuizStart = keyboard.next().charAt(0);

    if (choiceQuizStart == 'y' || choiceQuizStart == 'Y') {

      // Questions
      System.out.println("\nWhat basic color are cherries?\n\ta. Blue\n\tb. Red\n\tc. Yellow\n\td. Green");
      choiceQ1 = keyboard.next().charAt(0);
      System.out.println("\nWhat basic color are bananas?\n\ta. Blue\n\tb. Red\n\tc. Yellow\n\td. Green");
      choiceQ2 = keyboard.next().charAt(0);
      System.out.println("\nWhat basic color is lettuce?\n\ta. Blue\n\tb. Red\n\tc. Yellow\n\td. Green");
      choiceQ3 = keyboard.next().charAt(0);

      // Scoring
      if (choiceQ1 == 'b' || choiceQ1 == 'B') {
        totalScore += 1;
      }
      if (choiceQ2 == 'c' || choiceQ2 == 'C') {
        totalScore += 1;
      }
      if (choiceQ3 == 'd' || choiceQ3 == 'D') {
        totalScore += 1;
      }

      // Prompt final
      System.out.println("\nYour final score is " + totalScore + " out of 3.\n");
      
    } else {
      System.out.println("\nStart the program again whenever you're ready. Exiting...\n");
    }
  }
}