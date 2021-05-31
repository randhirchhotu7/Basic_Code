//	Finding	Biggest element of the square matrix

public class CwBiggestElementInMat {

	public static void main(String[] thunder)
	{
		MatrixOperation mt = new MatrixOperation();
		System.out.println("Enter details of matrix !! ");
		int rp[][] = mt.getMat();
		System.out.println("Entered matrix is : ");
		mt.putMat(rp);
		int bigE=mt.bigMatElement(rp);
		System.out.print("Biggest element of Matrix is : "+bigE);
		System.out.print("\n");
		
		
	}

}
