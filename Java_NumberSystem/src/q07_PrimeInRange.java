import java.util.*;
public class q07_PrimeInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start range : ");
		int start=sc.nextInt();
		System.out.println("Enter end range : ");
		int end=sc.nextInt();
		findPrime(start,end);
	}

	static void findPrime(int srt, int end) 
	{
		System.out.println("Prime numbers are : ");
		int count=0,sum=0;
		for(int i=srt;i<=end;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
		}
	}

}
