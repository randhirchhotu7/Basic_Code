
public class q6_SumOfRow 
{

	public static void main(String[] thunder) 
	{
		MatrixOperation mt = new MatrixOperation();
		System.out.println("Enter details of matrix !! ");
		int rp[][] = mt.getMat();
		System.out.println("Entered matrix is : ");
		mt.putMat(rp);
		int sum[]=mt.SumOfEachRow(rp);
		for(int i=0;i<sum.length;i++)
		{
			System.out.println("Sum of  element of "+i+" row of the matrix is : "+sum[i]);			
		}
		//System.out.println("Secondary Diagonal Element Sum is : "+sum[1]);			
		// TODO Auto-generated method stub

	}

}
