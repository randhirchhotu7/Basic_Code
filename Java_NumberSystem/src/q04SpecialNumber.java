// digit sum + digit product = original number//
import java.util.*;
public class q04SpecialNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int temp=num;
		int rem=0,sum=0,mul=1;
		do
		{
			rem=num%10;
			sum+=rem;
			mul*=rem;
			num/=10;
		}while(num!=0);
		int spnum=sum+mul;
		if(temp==spnum)
		{
			System.out.println(temp+" is a Special number !!");
		}
		else
		{
			System.out.println(temp+" is not a Special number !!");
		}
	}

}
