public class MyInitials {
	public static void main(String[] args){
		System.out.println("\nFor the name Michael \"Cal\" Krug:\n");
		letterM();
		letterC();
		letterK();
		System.out.println("\nWent a little above and beyond in this exersize, but whatever, it's all in good fun.\n");
	}

	private static void letterM() {
		System.out.println("M   M   CCC   K   K");
		System.out.println("MM MM  C   C  K   K");
		System.out.println("MM MM  C      K  K");
		System.out.println("M M M  C      KKK");
		System.out.println("M   M  C      K  K");
		System.out.println("M   M  C   C  K   K");
		System.out.println("M   M   CCC   K   K");
	}

	private static void letterC() {
		System.out.println("\n CCC   ");
		System.out.println("C   C  ");
		System.out.println("C      ");
		System.out.println("C      ");
		System.out.println("C      ");
		System.out.println("C   C  ");
		System.out.println(" CCC   ");
	}

	private static void letterK() {
		System.out.println("\nK   K");
		System.out.println("K   K");
		System.out.println("K  K");
		System.out.println("KKK");
		System.out.println("K  K");
		System.out.println("K   K");
		System.out.println("K   K");
	}
}
