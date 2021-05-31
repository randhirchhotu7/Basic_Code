import java.util.Scanner;

public class Cq1Matrix 
{

	public static void main(String[] thunder) 
	{
		Scanner sc = new Scanner(System.in);
		int mat[][];
		System.out.print("Enter Size of square matrix : ");
		int n=sc.nextInt();
		mat=new int[n][n];					//	here we are taking squar matrix 
		System.out.println("Enter "+n*n+" elements of array : ");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
			//System.out.println();
		}
		
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
