/**
 *  This is my Cubes class.
 *  Here, I code the components that make up a cube
 */
public class Cubes {
/**
 *  This is where we declare data attributes of a cube.
 */
	//data attributes
/**
 * This is where the edge gets set to doubles.
 */
	private double edge;
		
		
	//constructor
/**
 * This is where edge is being declared.	 
 */
	public Cubes (double e)
	{
		edge = e;	
	}
		
	
	//functionality
/**
 * This is where the edge gets returned.
 */
		public double getEdge()
		{
			return edge;
		}
		
/**
 * This is where the volume gets returned.		
 */
		public double getVolume() 
		{
		return edge*edge*edge;
		}
		
/**
 *This is where the surface area gets returned.	
 */
		public double getSurfaceArea() 
		{
		return 6*edge*edge;
		}
		
/**
 * 	This is where the shape name "cube" gets returned
 */
		public static String getShape() 
		{
		return "Cube:";
		}

}
