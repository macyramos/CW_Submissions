@author Macy Ramos
import java.util.ArrayList;


public class ConvertingArrAlgsToArrayLIstAlgsProject {

	public static void main(String[] args) {
		

	}
	
	/**
	 * 1. Return the smallest number in the ArrayList.
	 */
	
	public static int getSmallest(ArrayList<Integer> arr) 
	//This goes through the ArrayLIst to find the smallest number by comparing each element
	//It sets smallest to i whenever there is a smallest number found
	{
        int smallest = arr.get(0);
        for (int i = 1; i < arr.size(); i++) 
        { 
            if (arr.get(i) < smallest) 
            {
                smallest = arr.get(i);
            }
        }
        return smallest;
    }

	/**
	 * 2. Return the index of the smallest number in the ArrayList. 
	 */

	 public static int getSmallestIndex(ArrayList<Integer> arr) 
	 //This finds the index of the smallest number by going through the array list and comparing each element and then returing the indez of the smallest value
	 {
	        int smallestIndex = 0;
	        for (int i = 1; i < arr.size(); i++) 
	        {
	            if (arr.get(i) < arr.get(smallestIndex)) 
	            {
	                smallestIndex = i;
	            }
	        }
	        return smallestIndex;
	    }
	 
	/**
	 * 3. Return the average of all numbers in the ArrayList. 
	 */

	 public static double getAverage(ArrayList<Integer> arr) 
	 //This calculuates the sum of all the elemtns in the Array list and divdes them by the sum of the size of the array list to return the average
	 {
	        int sum = 0;
	        for (int i = 0; i < arr.size(); i++) 
	        {
	            sum += arr.get(i);
	        }
	        return (double) sum / arr.size();
	    }
	 
	/**
	 * 4. Return true if all numbers in the ArrayList are even, and return false otherwise.
	 */

	 public static boolean areAllEven(ArrayList<Integer> arr) 
	 //Loops through the array list and checks if each element is even. if any number isnt even then it returns false, otherwise it returns true
	 {
	        for (int i = 0; i < arr.size(); i++) 
	        {
	            if (arr.get(i) % 2 != 0) 
	            {
	                return false;
	            }
	        }
	        return true; // If loop completes, all numbers are even
	    }
	 
	/**
	 * 5. If the ArrayList ever has two consecutive 5's, change them to 0's. (For example, passing {4, 5, 5, 2, 1} changes the array to {4, 0, 0, 2, 1} ).
	 */

	 public static void fixConsecutiveFives(ArrayList<Integer> arr) 
	 //This looks for two consecutive 5s and changes them to 0. it skips the following element when a pair is found to avoid going over the same pair mulitple times
	 {
	        for (int i = 0; i < arr.size() - 1; i++) 
	        {
	            if (arr.get(i) == 5 && arr.get(i + 1) == 5) 
	            {
	                arr.set(i, 0);
	                arr.set(i + 1, 0);
	                i++;
	            }
	        }
	    }
	 
	/**
	 * 6. Return true if any number shows up three times in a row, and return false otherwise. 
	 */

	 public static boolean hasThreeInRow(ArrayList<Integer> arr) 
	 //This checks if there are any three consecutive numbers that are the same and if there are, it returns true and if not it returns false
	 {
	        for (int i = 0; i < arr.size() - 2; i++) 
	        { 
	            if (arr.get(i) == arr.get(i + 1) && arr.get(i + 1) == arr.get(i + 2)) 
	            {
	                return true;
	            }
	        }
	        return false;
	    }
	 
	/**
	 * 7. Pass an ArrayList of Integers and a value to be searched for. Return how many times that int shows up in the ArrayList. (For example, passing ( {4, 5, 5, 2, 1} , 5) returns 2 because 5 shows up twice)
	 */

	 public static int countOccurrences(ArrayList<Integer> arr, int value)
	 //This checks how much times a specific number in the array list is shown
	 //First it loops through the whole list while also incrementing a counter whenever the number is seen
	 {
	        int count = 0;
	        for (int i = 0; i < arr.size(); i++) 
	        {
	            if (arr.get(i) == value) 
	            {
	                count++;
	            }
	        }
	        return count;
	    }
	 
	/**
	 * 8. Alter an ArrayList so that is the backwards version of the ArrayList initially passed (for example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 5, 5, 4})
	 */

	 public static void reverseArray(ArrayList<Integer> arr) 
	 //This creates a temporary list and adds the elements of the original list in reverse
	 //It then clears the original lsit and adds all the elemtns back in reverse
	 {
	        ArrayList<Integer> tempList = new ArrayList<>();
	        for (int i = arr.size() - 1; i >= 0; i--) 
	        {
	            tempList.add(arr.get(i));
	        }
	        arr.clear();
	        arr.addAll(tempList); 
	    }
 
	/**
	 * 9. Shift all elements in an ArrayList to the right. (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 4, 5, 5, 2})
	 */

	 public static void shiftRight(ArrayList<Integer> arr) 
	 //The elements all get shifted to the right and the first element is set to the last element of the orignal list
	 {
	        int last = arr.get(arr.size() - 1);
	        for (int i = arr.size() - 1; i > 0; i--) 
	        {
	            arr.set(i, arr.get(i - 1));
	        }
	        arr.set(0, last); 
	    }

	/**
	 * 10. Use either selection sort or insertion sort to sort an ArrayList. (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 4, 5, 5})
	 */

	 public static void selectionSort(ArrayList<Integer> arr)
	 //This finds the smallest number and swaps it with the first position and continuing until its sorted
	 {
	        for (int i = 0; i < arr.size() - 1; i++) 
	        {
	            int minIndex = i;
	            for (int j = i + 1; j < arr.size(); j++) 
	            {
	                if (arr.get(j) < arr.get(minIndex)) 
	                {
	                }
	            }
	            int temp = arr.get(i); 
	            arr.set(i, arr.get(minIndex));
	            arr.set(minIndex, temp);
	        }
	    }
}
