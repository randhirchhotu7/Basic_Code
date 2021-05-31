import java.util.*;
class P25
{
	public static void main(String randhir1[])
	{
		//char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Pattern : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<2*i;k++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
/*
         *
        ***
       *****
      *******
     *********
    ***********



*/