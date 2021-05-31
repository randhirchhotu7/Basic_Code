//	Strong number in given range 

import java.util.*;
class StrongNoRange
{
	static int  fact(int rem)
	{

		int fact=1;
		for(int i=1;i<=rem;i++)
		{
			fact=fact*i;
		}
		//System.out.print("Factorial value = "+fact+" ");	
		return fact;
	}
	static void strongNumber(int num)
	{
		int temp=num;
		int rem;
		int sum;
		int f;
		System.out.print("strong numbers are : ");	
		for(int i=1;i<=temp;i++)
		{
			//System.out.println("i value = "+i+" ");	
			int nnn=i;
			rem=0;
			sum=0;
			do
			{
				rem=nnn%10;
				sum=sum + fact(rem);
				nnn=nnn/10;
			//System.out.println("sum value = "+sum+" ");	
			}while(nnn!=0);
			if(sum==i)
			{
				System.out.print(i+" ");	
			}
			/*else
			{
				//System.out.print(num+" ");	
			}*/
		}
		System.out.print("\n");	

	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a Range of number : ");
		num=sc.nextInt();
		strongNumber(num);
	}
}