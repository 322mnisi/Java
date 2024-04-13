import java.util.Scanner;
public class printRoses {

     public void printMrWH(){
     	String welcome = "Welcome, below is a list of Pangrams and Poems. Using your keypad, please enter the number for your selection.\nPANGRAMS:\n1. Grandchild’s guide to using grandpa’s computer\nPOEMS:\n2. Rose are red";
    	System.out.println(welcome);
        Scanner input = new Scanner(System.in);

        int selection = input.nextInt();

        if (selection == 1){
    	String pan = "Gene Ziegler\nGrandchild's guide to using grandpa’s computer\nIf a packet hits a pocket on a socket on a port,\nAnd the bus is interrupted as a very last resort,\nAnd the address of the memory makes your floppy disk abort\nThen the socket packet pocket has an error to report!";
		System.out.println(pan);
	    }

		if (selection == 2){
		System.out.println();
		String pan1 = "Roses are red\nViolets are blue\nMy sudden love for java\nIs the same I have you you";;
        System.out.println(pan1);
        }

        if (selection != 1 && selection != 2){						//Relook at why the if else statement is not compilling.
         System.out.println("No valid selection");
        }
      
    }

	 public static void main(String [] args){

		printRoses Object = new printRoses();
		Object.printMrWH();
        }
    }