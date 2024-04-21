public class MilesCalculator {
	public static void miles(){

                 String distance_from_store = Prompter.prompter("How far is your favourite store from your home?");
                 Double distance_in_mile = Double.parseDouble(distance_from_store);
                 Double distance = distance_in_mile / 1.6 ;
                 System.out.println("You are " + distance + " miles" + " away from the shop");

	}
}