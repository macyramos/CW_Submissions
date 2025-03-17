

public class SearchingArraysIntro {

	public static void main(String[] args) {

	}
	
	/**
	 *For this method, it checks if the array has the number 4 in it, and if it does, it returns true. Otherwise, it returns false. 
	 */
	
	public static boolean checkFor4(int[] arr) 
	//This goes through every number in the array and checks if the number 4 is there, and if it does find a 4, it returns true. if it doesnt, it returns false after checking every number in the array
	{
	    for (int i = 0; i < arr.length; i++) 
	    {
	        if (arr[i] == 4) 
	        {
	            return true;
	        }
	    }
	    return false;
	}
	
	/**
	 *In this method, this counts how manyn times the number 4 shows up in the array
	 */
	public static int countFor4(int[] arr)
	//This method goes through the whole array and counts how many times the number 4 appears and it adds one to the count every time it is mentioned.
	{
		int count = 0;
		
		for(int i=0; i < arr.length; i++)
		{
			if(arr[i] == 4)
			{
				count++;
			}
		}
		return count;
	}
	
	
	
	/**
	 *In this method, it checks if the number 4 is being repeated in an array 4 times.
	 */
	public static boolean checkForFour4(int[] arr) 
	// For this, I made sure that it goes through the array and counts how many times the number 4 shows up
	//Then if it finds the number 4, four times, it returns true, and if it doesnt it returns false 
		
	{
	    int count = 0;

	    for (int i = 0; i < arr.length; i++) 
	    {
	        if (arr[i] == 4) 
	        {
	            count++;
	            if (count == 4) 
	            {
	                return true;
	            }
	        }
	    }

	    return false; 
	}
	

}
