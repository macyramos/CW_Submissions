@author Macy Ramos

 
public class AlteringArraysProblem {

	public static void main(String[] args) {
		int [] nums = {5, 0, 8, 20};
		
		System.out.println(nums);
		subtract5FromAll4(nums);
		
	}
	
	public static int[] subtract5FromAll4(int[] arr)
	{

    
  /**
	 * For this I made a copy array and set the values to match the values in array
	 * Then I took the copy array and and changed each value to that number minus5
	 * then forthe for loop I  start with the  first number, chck if  the lengthis  greater than 0, then i add one more  count  and print each value
	 * then  repeat the process until all 4 are done	
	 */

    
    int[] copyArr = new int [4];
		
		copyArr[0] = arr[0];
		copyArr[1] = arr[1];
		copyArr[2] = arr[2];
		copyArr[3] = arr[3];
		
		copyArr[0]= copyArr[0]-5;
		copyArr[1]= copyArr[1]-5;
		copyArr[2]= copyArr[2]-5;
		copyArr[3]= copyArr[3]-5;
		
		 for(int i=0; i< copyArr.length; i++)
		 {
		  System.out.println(copyArr[i]); 
		 }
		
		return copyArr;
	}

}
 


