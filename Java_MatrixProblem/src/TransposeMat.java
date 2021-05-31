
public class TransposeMat 
{

	public static void main(String[] args) 
	{
		MatrixOperation mt = new MatrixOperation();
		System.out.println("Enter details of matrix !! ");
		int rp[][] = mt.getMat();
		System.out.println("Entered matrix is : ");
		mt.putMat(rp);
		int y[][]=mt.TransposeMat(rp);
		System.out.println("Transpose matrix is : ");
		mt.putMat(y);
		
		System.out.print("\n");
	}

}
