import java.util.*;
public class q02_LeapYearInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start range : ");
		int start=sc.nextInt();
		System.out.println("Enter End range : ");
		int end=sc.nextInt();
		System.out.println("List of Leap Year from "+start+" to "+end+" are : ");
		findLeapYear(start,end);
	}
	
	static void findLeapYear(int n1,int n2)
	{
		int count=0;
		
		for(int i=n1;i<=n2;i++)
		{
			if((i%4==0) || (i%100==0 && i%400==0))
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Total number of leap year "+count);
		if(count==0)
		{
			System.out.println("No Leap year found in the range !!");
		}
			
	}
}
