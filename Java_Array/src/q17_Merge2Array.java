// merge 2 Array one after another //
import java.util.*;
public class q17_Merge2Array 
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of 1st Array : ");
		int num1 = sc.nextInt();
		System.out.print("\n"+"Enter Elements of 1st Array : ");
		int arr1[] = new int[num1];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the Size of 2nd Array : ");
		int num2 = sc.nextInt();
		System.out.print("\n"+"Enter Elements of 2nd Array : ");
		int arr2[] = new int[num2];
		
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int add[] = new int[num1+num2];
		for(int i=0;i<arr1.length;i++)
		{
			add[i]=arr1[i];
		}
		int flag=0;
		for(int i=arr1.length;i<add.length;i++)
		{
			add[i]=arr2[flag];
			flag++;
		}
		System.out.print("\n"+"Combined Array is : ");
		for(int i=0;i<add.length;i++)
		{
			System.out.print(add[i]+" ");
		}
	}

}
