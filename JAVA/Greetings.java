import java.util.Scanner;
public class Greetings {
	public static void main(String [] args){

	System.out.println("What is your name?");
	Scanner name = new Scanner(System.in);
	String n = name.next();


	System.out.println("What is your surname?");
	Scanner surname = new Scanner(System.in);
	String s = surname.next();


    System.out.println("What is your age?");
    Scanner age = new Scanner(System.in);
    String a = age.next();

    System.out.println("Hello " + n + " " + s + " your age is " + a + " years old.");
    }
}