//	Printing Distinct element from 2 Array //

import java.util.Scanner;
public class q10_DistinctElementsInTwoArray 
{
	static int count = 0;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int arr1[]=getArray();
//		printArr(arr1);
		
		int arr2[]=getArray();
//		printArr(arr2);
		for(int i=0;i<arr1.length;i++)
		{
			int flag=0;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					arr2[j]=-1;
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.print(arr1[i]+" ");
			}	
		}
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]>=0)
			{
				System.out.print(arr2[i]+" ");
			}
		}

	}


	static int[] getArray() 
	{
		count++;
		System.out.print("Enter Size Of "+count+" Array : ");
		int num = sc.nextInt();
		System.out.print("Enter "+num+" elements of Array : ");
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	static void printArr(int[] arr1) 
	{
		System.out.print("\n"+"Required Array : ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
	}
	
	// 2nd Logic //
	/*   
	 public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of 1st Array : ");
		int num1=sc.nextInt();
		System.out.print("\n"+"Enter 1st Array elements : ");
		int arr1[] = new int[num1];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.print("Enter size of 2nd Array : ");
		int num2=sc.nextInt();
		System.out.print("\n"+"Enter 2nd Array elements : ");
		int arr2[] = new int[num2];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}

		int com[] = new int[num1+num2];
		System.out.print("\n"+"1st Array : ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.print("\n"+"2nd Array : ");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		int cc=0,flag=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			flag=0;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]!=arr2[j])
				{
					flag++;
				}
			}
			if(flag==arr2.length)
			{
				com[cc]=arr1[i];
				cc++;
			}
		}
		for(int i=0;i<arr2.length;i++)
		{
			flag=0;
			for(int j=0;j<arr1.length;j++)
			{
				if(arr1[i]!=arr2[j])
				{
					flag++;
				}
			}
			if(flag==arr2.length)
			{
				com[cc]=arr2[i];
				cc++;
			}
		}
		System.out.print("\n"+"Distinct Elements Are : ");
		for(int i=0;i<cc;i++)
		{
			System.out.print(com[i]+" ");
		}

	}*/
}
