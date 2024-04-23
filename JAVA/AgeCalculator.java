public class AgeCalculator {
	public static void ageCalculator(String birthdate){

 //String dob = Prompter.prompter("Enter your date of birth (DD/MM/YYYY):");
   String yearBorn = birthdate.split("/")[2];
           int age = 2024 - Integer.parseInt(yearBorn);
 //System.out.println("Your are " + age + " years old");

	}
}