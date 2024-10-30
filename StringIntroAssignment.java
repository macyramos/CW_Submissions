import java.util.Scanner;
public class StringIntro {

	public static void main(String[] args) {

		//you make a scanner object that reads different parts of the IDE
		Scanner object = new Scanner (System.in);
		
		//instantiates a new string called myWord setting it equal to whatever comes next in the console (box down below)		
		String myWord = new String(object.next());
				
		
		//.close shuts down the scanner
		object.close();
		
		printSecondandLastLetter(myWord);

		System.out.println("The location of E is at the index of " + findE(myWord)  );
		
		printFirstAndLastThree(myWord);
	}
	
	public static void printSecondandLastLetter(String temporary)
	
	{
		System.out.print("The second and last letter in the word is: ");		
		
		char secondLetter =  temporary.charAt(1);
		char lastLetter = ( temporary.charAt(temporary.length()-1));
		System.out.println("" + secondLetter+lastLetter);	
	}
	
	
	public static int findE (String temporary)
		{
			int eLocation = temporary.indexOf("e") ;
			return eLocation;
		}
	
	public static int getLength (String temporary)
	
	{
		String myWord = new String();
		int getLength = myWord.length();
		System.out.println ("The length of the word is: " + getLength);
		return getLength;
	}
	
	public static void printFirstAndLastThree (String temporary)
{
	
		
		String firstThreeLetters = new String (temporary.substring (0,3));
		String lastThreeLetters = new String (temporary.substring (6,temporary.length()));
		
		System.out.println("The First Three letters of the word is: " + firstThreeLetters);
			
		System.out.println("The Last Three Letters of the word is: " +  lastThreeLetters);
			
		
	}
	
}
