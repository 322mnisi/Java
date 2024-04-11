import java.util.Scanner;
public class Keywords {
	public static void main (String [] args){
	   Scanner in = new Scanner(System.in);
	   System.out.println("How old are you");
	   
	   int Age = in.nextInt();
	   
	   if (Age >= 18){
	      System.out.println("Welcome to adulthood");
	   }

	   else {
	   	  System.out.println("You are still under your parent's care");
	   }
}
}