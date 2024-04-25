public class MilesCalculator {
	public static double milesCalculator(String distance){

            Double kilos = Double.parseDouble(distance);
            Double distance_in_mile = kilos / 1.6 ;
            return distance_in_mile;
	}
}