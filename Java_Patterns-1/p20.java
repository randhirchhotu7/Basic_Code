import java.util.*;
class P20
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
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=num;k++)
			{
				System.out.print(ch);
			}
			ch++;
			System.out.print("\n");
		}
	}
}
/*

 AAAAA
  BBBB
   CCC
    DD
     E





*/