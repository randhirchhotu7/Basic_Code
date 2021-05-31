//	sum of digit of a number

import java.util.Scanner;
class SumDigitMethod
{
	int sumMethod(int num)
	{
		int sum=0,rem=0;
		do
		{
			rem = num%10;
			sum+=rem;
			num/=10;
		}while(num!=0);
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		SumDigitMethod s = new SumDigitMethod();
		int sum = s.sumMethod(num);
		System.out.print("Required sum of the degits of the number is : "+sum+"\n");
	}
}