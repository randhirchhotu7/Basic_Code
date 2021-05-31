//	Finding total number of palindrom elements in an array

import java.util.Scanner;
public class q08_PalindromInArray 
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
		int count=0;
		for(int i=0;i<num;i++)
		{
			int temp=arr[i];
			int rem=0,rev=0;
			do
			{
				rem=temp%10;
				rev= rev*10+rem;
				temp=temp/10;
			}while(temp>0);
			if(rev==arr[i])
			{
				count++;
			}
		}
		System.out.print("Total number of plaindrom in array are : "+count);
	}
}