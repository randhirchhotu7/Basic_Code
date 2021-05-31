
public class MainMat1 {

	public static void main(String[] thunder) 
	{
		int mat[][];
		mat=new int[3][4];
		mat[0][0]=19;
		mat[1][2]=12;
		mat[2][2]=77;

		System.out.println(mat.length);
		System.out.println(mat[0].length);
		System.out.println(mat[1][2]);
		System.out.println("-------------------------------------");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.println(mat[i][j]+" ");
			}
			//System.out.println();
		}
	}

}
