// Armstrong in range

import java.util.Scanner;
class FindArmstrong
{
	static int countDigit(int t1)
	{
		int count=0;
		do
		{
			count++;
			t1=t1/10;
		}while(t1!=0);
		return count;
	}
	static int Power(int rem,int num)
	{
		int pw=1;
		for(int i=1;i<=num;i++)
		{
			pw=pw*rem;
		}
		return pw;
	}
	static void IsArmstrong(int num1,int num2)
	{
			int t1,t2,num;
		System.out.print("Required Armstrong numbers are : ");
		for(int i=num1;i<=num2;i++)
		{
			num=i;
			t1=i;
			t2=i;
			int rem=0,sum=0;
			int Ndigit=countDigit(t1);
			do
			{
				rem=num%10;
				sum=sum+Power(rem,Ndigit);
				num=num/10;
			}while(num!=0);
			if(sum==t2)
			{
				System.out.print(i+" ");
			}
			/*else
			{
				System.out.print(i+" ");
			}*/
		}
		System.out.print("\n");		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("Enter 1ST number : ");
		num1 = sc.nextInt();
		System.out.print("Enter 2ND number : ");
		num2 = sc.nextInt();
		IsArmstrong(num1,num2);		
	}
}