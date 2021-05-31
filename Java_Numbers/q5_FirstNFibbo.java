//	Fist N fibbo number

import java.util.*;
class FirstNFibboNumber
{
	static void printFibbo(int num)
	{
		int a=0,b=1,f=0;
		System.out.print("All Fibbo series till "+num+" is : ");
		for(int i=1;i<=num;i++)
		{
			System.out.print(a+" ");
			f=a+b;
			a=b;
			b=f;
		}
		System.out.print("\n");	
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a range to Fibbo series : ");
		num=sc.nextInt();
		printFibbo(num);
	}
}