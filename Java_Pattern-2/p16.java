import java.util.*;
class P16
{
	public static void main(String randhir1[])
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Pattern : ");
		int num=sc.nextInt();
		ch='e';
		for(int i=1;i<=num;i++)
		{
			for(int j=num-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(ch);
			}
			ch--;
			System.out.print("\n");
		}
	}
}
/*
Enter Size of Pattern : 5
    e
   dd
  ccc
 bbbb
aaaaa



*/