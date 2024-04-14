import java.util.Scanner;
public class ReturnTypes{
	public static void main(String [] args){

	System.out.println("Welcome back"); //Maybe it just prints to the screen?

	System.out.println("Please enter your age"); //Maybe it just gets input and displays the outcome?
	Scanner age = new Scanner(System.in);
	int n = age.nextInt();
	System.out.println("Yor are " + n + " years old");

	int older = n + 1 ;//Maybe it manipulates that parameter that is passed in?
    
    System.out.println("Next year you will be " + older + " years old"); //Maybe it changes the instance variables which will be explained in the OOP sections?
}
}