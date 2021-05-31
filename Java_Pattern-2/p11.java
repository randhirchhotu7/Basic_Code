import java.util.*;
class P11
{
	public static void main(String randhir1[])
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Pattern : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			ch='a';
			for(int j=i;j<=num;j++)
			{
				System.out.print(ch+++" ");
			}
			System.out.print("\n");
		}
	}
}
/*
Enter Size of Pattern : 5
a b c d e 
a b c d 
a b c 
a b 
a 



*/