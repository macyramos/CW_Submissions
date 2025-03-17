
public class BubbleSort {

	public static void main(String[] args) {
		int[] nums = {5, 3, 6, 9, 1};
		
		bubbleSort(nums);
		
		for(int num: nums)
		{
			System.out.print(num + "");
		}
		
	}
	
	/**
  *Create a method bubbleSort() that is passed an int array and sorts it using bubblesort. 
  */
  public static void bubbleSort(int[] arr)
	{
		//This first for loop goes through the whole array
		for(int i= 0; i< arr.length; i++)
		{
			//this second for loop makes another variable and compares it 
			for(int j = 0; j < arr.length-1; j++)
			{
				//this checks if the number in the beginning is bigger than the one on the right of it, if it is then swap the elements
				if(arr[j]> arr[j+1])
				{
					//this sets temp to j, then making j equal the number next to it, then setting that to temp 
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
	}

}
