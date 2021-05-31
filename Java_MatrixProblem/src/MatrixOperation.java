//	Matrix Method class Where all methods are defined

import java.util.*;
public class MatrixOperation 
{
	//	Method to take matrix input from user
	int [][] getMat()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Row of matrix : ");
		int row=sc.nextInt();
		System.out.print("Enter Cloumn of matrix : ");
		int colm=sc.nextInt();
		int mat[][] = new int[row][colm];					 
		System.out.println("Enter "+row*colm+" elements of array : ");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	
	//	Method to print matrix 
	void putMat(int mat[][])
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	 
	//	Method to find Biggest element of matrix 
	int bigMatElement(int mat[][])
	{
		int big=mat[0][0];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]>big)
				{
					big=mat[i][j];
				}
			}
		}
		return big;
	}
	
	//	Method to find Smallest element of matrix 
	int smallMatElement(int mat[][])
	{
		int small=mat[0][0];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]<small)
				{
					small=mat[i][j];
				}
			}
		}
		return small;
	}
	
	
//	Method to find Smallest element of matrix 
	int MatElementSum(int mat[][])
	{
		int sum=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				sum+=mat[i][j];
			}
		}
		return sum;
	}
	
//	Method to Count EVEN element of matrix 
	int EvenCounter(int mat[][])
	{
		int count=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]%2==0)
				{
					count++;
				}
			}
		}
		return count;
	}
	
//	Method to Count ODD element of matrix 
	int oddCounter(int mat[][])
	{
		int count=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]%2!=0)
				{
					count++;
				}
			}
		}
		return count;
	}
	
//	Method to Perform Subtraction b/w two matrix
	
	int [][] SubMatrix(int mat1[][], int mat2[][])
	{
		
		if(mat1.length!=mat2.length || mat1[0].length!=mat2[0].length)
		{
			System.out.println("Subtraction not Possible due to size issue !!");
			return null;
		}
		
			int sub[][]=new int[mat1.length][mat1[0].length];
			for(int i=0;i<sub.length;i++)
			{
				for(int j=0;j<sub[i].length;j++)
				{
					sub[i][j]=mat1[i][j] - mat2[i][j];
				}
			}
			
			return sub;
	}
	
//	--------------------------------------------------------------
	
//	Method to count number of prime in a matrix 
	int CountPrimeMat(int mat[][])
	{
		int pCount=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				boolean pn=chkPrime(mat[i][j]);  //	sending each element to "chkPrime" method to evaluate for prime number
				if(pn==true)
				{
					pCount++;
				}
			}
		}
		return pCount;
	}
	static boolean chkPrime(int num)	//	Method to check prime number
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count!=2)
		{
			return false;
		}
		else
		{
			return true;
		}
			
	}
//-------------------------------------------------------------------		
//	Transpose of matrix
	
	int [][] TransposeMat(int mat[][])
	{
		int a[][]=new int [mat[0].length][mat.length];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				a[j][i]=mat[i][j];	
			}
		}
		return a;
	}
//	q1) Max Element in diagonal
	int [] DiagonalMaxElement(int a[][])
	{
		int mBig=a[0][0];
		int sBig=a[0][a[0].length-1];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(i==j)
				{
					if(a[i][j]>mBig)
					{
						mBig=a[i][j];
					}
				}
				if(i+j==a.length-1)
				{
					if(a[i][j]>sBig)
					{
						sBig=a[i][j];
					}
				}
			}
		}
		return new int[]{mBig,sBig};	
	}
	
//	q2) Minimum Element in diagonal of Matrix
	int [] DiagonalMinElement(int a[][])
	{
		int mSmall=a[0][0];
		int sSmall=a[0][a[0].length-1];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(i==j)
				{
					if(a[i][j]<mSmall)
					{
						mSmall=a[i][j];
					}
				}
				if(i+j==a.length-1)
				{
					if(a[i][j]<sSmall)
					{
						sSmall=a[i][j];
					}
				}
			}
		}
		return new int[]{mSmall,sSmall};	
	}

//	q3) Diagonal Element Sum 
	int [] DiagonalElementSum(int a[][])
	{
		int mSum=0;
		int sSum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(i==j)
				{
					mSum+=a[i][j];
				}
				if(i+j==a.length-1)
				{
					sSum+=a[i][j];
				}
			}
		}
		return new int[]{mSum,sSum};	
	}

//	q4) Smallest Element in row 
	int[] SmallInRow(int a[][])
	{
		int sm[]=new int[a[0].length];
		//int sSum=0;
		for(int i=0;i<a.length;i++)
		{
			int small=a[i][0];
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]<small)
				{
					small=a[i][j];
				}
				sm[i]=small;
			}
		}
		return sm;	
	}
	
//	q5) Biggest Element in row 
	int[] BigInRow(int a[][])
	{
		int bg[]=new int[a[0].length];
		//int sSum=0;
		for(int i=0;i<a.length;i++)
		{
			int big=a[i][0];
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]>big)
				{
					big=a[i][j];
				}
				bg[i]=big;
			}
		}
		return bg;	
	}

//	q6) Sum of elements of each row  
	int[] SumOfEachRow(int a[][])
	{
		int sum[]=new int[a[0].length];
		//int sSum=0;
		for(int i=0;i<a.length;i++)
		{
			int temp=0;
			for(int j=0;j<a[0].length;j++)
			{
				temp+=a[i][j];
			}
			sum[i]=temp;
		}
		return sum;	
	}

//	q7) Biggest Element in each Column 
	int[] BigInColumn(int a[][])
	{
		//int big=a[i][0];
		int bg[]=new int[a[0].length];
		//int sSum=0;
		//for(int i=0;i<a.length;i++)	// modify for non square matrix 
		for(int i=0;i<a[0].length;i++)
		{
			int big=a[0][i];
			//for(int j=0;j<a[0].length;j++)
			for(int j=0;j<a.length;j++)
			{
				if(a[j][i]>big)
				{
					big=a[j][i];
				}
			}
			bg[i]=big;
		}
		return bg;	
	}
	
//	q8) Smallest Element in each Column 
	int[] SmallInColumn(int a[][])
	{
		//int big=a[i][0];
		int sm[]=new int[a[0].length];
		//int sSum=0;
		for(int i=0;i<a[0].length;i++)
		{
			int small=a[0][i];
			for(int j=0;j<a.length;j++)
			{
				if(a[j][i]<small)
				{
					small=a[j][i];
				}
			}
			sm[i]=small;
		}
		return sm;	
	}

//	q9) Sum of elements in each Column 
	int[] SumOfColumnElement(int a[][])
	{
		int sm[]=new int[a[0].length];
		//int sSum=0;
		for(int i=0;i<a[0].length;i++)
		{
			int sum=0;
			for(int j=0;j<a.length;j++)
			{
				sum+=a[j][i];
			}
			sm[i]=sum;
		}
		return sm;	
	}
	
}