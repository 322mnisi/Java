import java.util.Scanner;
public class ChallengePart3 {
   public static void main (String [] args) {

     Scanner distance = new Scanner(System.in);
     System.out.println("How far is your favourite store from home?");
     int distance_from_store = distance.nextInt();
     double distance_in_mile = distance_from_store/1.6 ;
     System.out.println(distance_in_mile + " miles");
     System.out.println(distance_from_store*100 + " meters");

     Scanner inBirthDate = new Scanner(System.in);
     System.out.println("Enter your date of birth (DD/MM/YYYY:)");
     String date_of_birth = inBirthDate.next();

     String yearBorn = date_of_birth.split("/")[2];
     int age = 2024 - Integer.parseInt(yearBorn);
     System.out.println(age*31536000 + " age in seconds");

}
}