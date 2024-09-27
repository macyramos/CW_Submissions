/**
 *  This is my Rectangles class.
 *  Here, I code the components that make up a rectangle
 */
public class Rectangle
{
/**
* Data Attributes:
* Here we declare data attributes of a rectangle
*/

	private double length;
	private double width;
	
	
	//constructor
/**
 * This converts the private doubles to doubles that 
 * can be accessed in the main class
 *
 */
	public Rectangle (double L, double W)
	{
		length= L;
		width= W;
	}
	
	
	//functionality
/**
* This method returns the length of a rectangle
* @return
*/
	public double getLength()
	{
		return length;
	}
		
/**
* This method returns the width of a rectangle	
* @return
*/
	public double getWidth()
	{
	return width;
	}
			
/**
* This method returns the perimeter of a rectangle
* @return
*/
	public double getPerimeter() 
	{
		return 2*(length+width);
	}
/**
* This method returns the area of a rectangle
* @return
*/
	public double getArea() 
	{
	return length*width;
	}

/**
* This method returns the word Rectangle
* @return
 */
	public static String getShape() 
	{
		return "Rectangle";
	}
		
		
	
	

}
