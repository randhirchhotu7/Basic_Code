//	Max elements in Both diagonals

public class q1_DiagonalMax
{

	public static void main(String[] thunder) 
	{
		MatrixOperation mt = new MatrixOperation();
		System.out.println("Enter details of matrix !! ");
		int rp[][] = mt.getMat();
		System.out.println("Entered matrix is : ");
		mt.putMat(rp);
		int max[]=mt.DiagonalMaxElement(rp);
		System.out.println("Maximum element in Primary Diagonal is : "+max[0]);
		System.out.println("Maximum element in Secondary Diagonal is : "+max[1]);			
	}

}
