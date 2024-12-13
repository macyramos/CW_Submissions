@author Macy Ramos

	
public class loopsIntroPractice {


	public static void main (String [] args) {
		 
		  int num = 5;
		  System.out.println("The factorial of" + num + "is" + num*5);
		  System.out.println(getFactorial(5));
		  System.out.println(getIfRepeats("abcde"));
		 
	  }
	
	
	
	/*
	 *This method counts how much letters is being passed through a string.   
	 */
	 public static int countLetters(String str, char let)
	//First the count starts at 0
	//Second the for loop starts i at 0, then it checks if the length of the string is greater than 0, if it is then you add one to the count
	//The if statement checks if the i count matches the letter count, if it does add to the count
	//Then finally the count gets returned
	 {	
		 
		 int count = 0;
		 
		 for(int i = 0; i < str.length(); i++) 
		 {
			 if(str.charAt(i) == let)
			 {
				 count++;
			 }	 
		 }
		 return  count;
	 }

	/*
	*This method gets the factorial of a number
	*/
	public static int getFactorial (int num) 
	//First num gets declared as an int
	//The for loop starts with i being declared as num-1 (which subtracts a number every time the loop runs)
	//Then i gets checked to see if its higher than 0, if its not then the code stops running
	//Then after that part the i count gets subtracted
	//
	
	{	
		for(int i = num - 1; i>0; i--)
			{
				num *= i;
			}
		return num;
		
	}
	
/*
*This method checks if letters are repeating
*/	
	public static boolean getIfRepeats (String str)
	//The string gets declared as str
	//First in the for loop, i gets set to 0, then the length gets checked, then one gets added
	//In the if statement, it checks if i is equal to i+1, then if it is it returns true, if not returns false
	
	{
		
		for(int i = 0; i<str.length()-1; i++)
		{
			if(str.charAt(i) == str.charAt(i+1))
			{
				return true;
			}
			
		}
		return false;
	
	}
	
	

}
