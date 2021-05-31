//Sum of each element of diagonal(i.e  for main and secondary diagonal)


public class q3_DiagonalElementSum 
{

	public static void main(String[] thunder) 
	{
		MatrixOperation mt = new MatrixOperation();
		System.out.println("Enter details of matrix !! ");
		int rp[][] = mt.getMat();
		System.out.println("Entered matrix is : ");
		mt.putMat(rp);
		int sum[]=mt.DiagonalElementSum(rp);
		System.out.println("Primary Diagonal Element Sum is : "+sum[0]);
		System.out.println("Secondary Diagonal Element Sum is : "+sum[1]);			

	}

}
