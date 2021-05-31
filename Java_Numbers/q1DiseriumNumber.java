//	Strong number in given range (ex-175)

import java.util.*;
class DiseriumNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a number : ");
		num=sc.nextInt();
		isDiserium(num);
	}

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
		//System.out.print("strong numbers are : ");	
		int digit=digitCount(num);
		int nnn=num;
		int	rem=0;
		int	sum=0;
		do
		{
			rem=nnn%10;
			sum=sum + power(rem,digit);
			nnn=nnn/10;
			digit--;
		}while(nnn!=0);
		if(sum==num)
		{
			System.out.print("Diserium Number !!");	
		}
		else if(sum!=num)
		{
			System.out.print("Not a Diserium Number !!");
		}
		System.out.print("\n");	
	}
	
}