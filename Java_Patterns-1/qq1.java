import java.util.*;
class QQ1
{
	public static void main(String randhir1[])
	{
		//char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Pattern : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				if(i==j)
				{
					System.out.print(j+" ");
				}
				else if((i+j)==(num+1))
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
/*
     Enter Size of Pattern : 5
     ----*
     ---***
     --*****
     -*******
     *********



*/