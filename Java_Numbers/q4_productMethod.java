//	product of digit of a number

import java.util.Scanner;
class ProductDigitMethod
{
	int productMethod(int num)
	{
		int product=1,rem=1;
		do
		{
			rem = num%10;
			product*=rem;
			num/=10;
		}while(num!=0);
		return product;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		ProductDigitMethod s = new ProductDigitMethod();
		int product = s.productMethod(num);
		System.out.print("Required Product of the degits of the number is : "+product+"\n");
	}
}