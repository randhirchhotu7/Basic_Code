import java.util.HashSet;

public class q12_4_CommonElementIn3ArrayList 
{
	public static void main(String[] args) 
	{	
		int arr1[] = {1,5,5,10,10};
		int arr2[] = {3,4,5,10};
		int arr3[] = {5,5,10,20};
		type3Solution(arr1,arr2,arr3);

	}

	static void type3Solution(int[] arr1, int[] arr2,int[] arr3) 
	{
		int com[] = new  int[arr1.length+arr2.length];
		HashSet<Integer> hlst = new HashSet<Integer>();
		int cc=0;
		System.out.println("Common elements are : ");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					com[cc]=arr1[i];
					cc++;
					break;
				}
			}
		}
		for(int i=0;i<cc;i++)
		{
			for(int j=0;j<arr3.length;j++)
			{
				if(com[i]==arr3[j])
				{
//					System.out.print(com[i]+" ");
					hlst.add(com[i]);
					break;
				}
			}
		}
		System.out.println();
		for(int i=0;i<cc;i++)
		{
			System.out.print(com[i]+" ");
		}
		System.out.print("\n");
		for(Integer val : hlst)
		{
			System.out.print(val+" ");
		}

	}
}