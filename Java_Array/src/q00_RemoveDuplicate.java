// Remove Duplicate element //

import java.util.Scanner;
public class q00_RemoveDuplicate 
{
	public static void 	main (String[] args) 
	{  
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int num;
		num = sc.nextInt();
		System.out.print("Enter "+num+" elements of an array : ");
		int arr[]=new int[num];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		removeDuplicateElements(arr);  
	}
	static void removeDuplicateElements(int arr[])
	{  
		int[] temp = new int[arr.length];  
		int k = 0; 
		for (int i=0;i<arr.length-2;i++)
		{  
			for(int j=i+1;j<arr.length-1;j++)
			{
				if (arr[i]==arr[j] && arr[i]!=-1)
				{  
					arr[j]=-1;
				}
			}
			if(arr[i]!=-1)
			{
				temp[k] = arr[i];
				k++;
			}
		}  
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n"+"Output Array : ");
		for(int i=0;i<k;i++)
		{
			System.out.print(temp[i]+" ");
		}
	}
}