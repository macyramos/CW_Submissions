
public class SumAsInts {
/**
 * Void  Method: We will be creating methods that
 * certain things
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stateName();
		stateHairStyle();
		stateFavoriteFood();
		printCircleStats(4.0);
		printMathStuffs(4,8);
	}

	public static void stateName()  {	
	System.out.println("My name is Macy Ramos");
	}
	public static void stateEyeColor() {
	System.out.println("My eye color is dark brown");	
	}
	public static void stateHairStyle() {
	System.out.println("My best friend is Azrie");
	}
	public static void stateFavoriteFood() {
	System.out.println("My favorite food is spaghetti");
	}
	
	public static void printCircleStats(double radius) {
	double pi=3.1415;
	double circumference= pi*2*radius;
	double diameter=2*radius;
	double area= pi*radius*radius;
	
	System.out.println("Radius:" + radius);
	System.out.println("Circumference:" +circumference);
	System.out.println("Diamater:" + diameter);
	System.out.println("Area:" +  area);
	}
	

	public static void printMathStuffs(int x,  int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
	}
		
	

	
	}
