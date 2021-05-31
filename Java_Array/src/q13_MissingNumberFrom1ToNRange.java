// Finding missing number in the sum of n number//

public class q13_MissingNumberFrom1ToNRange 
{
	public static void main(String[] args) 
	{
		int arr[] = {2, 4, 1, 3};
		int num=arr.length+1;
		int Fsum=(num*(num+1))/2;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		int Mnum=Fsum-sum;
		System.out.print("Missing number is : "+Mnum);
	}
}
