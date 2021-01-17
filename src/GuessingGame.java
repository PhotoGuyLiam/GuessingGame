import java.util.*;

public class GuessingGame {

	
	
	public static void main (String[] args) {
	
		Random rollTheDice = new Random(); // Starts random object
		int rndNum = rollTheDice. nextInt(10001); //generates from 0 to 10000
		
	
		int guessMin = 1; // sets starting minimum value
		int guessMax = 10000; // sets starting maximum value
		
		Scanner userGuess = new Scanner(System.in);
		
		System.out.println("Guess a number between 1 and 10000");
		
		int userInt = userGuess.nextInt();
		
		
		// while loop for guessing program
		while (userInt != rndNum) {
			
			
		if (userInt == rndNum) {
				System.out.println("You answered correctly, the number is " + rndNum);
			}
			
		else if (userInt <= rndNum) {
			guessMin = userInt;
			System.out.println("Too low, guess higher.");
			System.out.println("Guess a number between " + guessMin + " and " + guessMax);
			userInt = userGuess.nextInt(); }
			//If guess is higher than random number
		else if (userInt >= rndNum) {
			guessMax = userInt;
			System.out.println("Too high, guess lower.");
			System.out.println("Guess a number between " + guessMin + " and " + guessMax);
			userInt = userGuess.nextInt();
			
		
		}	
			
			
		}
		
		System.out.println("You guessed correctly!");
		
		//end main method
		}
		
	
	
	
	}
	
	//end program
	




