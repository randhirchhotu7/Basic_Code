//Counting total number of prime number exist in the given matrix


public class Q1_PrimeElementOfMat 
{
	public static void main(String[] args) 
	{
		MatrixOperation mt = new MatrixOperation();
		System.out.println("Enter details of matrix !! ");
		int rp[][] = mt.getMat();
		System.out.println("Entered matrix is : ");
		mt.putMat(rp);
		int primeNum=mt.CountPrimeMat(rp);
		System.out.print("Total number of prime number in matrix is : "+primeNum);
		System.out.print("\n");
	}

}
