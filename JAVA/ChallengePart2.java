import java.util.Scanner;
public class ChallengePart2 {
   public static void main (String [] args) {

     Scanner inName = new Scanner(System.in);
     System.out.println("What is your name:");
     String name = inName.next();

     Scanner inSurname = new Scanner(System.in);
     System.out.println("What is your surname:");
     String surname = inSurname.next();

     Scanner inBirthDate = new Scanner(System.in);
     System.out.println("Enter your date of birth (DD/MM/YYYY:)");
     String date_of_birth = inBirthDate.next();

     String yearBorn = date_of_birth.split("/")[2];
     int age = 2024 - Integer.parseInt(yearBorn);
     
     System.out.println("Hello " +name +" "+ surname);
     System.out.println("You are " + age + " years old.");
}
}