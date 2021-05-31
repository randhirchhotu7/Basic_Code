//merge 2 Array in zigzag//

import java.util.Scanner;
public class q18_MergeZigZag 
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of 1st Array : ");
		int num1 = sc.nextInt();
		System.out.print("\n"+"Enter Elements of 1st Array : ");
		int arr1[] = new int[num1];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the Size of 2nd Array : ");
		int num2 = sc.nextInt();
		System.out.print("\n"+"Enter Elements of 2nd Array : ");
		int arr2[] = new int[num2];
		
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int add[] = new int[num1+num2];
		int i=0,j=0;
		for(int k=0;k<add.length;)
		{
			if(i<arr1.length)
			{
				add[k]=arr1[i];
				i++;
				k++;
			}
			if(j<arr2.length)
			{
				add[k]=arr2[j];
				j++;
				k++;
			}
		}
		System.out.print("\n"+"Combined ZigZag Array is : ");
		for(int c=0;c<add.length;c++)
		{
			System.out.print(add[c]+" ");
		}
	}

}
