//	

import java.util.Scanner;
class CheckPrimeMethod
{
	static void primeSum(int num1,int num2)
	{
		

		System.out.print("Prime numbers are :  ");
		int count=0;
		int sum=0;
		for(int i=num1;i<=num2;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.print("\n"+"Sum of prime till "+num2+" is : "+sum);
		System.out.print("\n");
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("Enter 1st number : ");
		num1 = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		num2 = sc.nextInt();
		primeSum(num1,num2);
	}
}