import java.util.Scanner;
public class ByteCoversion {
	public static void main(String args[]) {

	Scanner ipRange = new Scanner(System.in);
	System.out.println("As an IT technician, please tell us what is the first IP octet for a local host on IPv4");
	byte b = ipRange.nextByte();
	System.out.println("You answered " + b + ", the correct answer is 127:x:x:x");
	}
}
