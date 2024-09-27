/**
 * This is my triangles class.
 *There are the components that make up  a triangle.
 */
public class Triangle {
	
	//data attributes
/**
 * This is the  attributes that make up a  triangle.	
 */
		private double side;
		
		
	//constructor
/**
 * 	This is where the components of making a triangle  is put.
 */
		public Triangle (double s)
		{
			side = s;
		}
		
		
		//functionality
/**
 * This is  where the side gets  returned
 * @return
 */
		public double getSide()
		{
			return side;
		}
			
/**
 * This is where the perimeter gets  returned.
 * @return
 */
							
		public double getPerimeter() 
		{
			return 3*side;
		}

/**
 * This is where the area gets  returned
 * @return
 */
		public double getArea() 
		{
			int sqrt = 3;
			return Math.sqrt(sqrt) / 4 * side * side;
		}
/**
 * This is where the triangle shape gets printed.			
 * @return
 */
			
		public static String getShape() 
		{
		return "Triangle:";
		}


public void setSide(double side) {
	this.side = side;
}
	}
