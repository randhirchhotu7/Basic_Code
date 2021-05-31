
public class q9_SumOfColumnElement 
{

	public static void main(String[] thunder) 
	{
		MatrixOperation mt = new MatrixOperation();
		System.out.println("Enter details of matrix !! ");
		int rp[][] = mt.getMat();
		System.out.println("Entered matrix is : ");
		mt.putMat(rp);
		int sum[]=mt.SumOfColumnElement(rp);
		for(int i=0;i<sum.length;i++)
		{
			System.out.println("Sum of "+i+" Column of the matrix is : "+sum[i]);			
		}
	}
}
