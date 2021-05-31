import java.util.*;
class P18
{
	public static void main(String randhir1[])
	{
		//char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Pattern : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
				int flag=1;
			for(int j=1;j<=num-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<(2*i);k++)
			{
				if(k%2==0)
				{
					System.out.print("*");
				}
				else
				{
					//System.out.print(i);
					System.out.print(flag);
					flag++;
				}
			}
			System.out.print("\n");
		}
	}
}
/*
     Enter Size of Pattern : 5
         1
        1*2
       1*2*3
      1*2*3*4
     1*2*3*4*5



*/