//	Code to exchange first part of arry with second part of the same array

import java.util.Scanner;
public class q09_ExchangeFirstPartWithSecond 
{
	public static void main(String[] args) 
	{
		int mid;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.print("Enter "+num+" elements of Array : ");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		if(num%2==0)
		{
			mid=num/2;
		}
		else
		{
			mid=(num/2)+1;
		}
		
		for(int i=0;i<num/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[mid+i];
			arr[mid+i]=temp;
		}
		for(int i=0;i<num;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
