public class NumberValidator {
	public static void numberValidator(String distance){

		int range = Integer.parseInt(distance);
		
		 if (range < 0 || range > 32000){
		 	System.out.println("Distance is not valid!!! Exiting");
            System.exit(0);
		 }
            else {}
		}
	}
