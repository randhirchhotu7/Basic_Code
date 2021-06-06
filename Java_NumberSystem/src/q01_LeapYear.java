import java.util.*;

public class q01_LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year to chk : ");
		int yr=sc.nextInt();
		boolean chk = isLeapYear(yr);
		if(chk==true)
		{
			System.out.println("Entered year "+yr+" is : A Prime Year ");
		}
		else
		{
			System.out.println("Enteres year "+yr+" is : Not a LEAP YEAR");
		}
		
	}
	static boolean isLeapYear(int num)
	{
		if((num%4==0) || (num%100==0 && num%400==0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}