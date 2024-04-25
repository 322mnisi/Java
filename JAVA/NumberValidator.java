public class NumberValidator {
	public static void numberValidator(String distance){

		double distanceToStore = Double.parseDouble(distance);

		 if (distanceToStore < 0 || distanceToStore > 32000){
		 	System.out.println("Distance is not valid!!! Exiting");
            System.exit(0);
		 }
            else {}
		}
	}
