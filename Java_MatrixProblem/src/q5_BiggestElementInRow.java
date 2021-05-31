
public class q5_BiggestElementInRow {

	public static void main(String[] thunder) 
	{
		MatrixOperation mt = new MatrixOperation();
		System.out.println("Enter details of matrix !! ");
		int rp[][] = mt.getMat();
		System.out.println("Entered matrix is : ");
		mt.putMat(rp);
		int big[]=mt.BigInRow(rp);
		for(int i=0;i<big.length;i++)
		{
			System.out.println("Big element in "+i+" row of matrix is : "+big[i]);			
		}
		//System.out.println("Secondary Diagonal Element Sum is : "+sum[1]);			
		// TODO Auto-generated method stub

	}

}
