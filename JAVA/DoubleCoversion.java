import java.util.Scanner;
public class DoubleCoversion {
	public static void main(String args[]) {

	Scanner percentage = new Scanner(System.in);
	System.out.println("Please enter you desired loan term in years");
	double d = percentage.nextDouble();
	System.out.println("Your rate will be " + d/3 + "%");
	}
}