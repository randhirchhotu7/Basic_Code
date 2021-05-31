//	1st min and 2nd min in the Array

import java.util.Scanner;
public class q15_1stAnd2ndSmallest 
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
		int FSmall=arr[0],SSmall=arr[1];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<FSmall)
			{
				SSmall = FSmall;
				FSmall = arr[i];
			}
			else if(arr[i]<SSmall )
			{
				SSmall = arr[i];
			}
		}
		System.out.println("First Smallest number : "+FSmall);
		System.out.println("Second Smallest number : "+SSmall);
	}

}