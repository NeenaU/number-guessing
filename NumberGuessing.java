import java.util.Scanner;
import java.util.Random;


/*
 * A number guessing game. The user will input an upper bound and the program generates a random number between 0 and the upper bound.
 * Then the user must guess the number - with every guess the program will tell the user if they need to guess higher or lower.
 */
public class NumberGuessing {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Get the upper bound from the user
		System.out.println("Enter the upper bound");
		int upperBound = scanner.nextInt();
		
		//Generate a random number for the user to guess
		Random random = new Random();
		int num = random.nextInt(upperBound);
		
		System.out.println("Guess a number between 0 and " + upperBound);
		Boolean guessed = false;
		
		//Let the user keep guessing until they get it right
		while (!guessed) {
			
			int guess = scanner.nextInt();
			
			if (guess == num) {
				System.out.print("You guessed it!");
				guessed = true; //the user has guessed correctly - exit the loop
			}
			else if (guess < num) {
				System.out.println("Higher");
			}
			else {
				System.out.println("Lower");
			}
		}
				
	}

}
