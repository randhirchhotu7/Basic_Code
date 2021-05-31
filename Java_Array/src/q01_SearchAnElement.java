//		Searching a given number in the given array !!

import java.util.Scanner;
public class q01_SearchAnElement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.print("Enter "+num+" elements of array : ");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("\n"+"Enter a element to search : ");
		int elmt = sc.nextInt();
		int flag=0,pos=0;
		for(int i=0;i<num;i++)
		{
			if(arr[i]==elmt)
			{
				flag=1;
				pos=i;
				break;
			}
		}
		if(flag==0)
		{
			System.out.print("\n"+"Number "+elmt+" is not available in the given array !");
		}
		else
		{
			System.out.print("\n"+"Number "+elmt+" is available in the given array at position "+ (pos+1) +" !");
		}	
	}
}