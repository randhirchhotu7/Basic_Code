//	Finding missing numbers b/w each two elements

import java.util.Scanner;
public class q06_FindingMissingNumInSortedArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Entere size of array : ");
		int num = sc.nextInt();
		int Fbig=0,Sbig=0,Tbig=0;
		int arr[] = new int[num];
		System.out.print("Enter "+num+" Elements of array : ");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		sort(arr);
		
		for(int i=0;i<num-1;i++)
		{
			for(int j=arr[i]+1;j<arr[i+1];j++)
			{
				System.out.print(j+" ");
			}
		}
	}
	static void sort(int[] arr) 
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
	}
}