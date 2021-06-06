//  sum of first 100 prime number //

import java.util.*;
public class q08_PrimeSum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of prime to add : ");
		int num=sc.nextInt();
		int pSum = findPrimeSum(num);
		System.out.println();
		System.out.println("sum of first "+num+" Prime number is : "+pSum);
	}

	static int findPrimeSum(int num) 
	{
		int count=0,flag=0,sum=0;
		System.out.println("First "+num+" prime numbers are : ");
		for(int i=1; ;i++)
		{
			flag=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					flag++;
				}
			}
			if(flag==2)
			{
				count++;
				System.out.print(i+" ");
				sum+=i;
				if(count==num)
				{
					break;
				}
			}
		}
		return sum;
	}

}
