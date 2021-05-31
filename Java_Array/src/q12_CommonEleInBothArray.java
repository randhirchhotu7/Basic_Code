//comon element in 2 Array//

import java.util.Scanner;

public class q12_CommonEleInBothArray 
{
	static int count = 0;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int arr1[]=getArray();
		printArr(arr1);
		
		int arr2[]=getArray();
		printArr(arr2);
		System.out.print("Common elements are : ");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.print(arr2[j]+" ");
				}
			}
		}
	}
	static int[] getArray() 
	{
		count++;
		System.out.print("Enter Size Of "+count+" Array : ");
		int num = sc.nextInt();
		System.out.print("Enter "+num+" elements of Array : ");
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	static void printArr(int[] arr1) 
	{
		System.out.print("\n"+"Required Array : ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
	}

}
