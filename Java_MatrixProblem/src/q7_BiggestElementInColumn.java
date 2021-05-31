
public class q7_BiggestElementInColumn 
{

	public static void main(String[] thunder) 
	{
		MatrixOperation mt = new MatrixOperation();
		System.out.println("Enter details of matrix !! ");
		int rp[][] = mt.getMat();
		System.out.println("Entered matrix is : ");
		mt.putMat(rp);
		int big[]=mt.BigInColumn(rp);
		for(int i=0;i<big.length;i++)
		{
			System.out.println("Biggest element in "+i+" Column of the matrix is : "+big[i]);			
		}
		
	}

}
