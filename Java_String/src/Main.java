
public class Main 
{
	public static void main (String [] args)
	{
		int arr1 [] = {10, 20, 30, 10, 20, 30};
		for(int i=0;i<arr1.length-1;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[j]<arr1[i])
				{
//					swap(arr1[i],arr1[j]);
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}
	static void swap(int i, int j) 
	{
		int temp=i;
		i=j;
		j=temp;	
	}
}