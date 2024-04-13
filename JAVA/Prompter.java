import java.util.Scanner;
public class Prompter {
	public static String prompter(String msg) {
	 Scanner inName = new Scanner(System.in);
     System.out.println(msg);
		return inName.next();

	 Scanner inSurname = new Scanner(System.in);
     System.out.println(msg);
		return inSurname.next();

	 // Scanner inBirthDate = new Scanner(System.in);
     // System.out.println(msg);
	// 	return inBirthDate.next();

	 // Scanner inDistance = new Scanner(System.in);
     // System.out.println(msg);
	// 	return inDistance.next();

	}


	}