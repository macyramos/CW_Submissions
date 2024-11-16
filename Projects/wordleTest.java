import java.util.Scanner;
public class wordleTest {

	static Scanner gameReader = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
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

	/**
	 * You decide how to comment this!
	 * 
	 * @param soln is the right answer
	 */
	private static void playGame(String soln) {
		
		//prompt and allow user to give an input, set a String equal to it (it is the guess)
		System.out.println("Make a guess (lowercase please): ");
		String playerGuess = new String (checkLength1(gameReader.next()));
		String display = "";
	

	
		String checkLength = "You can only have up to 5 letters, please try again";
		
		char firstLetter = playerGuess.charAt(0);
		char secondLetter = playerGuess.charAt(1);
		char thirdLetter = playerGuess.charAt(2);
		char fourthLetter = playerGuess.charAt(3);		
		char fifthLetter = playerGuess.charAt(4);
		
		display = display + firstLetter(firstLetter, soln);
		System.out.println(display);
		
		display = display + secondLetter(secondLetter, soln);
		System.out.println(display);
		
		display = display + thirdLetter(thirdLetter, soln);
		System.out.println(display);
		
		display = display + fourthLetter(fourthLetter, soln);
		System.out.println(display);
		
		display = display + fifthLetter(fifthLetter, soln);
		System.out.println(display);
		
		/*
		String firstLetter = firstLetter();
		String secondLetter  = secondLetter();
		String thirdLetter  = thirdLetter();
		String fourthLetter = fourthLetter();
		String fifthLetter = fourthLetter();
		*/
		
	
		
		
		
		if (playerGuess != soln)
		{
			playGame(soln);
		}
		else  /* if you are here, that means the user guessed it correctly */
		{
			//print out success message
			
			System.out.println("Congrats! You successfully guessed that the word was " + soln + ".");
		}
		
	}



	private static String checkLength1 (String input) {
		if (input.length() !=  5)
		{
			return checkLength1(gameReader.next());
		}
		else
		{
			return input;
		}
	
	}
	
	private static String checkLength(String input) {
		char firstLetter = input.charAt(0);
		char secondLetter = input.charAt(1);
		char thirdLetter = input.charAt(2);
		char fourthLetter = input.charAt(3);
		char fifthLetter = input.charAt(4);
		char repeatingLetter = 'a';
	
		
		if(firstLetter == secondLetter || firstLetter == thirdLetter ||  firstLetter == fourthLetter  || firstLetter == fifthLetter||
		   secondLetter == thirdLetter || secondLetter == fourthLetter || secondLetter == fifthLetter||
		   thirdLetter == fourthLetter || thirdLetter == fifthLetter || 
		   fourthLetter == fifthLetter)
			
		
		if(repeatingLetter == 5) 
			{
				return "";
			}
		if(repeatingLetter != 5)
			{
				return "You have repeating letters in your word, please try again.";
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

