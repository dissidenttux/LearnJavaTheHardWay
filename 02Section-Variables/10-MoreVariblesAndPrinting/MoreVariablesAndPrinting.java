public class MoreVariablesAndPrinting
{
	public static void main ( String[] args )
	{
		String name, eyes, teeth, hair;
		int age, height, weight;
		float heightMetric, weightMetric; // problem #2 variables added

		name = "Zed A. Shaw";
		age = 35; // not a lie
		height = 74; // inches
		weight = 180; // pounds
		heightMetric = Math.round(height * 2.54); // in centimetres
		weightMetric = Math.round(weight * 0.45359237); // in kilos
		eyes = "Blue";
		teeth = "White";
		hair = "Brown";

		System.out.println( "Let's talk about " + name + "." );
		System.out.println( "He's " + height + " inches tall." );
		System.out.println( "He's " + weight + " pounds heavy." );
		System.out.println( "Actually, that's not too heavy" );
		System.out.println( "He's got " + eyes + " eyes and " + hair + " hair." );
		System.out.println( "His teeth are usually " + teeth + " depending on the coffee." );
		
		// This line is tricky, try to get it exactly right
		System.out.println( "If I add " + age + ", " + height + ", and " + weight
			+ " I get " + (age + height + weight) + "." );

		// Test for additional problem #2
		System.out.println( "\n" + name + "'s height and weight in metric is about " + heightMetric + " centimeters & "
			+ weightMetric + " kilos." );
	}
}


/*
Assignments turned in without these things will not receive any points.

    1. Change all the variables so there isn't the "my" in front. Make sure you change the name everywhere, not just where you used = to set them.
    2. Try to write some variables that convert the inches and pounds to centimeters and kilos. Don't just type in the measurements, but work out the math inside your Java program. 
*/
