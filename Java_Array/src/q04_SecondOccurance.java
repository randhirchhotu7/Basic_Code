//	Second occurance of an entered number

import java.util.Scanner;
public class q04_SecondOccurance 
{ 
	public static void main(String[] args) 
	{
		int pos=0,count=0;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.print("\n"+"Enter "+num+" elements of array : ");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter number to check its 2nd occurance : ");
		int chk = sc.nextInt();
		for(int i=0;i<num;i++)
		{
			if(arr[i]==chk)
			{
				count++;
				if(count==2)
				{
					pos=i+1;
					break;
				}
			}
		}
		if(count==2)
		{		
			System.out.print(chk+" Repeated at position : "+pos);
		}
		else if(count==1)
		{
			System.out.println(chk+" Available only once !!");
		}
		else 
		{
			System.out.println(chk+" Not Available !!");
		}
	}
}
