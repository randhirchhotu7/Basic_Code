import java.util.*;
class BinaryToDecimal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		long n;
		System.out.print("Enter a binary number : ");
		n=sc.nextLong();
		long dec=0;
		int count=0;
		while(n>0)
		{
			long r=n%10;
			dec=dec+r*pow(2,count);
			count++;
			n=n/10;
		}
		System.out.print("Decimal number : "+dec);

	}
		static int pow(int n,int p)
		{
			int pw=1;
			while(p>0)
			{
				pw=pw*n;
				p--;
			}
			return pw;
		}
}