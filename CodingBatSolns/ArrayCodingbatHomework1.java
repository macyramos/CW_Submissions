@Author Macy Ramos


/**Task 1: First last 6
*Given an array of ints, return true if 6 appears as either the first or last element in the array
*/The array will be length 1 or more

public boolean firstLast6(int[] nums) {
//This method checks if the length is more than or equal to 1, and if it is, then it checks if the first number is equal to 6 or if the last number is equal to 6
//If at least one of them do, it will return true. If it is not, it will return false.

if(nums.length >= 1)
 {
   if (nums [0] == 6 || nums [nums.length-1] ==6)
    {
      return true;
    }
 }
 return false;
}

/**Task 2: Same First Last
*Given an array of ints, return true if the array is length 1 or more,
*/and the first element and the last element are equal.

public boolean sameFirstLast(int[] nums) {
//This method checks if the length of the array of ints is more than or equal to 1, if it is, then it goes on to check if the first digit is the same as the last digit
//(checking if theyre the same spot), if it is, then it returns true. If not, it returns false.
  if (nums.length >=1)
  {
      if(nums [0] == nums [nums.length-1])
      {
        return true;
      }
  } 
  return false; 
}

/**Task 3: Make Pi
*Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}
*/

public int[] makePi() {
//This method returns an array length of 3 that contains the first 3 digits of pi, it does this by instantiating the numbers of pi, then it returns pi

  int [] Pi = {3, 1, 4};
  return Pi;
}

/**Task 4: Common End
*Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. 
*/Both arrays will be length 1 or more.

public boolean commonEnd(int[] a, int[] b) {
//This method is given 2 arrays of ints, a and b, and it returns true if they both have the same first element or the same last element
//The if statement checks to compare the length of a with the length of be and it checks to see if its equal or more
//Then another if statement checks if the first digits of a and b and the last digits of a and b are matching, then it returns true
//If not, it returns false

if(a.length >= 1 && b.length >= 1)
  {
    if (a [0] == b[0] || a[a.length-1] == b[b.length-1])
      {
        return true;
      }
  }
  return false;
}

/**Task 5: Sum 3
*Given an array of ints length 3, return the sum of all the elements
*/

public int sum3(int[] nums) {
//This method gathers the sum of all the 3 elements by simply adding them together

return nums [0] + nums [1] + nums [2];
}


