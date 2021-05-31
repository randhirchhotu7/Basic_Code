import java.util.*;
class FibboWithin100
{
	static void printFibbo(int num)
	{
		int a=0,b=1,fib=0;
		System.out.print("All fibbo number till "+num+" is : " );
		for(int i=0;a<=num;i++)
		{
			System.out.print(a+" ");
			fib=a+b;
			a=b;
			b=fib;
		}
	}

	public static void main(String randhir[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a range : " );
		int num=sc.nextInt();
		printFibbo(num);
		System.out.print("\n");

	}
}