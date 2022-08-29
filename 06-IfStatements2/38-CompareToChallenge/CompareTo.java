public class CompareTo {
  public static void main (String args[]) {
    System.out.println("We're comparing Strings today...\n");
    /* Twelve different examples.. five with less than zero, five more than, two equal
    printing the strings as well.. go!

    * remember that compareTo() compares Strings **lexicographically**,
    specifically, based on the Unicode value of each character in the String -- NOT the string length.
    */

    // LESS THAN examples
    System.out.println("\nLESS THAN examples");
    // println method
    System.out.print("Comparing \"based\" to \"cringe\" produces ");
    System.out.println("based".compareTo("cringe"));
    
    // (int)eger variable method - remember that compareTo produces an int value
    System.out.print("Comparing \"apples\" to \"oranges\" produces ");
    int i = "apples".compareTo("oranges");
    System.out.println(i);

    /* remember that compareTo() compares Strings **lexicographically**
    (usually, the specific order is either *"dictionary order" or *"ASCIIbetical order") -- NOT the string length.
    */
    System.out.print("Comparing \"cookies\" to \"milk\" produces ");
    System.out.println("cookies".compareTo("milk"));

    System.out.print("Comparing \"amongus\" to \"sus\" produces ");
    System.out.println("amongus".compareTo("sus"));

    System.out.print("Comparing \"ayo\" to \"really\" produces ");
    System.out.println("ayo".compareTo("really"));


    // MORE THAN examples
    System.out.println("\nMORE THAN examples");
    // for demonstrations purposes, I'm going to break Java convention and place variables here (don't kill me)
    String s1 = "haha", s2 = "lol";
    int example6 = s2.compareTo(s1);
    System.out.println("Comparing \"" + s2 + "\" to \"" + s1 + "\" produces " + example6);

    String s3 = "cartographer", s4 = "silent";
    int example7 = s4.compareTo(s3);
    System.out.println("Comparing \"" + s4 + "\" to \"" + s3 + "\" produces " + example7);

    String s5 = "pear", s6 = "zirconium";
    int example8 = s6.compareTo(s5);
    System.out.println("Comparing \"" + s6 + "\" to \"" + s5 + "\" produces " + example8);

    String s7 = "can I count", s8 = "no";
    int example9 = s8.compareTo(s7);
    System.out.println("Comparing \"" + s8 + "\" to \"" + s7 + "\" produces " + example9);

    String s9 = "qwerty", s10 = "woah";
    int example10 = s10.compareTo(s9);
    System.out.println("Comparing \"" + s10 + "\" to \"" + s9 + "\" produces " + example10);


    // EQUAL TO examples
    System.out.println("\nEQUAL TO examples");
    System.out.print("Comparing \"chaos\" to \"chaos\" produces ");
    System.out.println("chaos".compareTo("chaos"));

    String s11 = "speak different";
    System.out.print("Comparing \"" + s11 + "\" produces ");
    System.out.println(s11.compareTo(s11));

  }
}