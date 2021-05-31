//	Sum of Even && Odd Position And Sum of Even and Odd elements of Array !!

import java.util.Scanner;
public class q16_EvenOddPosition 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Entere size of array : ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.print("Enter "+num+" Elements of array : ");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		EvenOddPositionSum(arr);	
		System.out.println("\n"+"--------------------------------------");
		EvenOddDigitSum(arr);
	}

	static void EvenOddDigitSum(int[] arr) 
	{
		int EPsum=0,OPsum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				EPsum+=arr[i];
			}
			else
			{
				OPsum+=arr[i];
			}
		}
		System.out.print("\n"+"Required Even Digit sum : "+EPsum);
		System.out.print("\n"+"Required Odd Digit sum : "+OPsum);
		
	}

	static void EvenOddPositionSum(int[] arr) 
	{
		int EPsum=0,OPsum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				EPsum+=arr[i];
			}
			else
			{
				OPsum+=arr[i];
			}
		}
		System.out.print("\n"+"Required Even position sum : "+EPsum);
		System.out.print("\n"+"Required Odd position sum : "+OPsum);
	}
}