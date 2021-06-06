
public class q24_AlternatePosNeg
{
	public static void main(String[] args) 
	{
//		int arr[] = {1,2,3,4,5,6,7,8,9,10,-1,-2,-3,-4,-5};
		int arr[] = {1,2,3,4,5,6,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]>0)
				{
					System.out.print(arr[j]+" ");
					arr[j]=0;
					break;
				}					
			}
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]<0)
				{
					System.out.print(arr[j]+" ");
					arr[j]=0;
					break;
				}					
			}
		}
		/*System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}*/
	}
}
