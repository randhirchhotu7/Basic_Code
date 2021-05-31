import java.util.*;
class Swap2NumberWithout3rdNumber
{
	/*static void SwapNumber(int x, int y)
	{
		x=x+y;
		y=x-y;
		x=x-y;
	}*/

	public static void main(String randhir[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : " );
		int x=sc.nextInt();
		System.out.print("Enter 2nd number : " );
		int y=sc.nextInt();
		System.out.print("Value of X Before Swap is : "+x+"\n" );
		System.out.print("Value of Y Before Swap is  : "+y+"\n" );
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.print("------------------------------------"+"\n" );
		System.out.print("Value of X After Swap is : "+x+"\n" );
		System.out.print("Value of Y After Swap is : "+y+"\n" );

		System.out.print("\n");

	}
}