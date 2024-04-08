import java.util.Scanner;
public class ShortCoversion {
	public static void main(String args[]) {

	Scanner salary = new Scanner(System.in);
	System.out.println("Please eneter your expected salary in Rands");
	short s = salary.nextShort();
	System.out.println("Your desired salary is R" +s+ ".00");
	}
}
