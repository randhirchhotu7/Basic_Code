//Insert a number at last index//

import java.util.*;
public class q19_InsertAtLast 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array : ");
		int num = sc.nextInt();
//		System.out.print("\n"+"Enter elements of Array : ");
		int arr[] = getArray(num);
		System.out.print("\n"+"Entered Array is : ");
		printArray(arr);
		System.out.print("\n"+"Enter a value to insert : ");
		int val = sc.nextInt();
		int a[] = new int[num+1];
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			flag++;
			a[i]=arr[i];
		}
		a[flag]=val;
		System.out.print("\n"+"modified Array is : ");
		printArray(a);
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
		Scanner sc = new Scanner(System.in);
		System.out.print("\n"+"Enter "+num+" elements of Array : ");
		int arr[] = new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}

}
