  //Right Shifting for given number of times//

import java.util.Scanner;

public class q23_RightShift 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter size of Array : ");
		int num = sc.nextInt();
		int arr[]=getArray(num);
		System.out.print("\n"+"Original Array is : ");
		printArray(arr);
		System.out.print("\n"+"Enter number of times you want to shift : ");
		int sft = sc.nextInt();
		rightShift(arr,sft);
		System.out.print("\n"+sft+" times right Shifted Array is : ");
		printArray(arr);
	}
	
	static void rightShift(int[] arr, int sft) 
	{
		int j=0,flag=0;
		for(int i=0;i<sft;i++)
		{
			flag=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[j]=flag;
		}
	}
	
	static void printArray(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	static int[] getArray(int num)
	{
//		Scanner sc = new Scanner(System.in);
		System.out.print("\n"+"Enter "+num+" elements of Array : ");
		int arr[] = new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}

}
