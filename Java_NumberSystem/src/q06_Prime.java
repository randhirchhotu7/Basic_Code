import java.util.*;
public class q06_Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		boolean chkpm=isPrime(num);
		if(chkpm==true)
		{
			System.out.println("Entered number "+num+" is Prime !!");
		}
		else
		{
			System.out.println("Entered number "+num+" is not a Prime !!");
		}
	}

	static boolean isPrime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		else 
		{
			return false;			
		}
		
	}

}
