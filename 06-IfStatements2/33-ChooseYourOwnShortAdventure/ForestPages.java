import java.util.Scanner;

public class ForestPages {
  public static void main(String args[]) {
    Scanner kb = new Scanner(System.in); // "kb" = keyboard

    String r1, r2, r3; // r = "room response"
  
    System.out.println("\nFOREST PAGES\nTrails to follow, left behind the trees...\n");

    System.out.println("You wake up in the middle of the forest. Lying down in the forest's floor, there is a clearing in the canopy that a body clearly made.\n" +
    "On your chest is a flight suit of an unknown color. The parachute that was covering the leaves soon fades away from existence as your mind muddies in conciousness.\n" +
    "As you get up, there are two paths that stick out to you:\n1. A clearing that shows an opening to a \"river\".\n2. A thicker path that shows the entrance to a \"cave\".");
    System.out.print("> ");
    r1 = kb.nextLine();

    if (r1.equals("river")) {
      System.out.println("The slow rushing sound of waters rubbing the rocks fills the surrounding foggy air. The vapor fills your lungs and gives a feeling of utter vibrance. It's what you needed.\n" +
      "Though the dreaminess never went away, it seems like there's more tangible detail to everything.\n\n\"By the way, there's a boat..\" says the Mind.\n\nDo you take it?\n\"yes\"\n\"no\"");
      System.out.print("> ");
      r2 = kb.nextLine();

      if (r2.equals("yes")) {
        System.out.println("You're of adventurous spirit. In the sand, you press your oar into the ground, and float off on a faster path. It's seems like, for once, you've reached the world's horizon.\n" +
        "... do you \"touch\" it?\nOr do you let it \"slip?\"");
        System.out.print("> ");
        r3 = kb.nextLine();

        if (r3.equals("touch")) {
          // ENDING 1
          System.out.println("Dear reader,\nYou have reached the End. You are one with the Force.");
        } else if (r3.equals("slip")) {
          // ENDING 2
          System.out.println("You were too scared.\nA portal has opened, and you ended up back where you began: staring at this screen.\nThe memory has been erased. You probably should leave.");          
        } else {
          System.out.println("Not a valid response.");
        }
      } else if (r2.equals("no")) {
        System.out.println("You're a person of principle, choosing not to take what isn't yours. You elevate into the air when a voice says\n\t\"Your conviction will be rewarded. What do you most desire?\"\n" +
        "Two choices:\n\"love\" or \"irony\"?");
        System.out.print("> ");
        r3 = kb.nextLine();

        if (r3.equals("love")) {
          // ENDING 3
          System.out.println("The next person you see when you exit dreamland will be the first true love of your life.");
        } else if (r3.equals("irony")) {
          // ENDING 4
          System.out.println("Ironically, you've been in the same place you've started despite how much you've travelled.");
        } else {
          System.out.println("Not a valid response.");
        }
      } else {
        System.out.println("Not a valid response.");
      }

    } else if (r1.equals("cave")) {
      System.out.println("You end up in a cave, bones of skeletons that have dried in the sands of time. They seem familiar, maybe you should \"investigate\"?\nYou could simply go \"back\". No one " +
      "would blame you.");
      System.out.print("> ");
      r2 = kb.nextLine();

      if (r2.equals("investigate")) {
        System.out.println("You pick up the bones, and find that they don't fit the proper proportion of a human. One femur-ish looking bone seems sturdy enough.\nMaybe you could \"equip\" it to your inventory? " +
        "Otherwise, you could \"leave\" it.");
        System.out.print("> ");
        r3 = kb.nextLine();

        if (r3.equals("equip")) {
          // ENDING 5
          System.out.println("A cannibal lunged at you, and you struck it. It fell, and with a gurgle, retreated back to the cave. You left, leaving the bone. Your friend had his arms crossed, car keys in hand, and everything went white.");
        } else if (r3.equals("leave")) {
          // ENDING 6
          System.out.println("A cannibal lunged at you, and with a swipe of sharp sting, everything went black.");
        } else {
          System.out.println("Not a valid response.");
        }
      } else if (r2.equals("back")) {
        System.out.println("It was a while until you found a military base. You were approached by men in black.\n\"Clearance level?\" one inquires.\n\nDo you say?\n\n\"I don't have one\"\nor\n\"five\"");
        System.out.print("> ");
        r3 = kb.nextLine();

        if (r3.equals("I don't have one")) {
          // ENDING 7
          System.out.println("One of them pulls a pen to your face, and a flash of red was all you knew. You end up back in your seat, looking at a transcription of what happened as the only recording.");
        } else if (r3.equals("five")) {
          // ENDING 8
          System.out.println("One of them pulls a pen to your face, and a flash of purple was all you knew. You look up, and the sky is green, the landscape grey.\nA whole new world.\n\nExplore.");
        } else {
          System.out.println("Not a valid response.");
        }
      } else {
        System.out.println("Not a valid response.");
      }

    } else {
      System.out.println("Not a valid response.");
    }

    // TODO: Look up close method in Java Docs
    // closes the Scanner "kb" instance
    kb.close();
  }

}