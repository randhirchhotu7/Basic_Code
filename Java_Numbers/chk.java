import java.util.*;
class chk
{
	static void decimalToBinary(int num)
	{
		String bin="";
		int rem=0;
		do
		{
			rem=num%2;
			//bin = bin+rem;
			bin=rem+bin;
			num = num/2;
		}while(num!=0);
		System.out.print("\n"+"Required Binary digit is : "+bin);	
		System.out.print("\n");	
	}
	static void decimalToOctal(int num)
	{
		String oct="";
		int rem=0;
		do
		{
			rem=num%8;
			//oct = oct+rem;
			oct=rem+oct;
			num = num/8;
		}while(num!=0);
		System.out.print("\n"+"Required octal digit is : "+oct);	
		System.out.print("\n");	
	}
	static void decimalToHexa(int num)
	{
		String hex="";
		int rem=0;
		do
		{
			rem=num%16;
			if(rem<10)
			{
				hex=rem+hex;
			}
			else
			{
				hex=(char)(rem+55)+hex;
			}
			num = num/16;
		}while(num!=0);
		System.out.print("\n"+"Required hexa digit is : "+hex);	
		System.out.print("\n");	
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a decimal number : ");
		num=sc.nextInt();
		decimalToBinary(num);
		decimalToOctal(num);
		decimalToHexa(num);
	}
}