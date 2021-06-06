import java.util.*;
public class q3_Very_cool_number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int num=sc.nextInt();
			String bnum=DecToBinary(num);
			int count = very_cool(bnum);
			System.out.println(count);
		}

	}
	static int very_cool(String bnum) 
	{
		char arr[]=bnum.toCharArray();
		int sum=0;
		for(int i=0;i<(arr.length-2);i++)
		{
			if(arr[i]=='1' && arr[i+1]=='0' &&arr[i+2]=='1')
			{
				sum++;
			}
		}
		return sum;
	}
	static String DecToBinary(int num) 
	{

		String bnum ="";
		int rem=0;
		do
		{
			rem=num%2;
			bnum=rem+bnum;
			num/=2;
		}while(num>0);
		return bnum;
	}
}
