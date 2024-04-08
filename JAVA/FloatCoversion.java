import java.util.Scanner;
public class FloatCoversion {
	public static void main(String args[]) {

	Scanner stats = new Scanner(System.in);
	System.out.println("How many hours are there in a day?");
	float f = stats.nextFloat();
	System.out.println("Did you know that every " + f/5 + " hours, a crime is commited in this country?");
	}
}