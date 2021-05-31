//	Sum of all elements of matrix

public class Q4_MatrixEleSum 
{

	public static void main(String[] thunder) 
	{
		MatrixOperation mt = new MatrixOperation();
		System.out.println("Enter details of matrix !! ");
		int rp[][] = mt.getMat();
		System.out.println("Entered matrix is : ");
		mt.putMat(rp);
		int eSum=mt.MatElementSum(rp);
		System.out.print("Sum of element of the array is : "+eSum);
		System.out.print("\n");

	}

}
