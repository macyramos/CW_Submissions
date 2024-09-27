/**
 * This is the main class.
 * This is where all the information that I want printed, gets printed.
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
/**
 * This is the Circles method.
 * This includes the components that make up a Circle and it's  features.
 * They include pi, radius, diameter, circumference, and area.
 */
		
	//CIRCLES
		Circles circOne= new Circles(3.0);
		Circles circTwo= new Circles(20.0);
		Circles circThree= new  Circles(-4.0);
		String circshape = Circles.getShape();
		System.out.println(circshape);
		System.out.println(" ");
		
		System.out.println("Radius of Circle One is " + circOne.getRadius());
		System.out.println("Diameter of Circle One is " + circOne.getDiameter());
		System.out.println("Circumference of  Circle  One  is "  + circOne.getCircumference());
		System.out.println("Area of Circle One is " + circOne.getArea());
		System.out.println(" ");
		
		System.out.println("Radius of Circle Two is " + circTwo.getRadius());
		System.out.println("Diameter of Circle Two is  " + circTwo.getDiameter());
		System.out.println("Circumference of  Circle  Two  is "  + circTwo.getCircumference());
		System.out.println("Area of Circle Two is " + circTwo.getArea());
		System.out.println(" ");
		
		System.out.println("Radius of Circle Three is " + circThree.getRadius());
		System.out.println("Diameter of Circle Three is " + circThree.getDiameter());
		System.out.println("Circumference of  Circle  Three  is "  + circThree.getCircumference());
		System.out.println("Area of Circle Three is " + circThree.getArea());
		System.out.println(" ");
	
		System.out.println("------------------------------------ ");
		
	
		System.out.println(circOne.toString()); 
/**
 * This is the Squares method
 * This  includes the components that make up a Square and it's features.
 * They include the sides, the area, and the perimeter.	
 */
	//SQUARES
		Squares squOne = new Squares(4.0);
		Squares squTwo = new Squares(8.0);
		Squares squThree = new Squares(12.0);
		String squshape = Squares.getShape();
		System.out.println(squshape);
		System.out.println(" ");
		
		System.out.println("The side of Square One is " + squOne.getSide());
		System.out.println("The area of Square One is " + squOne.getArea());
		System.out.println("The perimeter of Square One is " +  squOne.getPerimeter());
		System.out.println(" ");
		
		System.out.println("The side of Square Two is " + squTwo.getSide());
		System.out.println("The area of Square Two is " + squTwo.getArea());
		System.out.println("The perimeter of Square Two is " + squTwo.getPerimeter());
		System.out.println(" ");
		
		System.out.println("The side of Square Three is " + squThree.getSide());
		System.out.println("The area of Square Three is " + squThree.getArea());
		System.out.println("The perimeter of Square Three is " + squThree.getPerimeter());
		System.out.println(" ");
		
		System.out.println("------------------------------------ ");
/**
 * This is a Rectangles  method.
 * This includes the  components  that make up a Square and its features.
 * They include the length,  width, area, and perimeter.	
 */
	//RECTANGLES
		Rectangle rectOne = new Rectangle  (4.0, 2.0);
		Rectangle rectTwo = new Rectangle  (8.0, 3.0);
		Rectangle rectThree = new Rectangle  (12.0, 4.0);
		String rectshape = Rectangle.getShape();
		System.out.println(rectshape);
		System.out.println(" ");
		
		System.out.println("The length of Rectangle One is " + rectOne.getLength());
		System.out.println("The width of Rectangle One is " + rectOne.getWidth());
		System.out.println("The area of Rectangle One is " + rectOne.getArea());
		System.out.println("The perimeter of Rectangle One is " + rectOne.getPerimeter());
		System.out.println(" ");
		
		System.out.println("The length of Rectangle Two is " + rectTwo.getLength());
		System.out.println("The width of Rectangle Two is " + rectTwo.getWidth());
		System.out.println("The area of Rectangle Two is " + rectTwo.getArea());
		System.out.println("The perimeter of Rectangle Two is " + rectTwo.getPerimeter());
		System.out.println(" ");
		
		System.out.println("The length of Rectangle Three is " + rectThree.getLength());
		System.out.println("The width of Rectangle Three is " + rectThree.getWidth());
		System.out.println("The area of Rectangle Three is " + rectThree.getArea());
		System.out.println("The perimeter of Rectangle Three is " + rectThree.getPerimeter());
		System.out.println(" ");
		
		System.out.println("------------------------------------ ");
	
		
