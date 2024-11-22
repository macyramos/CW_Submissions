
import java.util.Scanner;

public class MontyHallGameMain {

//cannot close and open scanners repeatedly
	
static Scanner myReader =new Scanner (System.in);
	
	public static void main(String[] args) 
	{

//This is where I wrote out my introduction into the game		
		System.out.println("Welcome to the Monty Hall Game Show! Please select a door, ranging from numbers 1-3");
		System.out.println("Please input number integers.");
		
//Here I  declared my variables.		
		int winDoor = pickRandomDoor();	
		int selectDoor = selectDoor();	
		int revealDoor = showWrongDoor(winDoor,selectDoor);	
		int correctDoor = showRightDoor();
		
//Here I wrote my  code to make the game print out words based off of the selections people chose		
		System.out.println("You chose Door " + selectDoor + "!");
		System.out.println("Door " + revealDoor + " was wrong. Would you like to switch doors?");
		correctDoor(winDoor, selectDoor,correctDoor);
		System.out.println("You chose Door " + selectDoor);
		System.out.println("The  winning door was Door " + correctDoor);
		
//Here I closed my scanner.
		
		myReader.close();	
	}
	
	
	
/**This is where I wrote  my first method, which declares which one is the right door.		
 * In here, I wrote a random number generator to pick which door would be considered right and I also did the same for picking a door at random.
 *@return
 */
	private static int showRightDoor() 
	{
		return ((int)(Math.random()*3)+1);
	}


	private static int pickRandomDoor()
	{
		
		return ((int)(Math.random()*3)+1);
		
	}
	
	
/**This is where I wrote my  second  method, this one declares which door the person playing had selected.	
 * @return
 */
	private static int selectDoor()
	//Here you will select a door at Random, picking from either Door 1, Door 2, Door 3
	{
		
		String input = new String (myReader.next());
		
	
		
		if(input.equals("one") || (input.equals("1")))
				{
					return 1;
				}	
		
		if(input.equals("two") || (input.equals("2")))
				{
					return 2;
				}
		if(input.equals("three") || (input.equals("3")))
				{
					return 3;
				}
		else
			{
			System.out.print("Run code again");
			return selectDoor();
			}
	}
	
		

	
/** We  will be revealing which door was wrong
 * 
 * @param winDoor
 * @param selectDoor
 * @return
 */
/**To do that,  I used a randomizer which decides which door would be wrong.
 * 
 * @param winDoor
 * @param selectDoor
 * @return
 */
	private static int showWrongDoor(int winDoor, int selectDoor)
	{
	
		int showWrongDoor = ((int)(Math.random()*3+1));
		
		if (showWrongDoor == winDoor || showWrongDoor == selectDoor)
		{
			return showWrongDoor(showWrongDoor, selectDoor);
		}
		else
		{
			return showWrongDoor;
		}
	}
		
	
/**
 * This is my third method which tells the player what door is correct
 * For this,  I considered the door  that  has  the prize inside,  the 
 * door the player had selected, and it  also tells you which door was correct
**/	
	public static void correctDoor (int winDoor, int selectDoor, int showRightDoor)
		{
		String input = new String(myReader.next());
		if (input.equals("yes")) 
			{
				if (showRightDoor == winDoor)
				{
					System.out.println( "You won!");
				}
				else 
				{
					System.out.println("You lost!");
				}
			}
			else if (input.equals("no"))
			{
				if (selectDoor == winDoor)
				{
					System.out.println ("You won!");
				}
				else 
				{
					System.out.println("You lost!");
				}
			}
			else
			{
				System.out.println("Please select a door from the choices available.");
				correctDoor(winDoor, selectDoor, showRightDoor);
			}
		}

	
}
