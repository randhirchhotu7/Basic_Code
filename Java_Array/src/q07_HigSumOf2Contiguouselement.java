//	program to FIND HIGHEST CONTIGUOUS SUM OF TWO ELEMENT in a given array


import java.util.Scanner;
public class q07_HigSumOf2Contiguouselement 
{
	public static void main(String[] args) 
	{
		int pos=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Entere size of array : ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.print("Enter "+num+" Elements of array : ");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=arr[0]+arr[1];
		for(int i=1;i<num-1;i++)
		{
			if(sum<arr[i]+arr[i+1])
			{
				sum=arr[i]+arr[i+1];
				pos=i;
			}
		}
		System.out.println("Biggest sum is : "+sum);
		System.out.print("\n"+"Pairs are : "+arr[pos]+","+arr[pos+1]);
	}

}
