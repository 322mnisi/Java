import java.util.Scanner;
public class ChallengePart1 {
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

     Scanner distance = new Scanner(System.in);
     System.out.println("How far is your favourite store from home?");
     int distance_from_store = distance.nextInt();
}
}