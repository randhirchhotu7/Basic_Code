import java.util.*;
class P23
{
	public static void main(String randhir1[])
	{
		//char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Pattern : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=num-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.print("\n");
		}
	}
}
/*
       1 
      1 2 
     1 2 3 
    1 2 3 4 
   1 2 3 4 5 
  1 2 3 4 5 6 




*/