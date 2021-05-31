import java.util.*;
class P9
{
	public static void main(String randhir1[])
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Pattern : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			ch='A';
			for(int j=1;j<=num;j++)
			{
				System.out.print(ch+++" ");
			}
			System.out.print("\n");
		}
	}
}
/*

A B C D E 
A B C D E 
A B C D E 
A B C D E 
A B C D E

*/