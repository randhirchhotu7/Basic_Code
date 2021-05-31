//	Total Diserium number in given range (ex-175)

import java.util.*;
class TotalDiseriumNumber
{
	static int power(int rem,int digit)
	{
		int value=1;
		while(digit>0)
		{
			value=value*rem;	
			digit--;
		}
		return value;
	}
	static int digitCount(int num)
	{
		int count=0;
		do
		{
			count++;
			num=num/10;
		}while(num!=0);
		return count;
	}
	static void isDiserium(int num)
	{
		int flag=0;
		//System.out.print(" numbers are : ");	
		System.out.print("\n"+"All Diserium Numbers are : ");
		for(int i=1;i<=num;i++)
		{
			int nnn=i;
			int temp=nnn;
			int digit=digitCount(nnn);
			int	rem=0;
			int	sum=0;
			do
			{
				rem=nnn%10;
				sum=sum + power(rem,digit);
				nnn=nnn/10;
				digit--;
			}while(nnn!=0);
			if(sum==temp)
			{
				flag++;
				System.out.print(i+" ");	
			}
			/*else if(sum!=num)
			{
			}*/
		}
		System.out.print("\n"+"Total Diserium Number till "+num+" are : "+flag);
			System.out.print("\n");	
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a range to Find all Diserium NUmber : ");
		num=sc.nextInt();
		isDiserium(num);
	}
}