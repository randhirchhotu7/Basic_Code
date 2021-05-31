import java.util.*;
class CountFibboTill100
{
	static void printFibbo(int num)
	{
		int count=0;
		int a=0,b=1,fib=0;
		System.out.print("All fibbo number till "+num+" is : " );
		for(int i=0;a<=num;i++)
		{
			count++;
			System.out.print(a+" ");
			fib=a+b;
			a=b;
			b=fib;
		}
		System.out.print("\n"+"Total fibbo number till "+num+" is : "+count );
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