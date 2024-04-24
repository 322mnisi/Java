public class AgeCalculator {
	public static int ageCalculator(String birthdate){

            String yearBorn = birthdate.split("/")[2];
            int age = 2024 - Integer.parseInt(yearBorn);
            return age;
	}
}