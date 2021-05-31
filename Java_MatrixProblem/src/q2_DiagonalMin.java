//	Max elements in Both diagonals


public class q2_DiagonalMin 
{

	public static void main(String[] thunder) 
	{
		MatrixOperation mt = new MatrixOperation();
		System.out.println("Enter details of matrix !! ");
		int rp[][] = mt.getMat();
		System.out.println("Entered matrix is : ");
		mt.putMat(rp);
		int min[]=mt.DiagonalMinElement(rp);
		System.out.println("Minimum element in Primary Diagonal is : "+min[0]);
		System.out.println("Minumum element in Secondary Diagonal is : "+min[1]);			

	}

}
