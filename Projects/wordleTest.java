@author Macy Ramos

import java.util.Scanner;
public class wordleTest {

	static Scanner gameReader = new Scanner(System.in);
	
	
	public static void main(String[] args) {
/*
 * This is the main method where I put my printed out statements.		
 */
		//determine what the answer should be, coder gets to decide this LOWERCASE ONLY
		String soln = new String ("ghost");
		
		System.out.println("Welcome to Wordle! ");
		System.out.println("If you type in a word that is not 5 letters, you will recieve a blank space.");
		System.out.println("If that does happen, please restart the game.");
		
		
		//run the game
		playGame(soln);
		System.out.println("Congrats! You successfully guessed that the word was " + soln + ".");
		gameReader.close();
	}

	private static void playGame(String soln) {
/*
 * This is my playGame method where I set up where the player inputs their guesses and 
 * I also pick the location at which the code starts counting the letters of the word.
 * I also have the display thing  where it displays the letters that are being put down and they are also being compared to the solution.
 */
		//prompt and allow user to give an input, set a String equal to it (it is the guess)
		System.out.println("Make a guess (lowercase please): ");
		String playerGuess = new String (checkLength(gameReader.next()));
		String display = "";
	
	//This is where every character gets recognized by the computer.
		char firstLetter = playerGuess.charAt(0);
		char secondLetter = playerGuess.charAt(1);
		char thirdLetter = playerGuess.charAt(2);
		char fourthLetter = playerGuess.charAt(3);		
		char fifthLetter = playerGuess.charAt(4);
	//This is my display method where it prints out what the player types and compares it to the solution.	
		display = display + firstLetter(firstLetter, soln);
		display = display + secondLetter(secondLetter, soln);
		display = display + thirdLetter(thirdLetter, soln);
		display = display + fourthLetter(fourthLetter, soln);
		display = display + fifthLetter(fifthLetter, soln);
		System.out.println(display);
		
	//This compares the players  guess to the actual solution. 
	//So if the players guess does not equal the solution, the game continues on.
	//If the players guess is the solution, the game ends.	
	
		if (!(playerGuess.equals(display)))
		{
			playGame(soln);
		}
		else  /* if you are here, that means the user guessed it correctly */
		{
			//print out success message
			System.out.println("Congrats! You successfully guessed that the word was " + soln + ".");
		}
		
	}



	private static String checkLength (String input) 
/*
 * This method checks if the Length is 5 letters.
 */
	
	{
	//This checks if the  word is more than or less than 5 characters
		if (input.length() !=  5)
		{
			System.out.println("That word is not 5 letters. Please type again");
			return checkLength(gameReader.next());
		}
		else
		{
			return checkReps(input);
		}
	
	}
	/**
	 * This method checks if the input by the user has repeating letters.
	 * @param input
	 * @return
	 */
	private static String checkReps (String input) {
		
		char firstLetter = input.charAt(0);
		char secondLetter = input.charAt(1);
		char thirdLetter = input.charAt(2);
		char fourthLetter = input.charAt(3);
		char fifthLetter = input.charAt(4);
		//The if statement checks if the letters are repeating in any way.
		if (firstLetter == secondLetter || firstLetter == thirdLetter ||  firstLetter == fourthLetter  || firstLetter == fifthLetter||
		   secondLetter == thirdLetter || secondLetter == fourthLetter || secondLetter == fifthLetter||
		   thirdLetter == fourthLetter || thirdLetter == fifthLetter || 
		   fourthLetter == fifthLetter)
		{
			System.out.println("There are repeating letters in this word. Please input again");
			return checkLength(gameReader.nextLine());
		}
		return input;
	}
	/**
	 * This checks if the first letter is correct
	 * 	
	 */
	private static char firstLetter(char firstLetter, String soln) 
	{
		
		
		if (firstLetter == soln.charAt(0))
			{
				return firstLetter;
			}
		else if (soln.indexOf(firstLetter) != -1)
			{
				return '?';
			}
		else 
			{
				return 'X';
			}
	}
		
	/**
	 * This checks if the second letter is correct
	 * 	
	 */	
	private static char secondLetter(char secondLetter, String soln) 
	{
		if (secondLetter ==  soln.charAt(1))
			{
				return secondLetter;
			}
		else if(soln.indexOf(secondLetter) != -1)
			{
				return '?';
			}
		else
			{
				return 'X';
			}	
	}
	/**
	 * This checks if the third letter is correct
	 * 	
	 */	
	private static char thirdLetter (char thirdLetter, String soln) {
		if(thirdLetter ==  soln.charAt(2))
			{
				return thirdLetter;
			}
		else if(soln.indexOf(thirdLetter) != -1)
			{
				return '?';
			}
		else 
			{
				return 'X';
			}
		
	}	
	/**
	 * This checks if the fourth letter is correct
	 * 	
	 */	
	private static char fourthLetter (char fourthLetter, String soln) {
		if(fourthLetter == soln.charAt(3))
			{
				return fourthLetter;
			}
		else if(soln.indexOf(fourthLetter) != -1)
			{
				return '?';
			}
		else
			{
				return 'X';
			}
		
	}
	/**
	 * This checks if the fifth letter is correct
	 * 	
	 */
	private static char fifthLetter (char fifthLetter, String soln) {
		if(fifthLetter ==  soln.charAt(4))
			{
				return fifthLetter;
			}
		else if(soln.indexOf(fifthLetter) != -1)
			{
				return '?';
			}
		else 
			{
				return 'X';
			}
		
		
		
	}
		
		
}

