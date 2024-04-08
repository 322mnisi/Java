import java.util.Scanner;
public class LongConversion {
	public static void main(String args[]) {

	Scanner GDP = new Scanner(System.in);
	System.out.println("What is South Africa's GDP currently?");
	long l = GDP.nextLong();
	System.out.println("In Rands, South Africa's GDP is currently R" + l);
	}
}