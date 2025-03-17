import java.util.ArrayList;

public class ConvertingArrayAlgsToArrayListAlgs {

	public static void main(String[] args) {
	       
        //checkFor4()
        ArrayList<Integer> check4 = new ArrayList<>();
        check4.add(1);
        check4.add(2);
        check4.add(4);
        check4.add(6);
        check4.add(8);
        
        System.out.println(checkFor4(check4));
        
        //ridAllFives()
        ArrayList<Integer> noFives = new ArrayList<>();
        noFives.add(5);
        noFives.add(5);
        noFives.add(0);
        noFives.add(8);
        noFives.add(5);
        noFives.add(20);
        
        ridAllFives(noFives);
        System.out.println(noFives; 
        
        //bubbleSort()
        ArrayList<Integer> bubble = new ArrayList<>();
        bubble.add(5);
        bubble.add(1);
        bubble.add(3);
        bubble.add(8);
        bubble.add(2);
        
        bubbleSort(bubble3);
        System.out.println(bubble); 
    }

  /**
   *This goes through the ArrayList to check if any element is equal to 4
   *If there is a 4, it returns the index of the place the four is found
   *If there is no 4 found, it returns -1 to show that 4 is not present in the list 
   *
   */
    public static int checkFor4(ArrayList<Integer> arr) 
    {
        for (int i = 0; i < arr.size(); i++)
        {
            if (arr.get(i) == 4) 
            {
                return i;
            }
        }
        return -1;
    }

 /**
  * This removes any mentions of 5 from the ArrayList by going through each element in the arraylist
  * WHen a 5 is found, it is removed and the index is i-- to make sure that the element next doesnt get skipped because of the removal of the 5 in the array
  * 
  */
    public static void ridAllFives(ArrayList<Integer> nums) 
    {
        for (int i = 0; i < nums.size(); i++) 
        {
            if (nums.get(i) == 5)
            {
                nums.remove(i);
               
                i--; 
            }
        }
    }

   /**
    * This method sorts by using bubble sort
    * it starts by checking the first number and ocmparing it with the one on the right, if the one on the left is bigger, they swap and if not the process moves on with the toher number
    */
    public static void bubbleSort(ArrayList<Integer> arr) 
    {
       
        for (int i = 0; i < arr.size(); i++) 
        {
            for (int j = 0; j < arr.size() - 1; j++) 
            { 
                if (arr.get(j) > arr.get(j + 1)) 
                {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }
}	


