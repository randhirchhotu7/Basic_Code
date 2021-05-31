import java.util.*;
class GCD
{
	static void findGCD(int num1, int num2)
	{
		int rem=0,dd=0;
		do
		{
			rem=num2%num1;
			dd=num2/num1;
			num1=rem;
			num2=dd;
		}while(rem!=0);
		System.out.print("\n"+"Required GCD is  : "+num1 );

	}

	public static void main(String randhir[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : " );
		int x=sc.nextInt();
		System.out.print("Enter 2nd number : " );
		int y=sc.nextInt();
		if(y>x)
		{
			x=x+y;
			y=x-y;
			x=x-y;
		}
		findGCD(x,y);
		System.out.print("\n");

	}
}