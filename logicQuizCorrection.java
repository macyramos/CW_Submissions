@author Macy Ramos


	
public class logicQuizCorrection {

	public static void main(String[] args) {
		System.out.println(findIfIsLeapYear(100));
		System.out.println(findIfIsLeapYear(1001));
		System.out.println(findIfIsLeapYear(400));
		System.out.println(findIfIsLeapYear(412));
		
	}

	public static boolean findIfIsLeapYear (int year) {
	
		if(year%400==0 || year%4==0 && year % 100!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
			
		
		
	

		
		
	}

}
