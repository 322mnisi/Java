import java.util.Scanner;
public class Concatenation {
	public static void main(String args[]) {

	Scanner song = new Scanner(System.in);
	System.out.println("Please type in the first line in Sponge Bob Square pants song.");
	String s = song.nextLine();
	Scanner song1 = new Scanner(System.in);
	System.out.println("Please type in the second line in Sponge Bob Square pants song.");
	String n = song1.nextLine();
	System.out.println(s + "\n" + n);
	}
}
