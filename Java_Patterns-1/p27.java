import java.util.*;
class P27
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
			/*for(int k=1;k<2*i;k++)
			{
				System.out.print(k);
			}*/
			for(int k=1;k<2*i;k++)
			{
				//if()
				System.out.print(k);
			}
			System.out.print("\n");
		}
	}
}
/*
        1
       123
      12345
     1234567
    123456789
   1234567891011




*/