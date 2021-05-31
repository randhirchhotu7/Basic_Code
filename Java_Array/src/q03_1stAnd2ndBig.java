//	Finding 1st and 2nd Biggest elements in the given array 

import java.util.Scanner;
public class q03_1stAnd2ndBig 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Entere size of array : ");
		int num = sc.nextInt();
		int Fbig=0,Sbig=0;
//		int Tbig=0;
		int arr[] = new int[num];
		System.out.print("Enter "+num+" Elements of array : ");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		
//		1st method
		/*int Fbig=arr[0];
		for(int i=1;i<num;i++)
		{
			if(arr[i]>Fbig)
			{
				Fbig=arr[i];
			}
		}
		int Sbig=arr[0];
		for(int i=1;i<num;i++)
		{
			System.out.println("-->"+Fbig);
			System.out.println("-->"+Sbig);
			
			if(Sbig<Fbig && arr[i]>Sbig)
			{
				Sbig=arr[i];
			}
		}*/
		Fbig = arr[0];
		Sbig = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>Fbig)
			{
				Sbig = Fbig;
				Fbig = arr[i];
			}
			else if(arr[i]>Sbig)
			{
				Sbig = arr[i];
			}
		}
		
//		3rd method
	/*	sort(arr);
		for(int i=0;i<num;i++)
		{
			System.out.println(arr[i]);
		}
		Fbig=arr[0];
				
		for(int i=1;i<num;i++)		//to avoid Dublicate entry at 2nd max
		{
			if(Fbig!=arr[i])
			{	
				Sbig=arr[i];
				break;
			}
	
		}
		
		
	   //to avoid Dublicate entry at 2nd max and 3rd max	
		for(int i=2;i<num;i++)
		{
		    if(Fbig!=arr[i] && Sbig!=arr[i])
		    {
		        Tbig=arr[i];
		        break;
		    }
		}*/
		System.out.println("First biggest number : "+Fbig);
		System.out.println("Second biggest number : "+Sbig);
//		System.out.println("Third biggest number : "+Tbig);
	}

	static void sort(int[] arr) 
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
	}
}