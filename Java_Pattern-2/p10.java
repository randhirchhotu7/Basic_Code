import java.util.*;
class P10
{
	public static void main(String randhir1[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Pattern : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
/*
Enter Size of Pattern : 5
*
***
*****
*******
*********



*/