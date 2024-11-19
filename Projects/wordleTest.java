@author Macy Ramos

	
import java.util.Scanner;
public class wordleTest {

	static Scanner gameReader = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		//determine what the answer should be, coder gets to decide this LOWERCASE ONLY
		String soln = new String ("ghost");
		
		
//This is where I introduce the basic instructions to play Wordle.


		
		
		System.out.println("Welcome to Wordle! ");
		System.out.println("If you type in a word that is not 5 letters, you will recieve a blank space.");
		System.out.println("If that does happen, please restart the game.");
		
		
		//run the game
		playGame(soln);
		System.out.println("Congrats! You successfully guessed that the word was " + soln + ".");
		gameReader.close();
	}

	private static void playGame(String soln) {
		
		//prompt and allow user to give an input, set a String equal to it (it is the guess)
		System.out.println("Make a guess (lowercase please): ");
		String playerGuess = new String (checkLength(gameReader.next()));
		String display = "";
		
		char firstLetter = playerGuess.charAt(0);
		char secondLetter = playerGuess.charAt(1);
		char thirdLetter = playerGuess.charAt(2);
		char fourthLetter = playerGuess.charAt(3);		
		char fifthLetter = playerGuess.charAt(4);
		
		display = display + firstLetter(firstLetter, soln);
		
		display = display + secondLetter(secondLetter, soln);
		
		display = display + thirdLetter(thirdLetter, soln);
		
		display = display + fourthLetter(fourthLetter, soln);
		
		display = display + fifthLetter(fifthLetter, soln);
		System.out.println(display);
		
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
	{
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
	
	private static String checkReps (String input) {
		char firstLetter = input.charAt(0);
		char secondLetter = input.charAt(1);
		char thirdLetter = input.charAt(2);
		char fourthLetter = input.charAt(3);
		char fifthLetter = input.charAt(4);
		
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

