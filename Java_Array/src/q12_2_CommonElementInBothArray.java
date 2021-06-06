import java.util.HashSet;

public class q12_2_CommonElementInBothArray 
{
	public static void main(String[] args) 
	{	
		int arr1[] = {3,4,5,5,10};
		int arr2[] = {5,5,10,20};
		type2Solution(arr1,arr2);
		
	}

	static void type2Solution(int[] arr1, int[] arr2) 
	{
		HashSet<Integer> hlst = new HashSet<Integer>();
		System.out.println("Common elements are : ");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
//					System.out.print(arr1[i]+" ");
					hlst.add(arr1[i]);
					break;
				}
			}
		}
//		System.out.println();
		for(Integer val : hlst)
		{
			System.out.print(val+" ");
		}
	}

}
