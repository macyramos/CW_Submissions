/**
 * This is my Sphere class.
 * Here, I code the components that make up a sphere
 */
public class Sphere 
{
	//data attributes
/**
 * Data attributes:
 * Here  we declare data attributes of a sphere
 */
		private final double pi = 3.1415;
		private double radius;
		
		
		//constructor
/**
 * This converts the private double to a double that can be accessed in the main class
 * @param r
 */
		public Sphere (double r)
		{
			radius= r;	
		}
/**
 * This method returns the radius of a sphere	
 * @return
 */
		//functionality
		public double getRadius()
		{
			return radius;
		}
		
/**
 * This method returns the diameter of a sphere	
 * @return
 */
		public double getDiameter()
		{
			return radius*2;
		}
			
/**
* This method returns the volume of a sphere	
* @return
*/		
		public double getVolume() 
		{
		return 4/3*pi*radius*radius*radius;
		}
		
/**
* This method returns the surface area of a sphere	
* @return
*/
		public double getSurfaceArea() 
		{
		return 4*pi*radius*radius;
		}
		
/**
 * This method returns the word Spheres.
 * @return
 */
		public static String getShape() 
		{
		return "Spheres:";
		}

}
