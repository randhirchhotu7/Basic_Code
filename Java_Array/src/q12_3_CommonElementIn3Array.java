
public class q12_3_CommonElementIn3Array 
{
	public static void main(String[] args) 
	{	
		int arr1[] = {1,5,10,10};
		int arr2[] = {5,3,5,10,4};
		int arr3[] = {5,5,10,20};
		sort(arr1);
		sort(arr2);
		sort(arr3);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		type3Solution(arr1,arr2,arr3);

	}

	static void sort(int[] arr1) 
	{
		for(int i=0;i<arr1.length-1;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[j]<arr1[i])
				{
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
	}
	static void type3Solution(int[] arr1, int[] arr2, int[] arr3) 
	{
		System.out.println("required Output : ");
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length && k<arr3.length)
		{
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k])
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
				k++;
			}
			else if(arr1[i]<arr2[j])
			{
				i++;
			}
			else if(arr2[j]<arr3[k])
			{
				j++;
			}
			else
			{
				k++;
			}
		}
	}

}
