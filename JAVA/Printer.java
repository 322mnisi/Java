public class Printer {
    public static void print(){

     String name = Prompter.prompter("What is your name:");
     String surname = Prompter.prompter("What is your surname:");
    //String dob = Prompter.prompter("Enter your date of birth (DD/MM/YYYY):");
    AgeCalculator.ageCalculator();

    //String distance = Prompter.prompter("How far is your favourite store from your home?");
    
    
    System.out.println("Your name is " + name);
    System.out.println("Your surname is " + surname);
    
   //String yearBorn = dob.split("/")[2];
     //      int age = 2024 - Integer.parseInt(yearBorn);
    //System.out.println("Your are " + age + " years old");
    //System.out.println("You are " + distance + " km" + " away from the shop");
    MilesCalculator.miles();
    }
}
