import java.util.*;
class P7
{
	public static void main(String randhir1[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Pattern : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=i;j<=num;j++)
			{
				System.out.print(i+" ");
			}
			System.out.print("\n");
		}
	}
}
/*

1 1 1 1 1 
2 2 2 2 
3 3 3 
4 4 
5 


*/