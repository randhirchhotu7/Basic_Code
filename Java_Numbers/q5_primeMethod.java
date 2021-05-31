//	Checking for Prime number

import java.util.Scanner;
class CheckPrimeMethod
{
	
	static boolean isPrime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
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
		//CheckPrimeMethod pm = new CheckPrimeMethod();
		//boolean prime = pm.isPrime(num);
		//CheckPrimeMethod pm = new CheckPrimeMethod();
		boolean prime = isPrime(num);
		if(prime==true)
		{
			System.out.println("\n"+"Required number "+num+" is a prime Number : ");
		}
		else if(prime==false)
		{
			System.out.println("\n"+"Required number "+num+" is not a Prime Number : ");
		}
	}
}