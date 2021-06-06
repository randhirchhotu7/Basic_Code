import java.util.*;
public class AkashNewCode 
{
	public static void main(String[] args) 
	{
		
		int num1=10;
		int num2=7;
		int arr[] = {4,1,3,7,6,8,5,2,10,9};
		int arr2[]=altTab(num1,num2,arr);
//		System.out.println("Output 2 : ");
//		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	static int[] altTab(int num1, int num2, int[] arr) 
	{
//		throw new unsupported("altTab(int num1, int num2, int[] arr)");
		int j=0,flag=0;
		flag=arr[num2-1];
		for(j=num2-1;j>0;j--)
		{
			arr[j]=arr[j-1];
		}
		arr[j]=flag;	
		return arr;
	}

}
