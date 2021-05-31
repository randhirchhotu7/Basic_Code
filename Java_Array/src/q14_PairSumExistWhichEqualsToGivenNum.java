//printing pairs whose sum is equal to a given number//

import java.util.Scanner;
public class q14_PairSumExistWhichEqualsToGivenNum 
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
		System.out.print("Enter sum Amount : ");
		int Gsum=sc.nextInt();
		int flag=0,p1,p2;
		System.out.println("\n"+"pairs are : ");
		for(int i=0;i<num-1;i++)
		{
			flag=0;
			p1=0;
			p2=0;
			for(int j=i+1;j<num;j++)
			{
				if(arr[i]+arr[j]==Gsum)
				{
					flag=1;
					p1=arr[i];
					p2=arr[j];
				}
			}
			if(flag==1)
			{
				System.out.print("\t"+p1+","+p2+"\n");
			}

		}
	}
}
