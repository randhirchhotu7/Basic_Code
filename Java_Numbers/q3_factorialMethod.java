//	factorial of a nunmber

import java.util.Scanner;
class FactorialOfMethod
{
	int factorial(int num)
	{
		int fact=1;
		if(num==0)
		{
			return 1;
		}
		else
		{
			for(int i=1;i<=num;i++)
			{
				fact*=i;
			}
			return fact;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		FactorialOfMethod f = new FactorialOfMethod();
		int fact = f.factorial(num);
		System.out.print("Required value of "+num+"! Factorial is : "+fact+"\n");
	}
}