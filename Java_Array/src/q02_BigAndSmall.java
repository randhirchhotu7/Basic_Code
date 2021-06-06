//	Biggest And Smallest

import java.util.Scanner;
public class q02_BigAndSmall 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.print("\n"+"Enter "+num+" elements of array : ");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.print("\n"+"Biggest element is : "+max);
		System.out.print("\n"+"Smallest element is : "+min);
	}

}
