import java.util.*;
public class q05_Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int factnum=findFactorial(num);
		System.out.println("Required factorial of "+num+" is : "+factnum);
	}

	static int findFactorial(int num) 
	{
		int fact=1;
		if(num==0)
		{
			return 1;
		}
		else
		{
			for(int i=1;i<=num;i++)
			{
				fact*=i;
			}
			return fact;
		}
	}
}
