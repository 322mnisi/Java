public class DateValidator {
	public static Boolean datevalidator(String birthdate){


     //String date = Prompter.prompter("Enter your date of birth (DD/MM/YYYY):");
		if (!birthdate.matches("\\d{2}/\\d{2}/\\d{4}")){
			return false;
            }
			String[] parts = birthdate.split("/");
			int day = Integer.parseInt(parts[0]);
			int month = Integer.parseInt(parts[1]);
			int year = Integer.parseInt(parts[2]);

			if (year < 2000 || year > 2200){
				return false;
			}
			if (month< 1 || month > 12){
				return false;
			}
			if (day < 1 || day > 31){
				return false;
			}
			return true;
		}

	}
