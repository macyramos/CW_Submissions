@author Macy Ramos
public class logicQuizCorrection {

	public static void main(String[] args) {
		
	}
		// TODO Auto-generated method stub

	public static boolean findIfIsLeapYear (int year) {
	
		if(year%100==0 && year%400==0)
		{
			return true;
		}
		else if(year % 4==0)
		{
			return true;
		}
		else
		{
			return false;
		}
			
		
		
	

		
		
	}

}
