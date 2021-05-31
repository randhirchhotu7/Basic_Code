import java.util.*;
class P12
{
	public static void main(String randhir1[])
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Pattern : ");
		int num=sc.nextInt();
		ch='E';
		for(int i=1;i<=num;i++)
		{
			for(int j=i;j<=num;j++)
			{
				System.out.print(ch+" ");
			}
			System.out.print("\n");
			ch--;
		}
	}
}
/*
E E E E E 
D D D D 
C C C 
B B 
A 



*/