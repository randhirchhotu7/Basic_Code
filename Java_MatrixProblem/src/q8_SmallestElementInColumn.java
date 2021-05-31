
public class q8_SmallestElementInColumn 
{

	public static void main(String[] thunder) 
	{
		MatrixOperation mt = new MatrixOperation();
		System.out.println("Enter details of matrix !! ");
		int rp[][] = mt.getMat();
		System.out.println("Entered matrix is : ");
		mt.putMat(rp);
		int small[]=mt.SmallInColumn(rp);
		for(int i=0;i<small.length;i++)
		{
			System.out.println("Smallest element in "+i+" Column of the matrix is : "+small[i]);			
		}
		

	}

}
