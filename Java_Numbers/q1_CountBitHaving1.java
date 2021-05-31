import java.util.*;
class CountBitHaving1
{
	static void decimalToBinary(int num)
	{
		String bin="";
		int rem=0;
		int count=0;
		do
		{
			rem=num%2;
			if(rem==1)
			{
				count++;
			}
			//bin = bin+rem;
			bin=rem+bin;
			num = num/2;
		}while(num!=0);
		System.out.print("\n"+"Required Binary digit is : "+bin);	
		System.out.print("\n"+"Total bits with 1 is : "+count);	
		System.out.print("\n");	
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a decimal number : ");
		num=sc.nextInt();
		decimalToBinary(num);
	}
}