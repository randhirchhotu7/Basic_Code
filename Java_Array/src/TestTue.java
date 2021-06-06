import java.util.HashSet;

public class TestTue 
{
	public static void main(String[] args) 
	{
		int arr[] = {10,7,9,10,7,5,10,10};
//		int arr[] = {10,7,9,10,7,5,10,10,10,10};
		
		System.out.println("Original : ");
		printArray(arr);
		sort(arr);
		System.out.println("\n"+"shorted : ");
		printArray(arr);
		commElement(arr);
		printArray(arr);
	}

	static void commElement(int[] arr) 
	{
		HashSet<Integer> lst = new HashSet<Integer>();
		System.out.println("\n"+"Common elements are : ");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					lst.add(arr[i]);
				}
			}
		}
		for(Integer val : lst)
		{
			System.out.print(val+" ");
		}
		
	}

	static void printArray(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	static void sort(int[] arr) 
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
