//	Even and odd elements of matrix

public class Q2_EvenOddEleOfMat 
{

	public static void main(String[] thunder) 
	{
		MatrixOperation mt = new MatrixOperation();
		System.out.println("Enter details of matrix !! ");
		int rp[][] = mt.getMat();
		System.out.println("Entered matrix is : ");
		mt.putMat(rp);
		int evenCount=mt.EvenCounter(rp);
		int oddCount=mt.oddCounter(rp);
		System.out.print("Total Number of even elements in the array are : "+evenCount);
		System.out.print("\n");
		System.out.print("Total Number of odd elements in the array are : "+oddCount);
		System.out.print("\n");

	}

}
