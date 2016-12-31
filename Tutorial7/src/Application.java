import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Output prompt and store input
		System.out.println("Enter a line of text: ");
		String line = input.nextLine();
		
		//Show what the user entered
		System.out.println("You entered: " + line);
		
		
		//Part 2
		System.out.println("\nEnter an integer: ");
		int userInt = input.nextInt();
		
		System.out.println("You enterd: " + userInt);
	}
}
