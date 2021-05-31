//	Finding nth occurance of a given number 

import java.util.Scanner;
public class q05_NthOccurance 
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
		
		System.out.print("Enter a number to check its nth occurance : ");
		int val = sc.nextInt();
		System.out.print("Enter the occurance number : ");
		int occ = sc.nextInt();
		int pos=findOccurance(arr,val,occ);
		if(pos==0)
		{
			System.out.println("Number either present only once/Not present !!");
		}
		else
		{
			System.out.print(val+" present "+occ+" at position : "+pos);
		}
	}

	static int findOccurance(int[] arr, int val, int occ) 
	{
		int count=0,pos=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==val)
			{
				count++;
				if(count==occ)
				{
					pos=i+1;
					break;
				}
			}
		}
		return pos;
	}

	

}
