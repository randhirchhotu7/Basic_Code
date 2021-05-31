import java.util.*;
class P13
{
	public static void main(String randhir1[])
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Pattern : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			ch='E';
			for(int j=i;j<=num;j++)
			{
				System.out.print(ch--+" ");
			}
			System.out.print("\n");
		}
	}
}
/*

E D C B A 
E D C B 
E D C 
E D 
E 


*/