import java.util.*;
class P17
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
			for(int j=num-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(ch++);
			}
			System.out.print("\n");
		}
	}
}
/*
        A
       AB
      ABC
     ABCD
    ABCDE
   ABCDEF


*/