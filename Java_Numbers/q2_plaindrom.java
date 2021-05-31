import java.util.*;
class CheckPlaindrom
{
	void IsPlaindrom(int num)
	{
		int temp=num;
		System.out.print("\n"+"Entered number is : "+num);
		int rev=0,rem=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10 + rem;
			num/=10;
		}
		if(rev==temp)
		{
			System.out.print("\n"+"required number is Plaindrom :"+"\n");
		}
		else
		{
			System.out.print("\n"+"required number is Not Plaindrom :"+"\n");
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		CheckPlaindrom n =new CheckPlaindrom();
		n.IsPlaindrom(num);
	} 
}