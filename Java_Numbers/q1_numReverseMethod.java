import java.util.*;
class ReverseNumMethod
{
	void reverseNum(int num)
	{
		System.out.print("\n"+"Entered number is : "+num);
		int rev=0,rem=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10 + rem;
			num/=10;
		}
		System.out.print("\n"+"Reverse number is : "+rev+"\n");
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		ReverseNumMethod n =new ReverseNumMethod();
		n.reverseNum(num);
	} 
}