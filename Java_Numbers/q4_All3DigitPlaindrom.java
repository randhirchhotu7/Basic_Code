//		All 3 digit plaindrom


import java.util.*;
class All3DigitPlaindrom
{
	static void printPlaindrom()
	{
		System.out.println("\n"+"All 3 digit Plaindrom numbers are : ");
		for(int i=100;i<=999;i++)
		{
			int num=i;
			int temp=num;
			int rev=0,rem=0;
			do
			{
				rem=num%10;
				rev=rev*10 + rem;
				num/=10;
			}while(num!=0);
			if(rev==temp)
			{
				System.out.print(i+" ");
			}
		}
		System.out.print("\n");
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		//System.out.print("Enter a range to print all 3 digit Plaindrom number  : ");
		//num = sc.nextInt();
		printPlaindrom();
	} 
}