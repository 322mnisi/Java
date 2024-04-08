import java.util.Scanner;
public class BooleanCoversion {
	public static void main(String args[]) {

	Scanner lightStatus = new Scanner(System.in);
	System.out.println("What is the indicator showing on the dashboard, it should either be a 1 or 0?");

  int n = lightStatus.nextInt();


	if (n == 1){
	System.out.println("Lights are on");
}
    if (n == 0){
	System.out.println("Lights are off");
}
    else if (n != 0 && n != 1){
    System.out.println("You have entered an invalid input, please enter 1 or 0 as shown on the dashboard");}
}
}
