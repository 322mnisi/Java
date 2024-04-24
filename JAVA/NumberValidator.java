public class NumberValidator {
	public static Boolean numberValidator(String distance){

    if (distance != null && !distance.isEmpty()){
    	for (char c:distance.toCharArray()){
    		if (!Character.isDigit(c)){
    			return false;
    		}
    	}
    	return false;
    } else {
    	return false;
    }

	}
}