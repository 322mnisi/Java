public class NumberValidator {
	public static Boolean numberValidator(String distance){

	// 	double distanceToStore = Double.parseDouble(distance);

	// 	 if (distanceToStore < 0 || distanceToStore > 32000){
	// 	 	System.out.println("Distance is not valid!!! Exiting");
    //         System.exit(0);
	// 	 }
    //         else {}
	// 	}
	// }


if (distance != null && !distance.isEmpty()){
	for (char c : distance.toCharArray()){
		if (!Character.isDigit(c)){
			return false;
		}
	}
	return true;
		}else {
			return false;
		}
	}
}

