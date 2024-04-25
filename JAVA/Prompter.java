import java.util.Scanner;
public class Prompter {
	public static String prompter(String prompterMessage){
	 
	 System.out.print(prompterMessage);
	 Scanner prompt = new Scanner(System.in);
	 String input = prompt.next();
	 return input;

	}
}