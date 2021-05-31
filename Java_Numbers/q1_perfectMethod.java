//	Checking for perfect number

import java.util.Scanner;
class perfectNumberMethod
{
	boolean IsPerfectNumber(int num)
	{
		int temp=num;
		int pnSum=0,rem=0;
		System.out.print("Factors of "+num+" are : ");
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				pnSum+=i;
		System.out.print(i+" ");
			}
		}
		if(pnSum==num)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		boolean bln;
		perfectNumberMethod p = new perfectNumberMethod();
		bln=p.IsPerfectNumber(num);
		if(bln==true)
		{
			System.out.println("\n"+"Required number "+num+" is a perfect Number : ");
		}
		else if(bln==false)
		{
			System.out.println("\n"+"Required number "+num+" is not a perfect Number : ");
		}
		
	}
}