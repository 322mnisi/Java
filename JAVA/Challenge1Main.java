public class Challenge1Main {
    public static void main(String[] args) {

     String name = Prompter.prompter("What is your name:");
     String surname = Prompter.prompter("What is your surname:");
     String birthdate = Prompter.prompter("Enter your date of birth? (DD/MM/YYYY):");
     String distance = Prompter.prompter("How far is your favourite store from your home?");

        DateValidator.datevalidator(birthdate);
        NumberValidator.numberValidator(distance);  
        AgeCalculator.ageCalculator(birthdate);   
        MilesCalculator.milesCalculator(distance);

          int age = AgeCalculator.ageCalculator(birthdate);
          double distance_in_mile = MilesCalculator.milesCalculator(distance);

        Printer.print(name,surname, age, distance_in_mile);

    }
}
