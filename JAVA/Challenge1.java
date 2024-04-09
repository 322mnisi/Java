import java.util.Scanner;
public class Challenge1 {
   public static void main (String [] args) {

    //Part 1 of challenge 1
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

         //Part 2 of challenge 1

           String yearBorn = date_of_birth.split("/")[2];
           int age = 2024 - Integer.parseInt(yearBorn);
     
           System.out.println("Hello " +name +" "+ surname);
           System.out.println("You are " + age + " years old.");

               //Part 3 of challenge 1
     
                 double distance_in_mile = distance_from_store/1.6 ;
                 System.out.println(distance_in_mile + " miles");
                 System.out.println(distance_from_store*100 + " meters");
                 System.out.println(age*31536000 + " age in seconds");
                 long milliSecondsAge = 31556952000l ;
                 System.out.println(age*milliSecondsAge + " age in milliseconds");
                 String hexadecimalAge = Long.toHexString(milliSecondsAge);
                 System.out.println(hexadecimalAge + " age in hexadecimal");
       }
}