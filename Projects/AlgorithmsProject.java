// @author Macy Ramos

import java.util.Arrays;

public class AlgorithmsProject {

	public static void main(String[] args) {
		
	int[] numArr= {1,2,3,4,5,6,7};
	System.out.println(Arrays.toString(numArr));
	
	backwardsArray(numArr);
	System.out.println(Arrays.toString(numArr));

	}

	
/**
 * Task 1: return the  smallest number in the array
 */
	public static int returnSmallestNumber(int[] array)
	//In this, i set a variable to the beginning of an array which is 0
	//For the for loop, i made sure it started at the beginning, test to see it wont pass the length, then continue on
	//In it I put array[i]  and made  sure that it wsant bigger or equal to the smallest
	//if its not then i declare the smallest number in the array and return it
	
	{
		int smallest = array[0];
		
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] <= smallest)
			{
				smallest = array[i];
			}
		}
		
		return smallest;
	}
			
/**
 * Task 2: return the index  of  the smallest number in the array
 */
	
	public static int returnSmallestIndex(int[] array)
	//in this i made sure to set the smallest to 0 cuz they definetely have 0
	//i also have anindex variable 
	//the for loop checks the sme thinng as last time and same for the if thing
	//instead of  i  being kept as  something random, it is kept as index sinncce finding the smallest and index are thesame
	//thenn returning the index
	
	{
		int smallest = array[0];
		int index = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] <= smallest)
			{
				smallest = array[i];
				index = i;
			}
		}
		
		return index;
	
	}
	
/**
 * Task 3: return the average of all numbers in the array
 */
	
	public static int averageArray(int[] array)
	//i  create a variable average and set it to 0
	//i  do  the for each loop that checks every number in the array
	//after  that, i add each number to the average
	//then to find the average i do average divided by how much stuff  are in nthe array
	
	{
		int average = 0;
		
		for(int i : array)
		{
			average += i;
		}
		
		return average / array.length;
		
		
		
	}
			
		
/**
 * Task 4: return true if all numbers in the array are even, return false otherwise	
 */
	
	public static boolean evenArray(int [] array)
	//this i did a for ecah loop and it went through every number in the array
	//then i checked if the nnumbers were divisible by an odd number and equaled 0, if they did i would return false
	//if they did then the verdict is that its true
	
	{
		for(int i: array)
		{
			if(i%3 ==0)
			{
				return false;
			}
		}
		return true;

	}

/**
 * Task 5: If the array ever has two consecutive 5's, change them to 0's. 
 * (For example, passing {4, 5, 5, 2, 1} changes the array to {4, 0, 0, 2, 1} ).
 */
		
	
	public static void consecutiveFives(int[] array)
	//for this i made a for loop that started at the beginning, doesn't go past the length, and then  checks each number
	//then the if statement checks if a number is 5 aand if the number after it is also 5 then they both get changed to 0
	
	{
		for(int i= 0; i < array.length-1; i++)
		{
			if(array[i]==5 && array[i+1]==5)
			{
				array[i]=0;
				array[i+1]=0;
			}
		}
	}
	
	
/**
 * Task 6: Return true if any number shows up three times in a row, and return false otherwise. 
 */
	
	public static boolean numberThreeTimes(int[] array)
	//for this i created a for loop that starts at the beginning of the array, checcks to see that the i is not passing length, then continuing on
	//the if statement checks if a number is equal to the number next to it, then if the number next to it is equal to the number next to it
	//if it is then it returns true, if its not then it returns false
	
	{
		for(int i=0; i < array.length-2; i++)
		{
			if(array[i]== array[i+1] && array[i+1]== array[i+2])
			{
				return true;
			}
		}
		return false;
	}
	
/**
 * Task 7: Pass an array of ints and an int to be searched for. Return how many times that int shows up in the array. 
 * //(For example, passing ( {4, 5, 5, 2, 1} , 5) returns 2 because 5 shows up twice
 */
	
	public static int returnInts(int[] array, int search)
	//for this i set avariable count  to 0
	//then i  made a for each loop that checks everything in an array
	//if the variable i equalls to whaat im searching for, then add a number to a count and keep doing thaat till the loop is done
	//then finally return the count
	
	{
		int count=0;
		
		for(int i : array)
		{
			if(i == search)
			{
				count++;
			}
		}
		return count;		
	}
	
	
/**
 * Task 8: Alter an array so that is the backwards version of the array initially passed (for example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 5, 5, 4})
 */
	
	public static void backwardsArray(int[] array)
	//for this i made a for loop that staarts at 0, doesnt go past the middle of an array ebcause if it does it could reverse the process, then keep going to the other numbers
	//i made a temp and set it to a number in the array which i call i cause can
	//then the array  i is set to "array[array.length-1-i]" because its starting from the back and also not counting past the numbers tht were allready mentioned in the array
	//then i set that to temp
	
	{
		
		for(int i=0; i < array.length / 2; i++)
		{
			int temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i]= temp;
		
			
		}	
		
		
			
	}
/**
 * Task 9: Shift all elements in an array to the right. (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 4, 5, 5, 2})
 */
	public static void shiftElements(int[] array)
	//so i start by declaring i as the number at the end, then  testing to see that i is not less thann  0, then go to the numbers in reverse
	//i madetemp equal to array[i] adn set that to array i-1, then i set that to temp
	
	{
		for(int i = array.length-1; i > 0; i--)
		{
			int temp = array[i];
			array[i] = array[i-1];
			array[i-1]= temp;
			
		}
		
	}
	

/**
 * Task 10: Use either selection sort or insertion sort to sort an array. (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 4, 5, 5})
 */

	public static void selectionSort(int[]array)
	//i used selection sort and i made the smallest equal 0  for now, set the index  to 0 for now
	//for the first for loop i made i equal 0, checked  if the length is more than i, then keep goingn
	//the inside for loop set j to i, then reepat  the process
	//inside that for loop i put if the nnumber in the array is less than nor equal to the smallest, then ni would set that number to smallest and also out that in index
	//them temp would equal that nnumber in the array, it will then be set to index, then index will be temp annd it will be sorted.
	
	{
		int smallest = array[0];
		int index = 0;
		for(int i = 0; i < array.length; i++)
		{
			for (int j = i; j < array.length; j++)
			{
				if (array[i] <= smallest)
				{
					smallest = array[i];
					index = i;
				}
			}
			int temp = array[i];
			array[i] = array[index];
			array[index]= temp;
			
		}
		
		
	}
	
}
