//	finding prime number till a given range

import java.util.Scanner;
class CheckPrimeMethod
{
	void CountPrime(int num)
	{
		int count,flag=0;
		System.out.print("Prime number between 1 t0 "+num+" is : ");
		for(int i=1;i<=num;i++)
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
				flag++;
				System.out.print(i+" ");
			}
		}
		System.out.print("\n"+"Total number of prime number till "+num+" is : "+flag+"\n");
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		CheckPrimeMethod pm = new CheckPrimeMethod();
		pm.CountPrime(num);
	}
}