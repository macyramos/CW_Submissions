/**
 * This is my circles class.
 * Here I wrote the componennts to a  circle.
 */
public class Circles 
{

	
	//data attributes
/**
 * This is where I wrote my attributes of a circle.
 */
		private final double pi = 3.1415;
		private double radius;
	
	
	//constructor
/**
 * This is where the components that make a  circle is.
 * 
 */
		public Circles (double r)
	{
		radius= r;	
	}
	
	//functionality
/**
 * This  is  where the radius of the circle gets returned.	
 * @return
 */
	public double getRadius()
	{
		return radius;
	}
	
/**
 * This is where the diameter of the circle gets returned	
 */
	public double getDiameter()
	{
		return radius*2;
	}
		
/**
 * This is where the circumference of the circle gets returned.		
 * @return
 */
	public double getCircumference() 
	{
	return pi*radius*2;
	}
	
/**
 * This i s where the area of the circle gets returned.	
 * @return
 */
	public double getArea() 
	{
	return pi*radius*radius;
	}
	
/**
 * This is where the area of the radius is being set again  (this is the exaample one)	
 * @param r
 */
	public void setRadius (double r)
	{
		radius=r;
	}
	
/**
 * This turns everything bout the circle object into a String	
 * @return
 */
	public static String getShape() 
	{
	return "Circle:";
	}
/**
 * This is also where we did an example testto see shorter waays to do this method.
 */
	public String toString()
	{
		return "This is a circle with radius  " + radius + "and an area of " + getArea()+ "and circumference of  " + getCircumference()  + ".";
	}
		
}
