//	Strong number in given range 

import java.util.*;
class HappyNumber
{
	static void isHappy(int nnn)
	{
		System.out.print("All Happy numbers are : ");
		for(int i=1;i<=nnn;i++)
		{
			int flag=0;
			int num=i;
			int temp=num;
			while(num>9)
			{
				int sum=0;
				do
				{
					int r=num%10;
					sum=sum+(r*r);
					num=num/10;
				}while(num!=0);
				num=sum;
				if(sum==1)
				{
					flag++;
					break;
				}
			}
			if(flag==1)
			{
				System.out.print(i+" ");
			}
			//return num==1 || num==7;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a range within 1-1000 : ");
		num=sc.nextInt();
		isHappy(num);
		System.out.print("\n");	//4
	}
}