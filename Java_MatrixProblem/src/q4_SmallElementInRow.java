
public class q4_SmallElementInRow 
{

	public static void main(String[] thunder) 
	{
		MatrixOperation mt = new MatrixOperation();
		System.out.println("Enter details of matrix !! ");
		int rp[][] = mt.getMat();
		System.out.println("Entered matrix is : ");
		mt.putMat(rp);
		int small[]=mt.SmallInRow(rp);
		for(int i=0;i<small.length;i++)
		{
			System.out.println("Smallest element in "+i+" row of matrix is : "+small[i]);			
		}
		//System.out.println("Secondary Diagonal Element Sum is : "+sum[1]);			

	}

}


