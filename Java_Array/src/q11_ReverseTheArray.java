//	Reverse elements of the array

import java.util.Scanner;

public class q11_ReverseTheArray 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int arr[]=getArray();
		System.out.print("Original Array : ");
		printArray(arr);
		int temp=0;
		int len=arr.length-1;
		for(int i=0;i<arr.length/2;i++,len--)
		{
			temp=arr[i];
			arr[i]=arr[len];
			arr[len]=temp;
		}
		
		System.out.print("\n"+"Modified Array : ");
		printArray(arr);
	}


	static int[] getArray() 
	{
		System.out.print("Enter size of array : ");
		int num=sc.nextInt();
		System.out.print("Enter "+num+" Elements Of Array : ");
		int arr[] = new int[num];
		for(int i=0;i<num;i++)
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


//  2nd logic//
/*
 *  public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Size of Array : ");
	    int num = sc.nextInt();
	    System.out.print("\n"+"Enter elements of Array : ");
	    int arr[] = new int[num];
	    for(int i=0;i<arr.length;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    System.out.print("\n"+"Original Array : ");
	    for(int i=0;i<arr.length;i++)
	    {
		    System.out.print(arr[i]+" ");
	    }
	    System.out.print("\n"+"Reversed Array : ");
	    for(int i=arr.length-1;i>=0;i--)
	    {
		    System.out.print(arr[i]+" ");
	    }
	}
	*/