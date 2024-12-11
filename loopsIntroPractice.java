@author Macy Ramos

	
public class loopsIntroPractice {


	public static void main (String [] args) {
		 
		  int num = 5;
		  System.out.println("The factorial of" + num + "is" + num*5);
		  System.out.println(getFactorial(5));
		  System.out.println(getIfRepeats("abcde"));
		 
	  }
	
	
	
	/*
	 *   
	 */
	 public static int countLetters(String str, char let)
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
	
	public static int getFactorial (int num) 
	{	
		for(int i = num - 1; i>0; i--)
			{
				num *= i;
			}
		return num;
		
	}
	
	
	public static boolean getIfRepeats (String str)
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