/**
 * This is a Triangles  method.
 * This includes the components that make up an equilateral Triangle and its features.
 * They include	sides, area, and perimeter.
 */
	//TRIANGLES
		Triangle triOne = new Triangle(4.0);
		Triangle triTwo = new Triangle(8.0);
		Triangle triThree = new Triangle(12.0);
		String trishape = Triangle.getShape();
		System.out.println(trishape);
		System.out.println(" ");
		
		System.out.println("The side of Triangle One is " + triOne.getSide());
		System.out.println("The area of Triangle One is " + triOne.getArea());
		System.out.println("The perimeter of Triangle One is " +  triOne.getPerimeter());
		System.out.println(" ");
		
		System.out.println("The side of Triangle Two is " + triTwo.getSide());
		System.out.println("The area of Triangle Two is " + triTwo.getArea());
		System.out.println("The perimeter of Triangle Two is " + triTwo.getPerimeter());
		System.out.println(" ");
		
		System.out.println("The side of Triangle Three is " + triThree.getSide());
		System.out.println("The area of Triangle Three is " + triThree.getArea());
		System.out.println("The perimeter of Triangle Three is " + triThree.getPerimeter());
		System.out.println(" ");
		
		System.out.println("------------------------------------ ");
/**
 * This is a Spheres  method.
 * This includes the components that make up an Sphere and its features.
 * They include	radius, diameter, volume, and surface area.
 */	
	//SPHERES
		Sphere sphOne= new Sphere(4.0);
		Sphere sphTwo= new Sphere(6.0);
		Sphere sphThree= new  Sphere(8.0);
		String sphshape = Sphere.getShape();
		System.out.println(sphshape);
		System.out.println(" ");
				
		System.out.println("Radius of Sphere One is " + sphOne.getRadius());
		System.out.println("Diameter of Sphere One is " + sphOne.getDiameter());				
		System.out.println("Volume of  Sphere  One  is "  + sphOne.getVolume());
		System.out.println("Surface Area of Sphere One is " + sphOne.getSurfaceArea());
		System.out.println(" ");
				
		System.out.println("Radius of Sphere Two is " + sphTwo.getRadius());
		System.out.println("Diameter of Sphere Two is  " + sphTwo.getDiameter());
		System.out.println("Volume of  Sphere  Two  is "  + sphTwo.getVolume());			
		System.out.println("Surface Area of Sphere Two is " + sphTwo.getSurfaceArea());
		System.out.println(" ");
				
		System.out.println("Radius of Sphere Three is " + sphThree.getRadius());
		System.out.println("Diameter of Sphere Three is " + sphThree.getDiameter());
		System.out.println("Volume of  Sphere  Three  is "  + sphThree.getVolume());
		System.out.println("Surface Area of Sphere Three is " + sphThree.getSurfaceArea());
		System.out.println(" ");
		
		System.out.println("------------------------------------ ");
		
/**
 * This is a Cubes method.
 * This includes the components that make up an cube and its features.
 * They include	edge, volume, and surface area.
 */		
	//CUBES
		Cubes cubeOne= new Cubes(10.0);
		Cubes cubeTwo= new Cubes(12.0);
		Cubes cubeThree= new Cubes(14.0);
		String cubeshape = Cubes.getShape();
		System.out.println(cubeshape);
		System.out.println(" ");
				
		
		System.out.println("Edge of Cube One is " + cubeOne.getEdge());				
		System.out.println("Volume of Cube  One  is "  + cubeOne.getVolume());
		System.out.println("Surface Area of Cube One is " + cubeOne.getSurfaceArea());
		System.out.println(" ");
				
		System.out.println("Edge of Cube Two is " + cubeTwo.getEdge());
		System.out.println("Volume of Cube  Two  is "  + cubeTwo.getVolume());			
		System.out.println("Surface Area of Cube Two is " + cubeTwo.getSurfaceArea());
		System.out.println(" ");
				
		System.out.println("Edge of Cube Three is " + cubeThree.getEdge());
		System.out.println("Volume of  Cube  Three  is "  + cubeThree.getVolume());
		System.out.println("Surface Area of Cube Three is " + cubeThree.getSurfaceArea());
		System.out.println(" ");
		
		
		System.out.println(circOne);
	}
}
