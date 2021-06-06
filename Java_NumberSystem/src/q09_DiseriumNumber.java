import java.util.*;
public class q09_DiseriumNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to chk : ");
		int num = sc.nextInt();
		boolean chk = chkDiserium(num);
		if(chk==true)
		{
			System.out.println("Entered number "+num+" is a Diserium Number");
		}
		else
		{
			System.out.println("Entered number "+num+" is Not a Diserium Number");
		}
	}

	static boolean chkDiserium(int num) 
	{
		int temp = num;
		int rem=0,sum=0;
		int digit=digitCounter(temp);
		do
		{
			rem=num%10;
			sum = sum + pow(rem,digit);
			num=num/10;
			digit--;
		}while(num!=0);
		if(temp==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	static int pow(int rem, int digit) 
	{
		int value=1;
		for(int i=1;i<=digit;i++)
		{
			value=value*rem;
		}
		return value;
	}

	static int digitCounter(int num) 
	{
		int rem=0,count=0;
		do
		{
			count++;
			rem=num%10;
			num=num/10;
		}while(num!=0);
		return count;
	}
}
