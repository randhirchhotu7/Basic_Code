import java.util.*;
class SS1
{
	public static void main(String randhir[])
	{
		//char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Pattern : ");
		int num=sc.nextInt();
		int temp=num;
		for(int i=1;i<=num;i++)
		{
			if(i<=(temp/2))
			{	
				for(int j=num;j>=1;j--)
				{
					if(i==j || (i+j)==(num+1))
					{			
						System.out.print(j+" ");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			else
			{
				for(int j=1;j<=num;j++)
				{
					if(i==j || (i+j)==(num+1))
					{			
						System.out.print(j+" ");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.print("\n");
		}
	}
}

/*
Enter Size of Pattern : 5
5    1 
 4  2  
  3   
 2  4  
1    5 


*/