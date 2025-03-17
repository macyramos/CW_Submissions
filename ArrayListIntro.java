@author Macy Ramos

public class ArrayListIntro {

	public static void main(String[] args) {
		 // 1. Instantiate an empty ArrayList that could have any type in it.
        ArrayList<E> anyType = new ArrayList<>();
     
        // 2. Instantiate an empty ArrayList called intArrList that specifically stores Integers. Repeat this for Strings.
        ArrayList<Integer> intArrList = new ArrayList<>(); 
        ArrayList<String> stringArrList = new ArrayList<>();

        // 3.  Add 1, 2, and 3 to your intArrList one at a time so that its values are {1, 2, 3}. Then add elements to stringArrList so its values are {"Alice , "Bob" , "Charlie"}
        intArrList.add(1);
        intArrList.add(2);
        intArrList.add(3);
        
       
        stringArrList.add("Alice");
        stringArrList.add("Bob");
        stringArrList.add("Charlie");

        System.out.println(intArrList);
        System.out.println(stringArrList);

        // 4. Add 5 to your intArrList so that its values are now {1, 2, 5, 3}. Then add "Derek" to your stringArrList so its values are {"Alice" , "Derek" , "Bob" , "Charlie"}
        intArrList.set(2, 5);
		intArrList.add(3);
		
		System.out.println (intArrList);
		stringArrList.set(1, "Derek");
		stringArrList.set(2, "Bob");
		stringArrList.add("Charlie");
		
		System.out.println(stringArrList);
        
        // 5. Print out the second and last elements in both intArrList and stringArrList.
        System.out.println(intArrList.get(1));
        System.out.println(intArrList.get(intArrList.size()-1));
        System.out.println(stringArrList.get(1));
        System.out.println(stringArrList.get(stringArrList.size()-1));

        // 6. Change the first element in intArrList to 0, and change the first element in stringArrList to "Zero". Print out the first element in each array before and after the change. 
        System.out.println(intArrList.get(0));
        System.out.println(stringArrList.get(0));

        intArrList.set(0, 0);
        stringArrList.set(0, "Zero");

        System.out.println(intArrList.get(0));
        System.out.println(stringArrList.get(0));

        // 7. Delete the last element in both arrays. Print out what that removed element was.
        System.out.println(intArrList.remove(intArrList.size()-1));
        System.out.println(stringArrList.remove(stringArrList.size()-1));

        System.out.println(intArrList);
        System.out.println(stringArrList);
    }

	
}
