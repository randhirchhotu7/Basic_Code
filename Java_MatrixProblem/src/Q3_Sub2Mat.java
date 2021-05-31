//	Matrix Subtraction

public class Q3_Sub2Mat 
{

	public static void main(String[] thunder) 
	{
		MatrixOperation mt = new MatrixOperation();
		
		System.out.println("Enter details of matrix-1 !! ");
		int rp1[][] = mt.getMat();
		System.out.println("Entered 1St matrix is : ");
		mt.putMat(rp1);
		
		System.out.println("Enter details of matrix-2 !! ");
		int rp2[][] = mt.getMat();
		System.out.println("Entered 2nd matrix is : ");
		mt.putMat(rp2);
		int ak[][] = mt.SubMatrix(rp1,rp2);
		if(ak!=null)
		{
			System.out.println("Required matrix after Subtraction : ");
			mt.putMat(ak);
		}
		System.out.print("\n");

	}

}
