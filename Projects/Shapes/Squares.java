/**
 * This is my squares class.
 * Here I wrote  everything  thaat makes up a  square.
 */
public class Squares 
{
		//data attributes
/**
 * This is saying what attributes belong to a square.		
 */
		private double side;
		
	
		
		//constructor
/**
 *This sets the sides to doubles.
 */
		public Squares(double s)
		{
			side = s;
		}
		
		
		//functionality
/**
 * Returns the length of a side
 */
		public double getSide()
		{
			return side;
		}
/**
 * This returns the perimeter.	
 */
		public double getPerimeter() 
		{
			return 4*side;
		}
/**
 * This returns the area.
 */
		public double getArea() 
		{
			return side*side;
		}
/**
 * This  returns the shape name.		
 */	
		public static String getShape() 
		{
			return "Square:";
		}
	}
