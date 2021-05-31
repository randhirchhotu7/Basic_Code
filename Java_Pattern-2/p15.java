import java.util.*;
class P15
{
	public static void main(String randhir1[])
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Pattern : ");
		int num=sc.nextInt();
		ch='A';
		for(int i=1;i<=num;i++)
		{
			for(int j=i;j<=num;j++)
			{
				System.out.print(ch+" ");
			}
			ch++;
			System.out.print("\n");
		}
	}
}
/*

Enter Size of Pattern : 5
A A A A A 
B B B B 
C C C 
D D 
E 


*/