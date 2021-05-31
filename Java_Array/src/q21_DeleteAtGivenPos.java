//Delete a number from given position//

import java.util.Scanner;

public class q21_DeleteAtGivenPos 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array : ");
		int num=sc.nextInt();
		
		int arr[]=getArray(num);
		System.out.print("\n"+"Original Array : ");
		printArray(arr);
		boolean flag = deleteElement(arr);
		if(flag==true)
		{
			System.out.print("\n"+"Modified Array : ");
//			printArray(arr);
			for(int i=0;i<arr.length-1;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
		else
		{
			System.out.print("\n"+"Entered position out of range !plz chk the range");			
		}
		
	}
	static boolean deleteElement(int[] arr) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n"+"Enter Position to Delete from Range( 1 - "+arr.length+" ) : " );
		int pos = sc.nextInt();
		if(pos>0 && pos<=arr.length)
		{
			for(int i=pos-1;i<arr.length-1;i++)
			{
				arr[i]=arr[i+1];
			}
			return true;
		}
		else
		{
			return false;
		}
	}
	static int[] getArray(int num)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n"+"Enter "+num+" elements of Array : ");
		int arr[] = new int[num];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		return arr;
	}
	static void printArray(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
