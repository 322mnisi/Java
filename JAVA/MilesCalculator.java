public class MilesCalculator {
	public static void milesCalculator(String distance){

                 Double kilos = Double.parseDouble(distance);
                 Double distance_in_mile = kilos / 1.6 ;
                 System.out.println("You are " + distance_in_mile + " miles" + " away from the shop");

	}
}