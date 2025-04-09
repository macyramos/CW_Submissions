
public class TwoDArrayIntroPractice {

	public static void main(String[] args)
	{
		//1. Instantiate a 2-D array gridNums that consists of 4 rows and 6 columns using the new keyword. 
		int[][] gridNums =  new int [4][6];
		//2. Instantiate a 2-D array with the following values
		//4   5    7
		//2  -1   8
		//0  1   3
		
		int[][] grid2 = new int [3][3];
		
		grid2[0][0] = 4;
		grid2[0][1] = 5;
		grid2[0][2] = 7;
		
		grid2[1][0] = 2;
		grid2[1][1] = -1;
		grid2[1][2] = 8;
		
		grid2[2][0] = 0;
		grid2[2][1] = 1;
		grid2[2][2] = 3;
		
		//4. For both of those arrays, change the element in the second row, third column into a 20. 
		
		gridNums[1][2]= 20;
		System.out.println(gridNums[1][2]);
		
		grid2[1][2] = 20;
		System.out.println(grid2[1][2]);
		
		//5. For both of those arrays, change the last element in the first row to a -5. Accomplish this using .length 

		gridNums[0][gridNums[0].length-1] = -5;
		System.out.println(gridNums[0][gridNums[0].length-1]);
		
		grid2[0][grid2[0].length-1]	= -5;	
		System.out.println(grid2[0][grid2[0].length-1]);
				
		//6. For both of those arrays, change the first element in the last row to a -7. Accomplish this using .length \
		gridNums[gridNums.length-1][0] = -7;
		System.out.println( gridNums[gridNums[0].length-1][0] );
		
		grid2[grid2[0].length-1][0] = -7;
		System.out.println(grid2[grid2[0].length-1][0]);
			    
		//7. For both of those arrays, change the last element in the last row to a -30. Accomplish this using .length 
		gridNums[gridNums[0].length-1][gridNums[0].length-1] = -30;
		System.out.println(gridNums[gridNums[0].length-1][gridNums[0].length-1]);
		
		grid2[grid2[0].length-1][grid2[0].length-1] = -30;
		System.out.println(grid2[grid2[0].length-1][grid2[0].length-1]);
	
		
		int[][] myArray = 
		{		
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};	
		
		firstRow(myArray);
		firstColumn(myArray);
		rowMajorOrder(myArray);
		columnMajorOrder(myArray);
	}
	

	//For the following problems, print out those elements before and after to verify it worked. 

	
		
	//8. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first row. 
	//public static void firstRow (int[][]arr)
	
	public static void firstRow (int[][]arr)
	{
		System.out.println("First Row:");
		for(int i=0; i<arr[0].length; i++)
		{
			System.out.println(arr[0][i]);
		}
		System.out.println();
	}
	

	//9. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first column.
	
	public static void firstColumn (int[][]arr)
	{
		System.out.println("First Column:");
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i][0]);
		}
		System.out.println();
	}

	//10. Create a method that is passed a 2-D array of ints and one by one prints out each element in row-major order. 

	public static void rowMajorOrder (int[][]arr)
	{
		System.out.println("Row Major Order:");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
		System.out.println();
	}
	//11. Create a method that is passed a 2-D array of ints and one by one prints out each element in column-major order. 
	
	public static void columnMajorOrder (int[][]arr)
	{
		System.out.println("Column Major Order:");
		for(int j=0; j<arr[0].length;j++)
		{
			for(int i=0; i<arr.length;i++)
			{
				System.out.println(arr[i][j]);
			}
		}
		System.out.println();
	}


}

