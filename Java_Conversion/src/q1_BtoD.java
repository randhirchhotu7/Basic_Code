//	Binary to Decimal //
// same logic for octal to decimal //

import java.util.Scanner;

public class q1_BtoD 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Binary Number : ");
		int num=sc.nextInt();
		int val=BinaryToDec(num);
		System.out.println("Required Decimal of "+num+" is : "+val);
		
	}

	static int BinaryToDec(int num) 
	{
		int dec=0,rem=0;
		int count=0;
		while(num>0)
		{
			rem=num%10;
			dec=dec+(rem*pow(2,count++));
			num/=10;
		}
		return dec;
	}

	static int pow(int num, int pw) 
	{
		int val=1;
		for(int i=0;i<pw;i++)
		{
			val=val*num;
		}
		return val;
	}

}
