import java.util.Scanner;
public class Prompter {
	public static String prompter(String msg){
	 
	 System.out.print(msg);
	 Scanner prompt = new Scanner(System.in);
	 String inp = prompt.next();
	 return inp;

	}
}