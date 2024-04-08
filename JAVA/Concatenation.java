import java.util.Scanner;
public class Concatenation {
	public static void main(String args[]) {

//char s = input.charAT(0);
//char n = input.charAT(0);

	Scanner song = new Scanner(System.in);
	System.out.println("Please type in the first line in Sponge Bob Square pant song.");
	String s = song.next();
	Scanner song1 = new Scanner(System.in);
	System.out.println("Please type in the second line in Sponge Bob Square pant song.");
	String n = song1.next();
	System.out.print(s + "\n"+ n);
	}
}
