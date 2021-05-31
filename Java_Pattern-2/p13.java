import java.util.*;
class P13
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
				if(i%2==0)
				{
					if(k%2==0)
					{
						System.out.print("1");
					}
					else
					{
						System.out.print("0");
					}
				}
				else
				{	
					if(k%2==0)
					{
						System.out.print("0");
					}
					else
					{
						System.out.print("1");
					}	

				}
			}
			System.out.print("\n");
		}
	}
}
/*
Enter Size of Pattern : 5
    1
   01
  101
 0101
10101



*/