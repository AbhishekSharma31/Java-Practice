import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//output the prompt
		System.out.println("Enter a line of text");
		
		//Wait for the user to enter a line of text
		//String line = input.nextLine();
		int value = input.nextInt();
		//Tell them what they eneterd 
		System.out.println("You entered:" + value);
			
		
	}

}
