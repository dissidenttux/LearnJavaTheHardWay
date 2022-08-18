public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
		for ( int i=0; i<80; i++ )
		{
			if ( i%10 == 0 ) {
				System.out.print(" Loading. \r");
			}
			if ( i%10 == 1) {
				System.out.print(" lOading. \r");
			}
			if ( i%10 == 2) {
				System.out.print(" loAding. \r");
			}
			if ( i%10 == 3) {
				System.out.print(" loaDing.\r");
			}
			if ( i%10 == 4) {
				System.out.print(" loadIng. \r");
			}
			if ( i%10 == 5) {
				System.out.print(" loadiNg. \r");
			}
			if ( i%10 == 6) {
				System.out.print(" loadinG. \r");
			}
			if ( i%10 == 7) {
				System.out.print(" loading. \r");
			}

			Thread.sleep(200);
		}
		
	}
}
