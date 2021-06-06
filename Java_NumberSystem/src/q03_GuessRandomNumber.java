import java.util.*;
public class q03_GuessRandomNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int Unum=0,Rnum=0;
		int count=0;
		while(true)
		{
			count++;
			System.out.println("Enter a number to guess : ");
			Unum = sc.nextInt();
			Rnum = rd.nextInt(10);
			if(Unum==Rnum)
			{
				System.out.println("Wow ! You won !!");
				break;
			}
			else
			{
				System.out.println("Sorry ! Try again !!");
			}
		}
		System.out.println("You took "+count+" Round to win the game" );
	}

}
