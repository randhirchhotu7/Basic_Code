
public class Q5_SmallestMatElement
{

	public static void main(String[] thunder) 
	{
		MatrixOperation mt = new MatrixOperation();
		System.out.println("Enter details of matrix !! ");
		int rp[][] = mt.getMat();
		System.out.println("Entered matrix is : ");
		mt.putMat(rp);
		int smallE=mt.smallMatElement(rp);
		System.out.print("Smallest element of array is : "+smallE);
		System.out.print("\n");
	}

}
