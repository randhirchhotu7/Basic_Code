//	Decimal to binary
//	same for Decimal to octal

import java.util.Scanner;

public class q2_DecToBin 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Decimal Number : ");
		int num=sc.nextInt();
		String bnum=DecToBinary(num);
		System.out.println("Required Binary of "+num+" is : "+bnum);
		
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
