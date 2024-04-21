public class NumberValidator {
	public static boolean numberValidator(String number){

    if (number != null && !number.isEmpty()){
    	for (char c:number.toCharArray()){
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