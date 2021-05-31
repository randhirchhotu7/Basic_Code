//	Each word of sentence is reversed without reversing whole string

import java.util.Scanner;
public class q12_SentenceWordReverse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		String res = "";
		char ch[] = str.toCharArray();
		int n=ch.length;
		for(int i=0;i<n;i++)
		{
			int k=i;
			while(i<n && ch[i]!=' ')
			{
				i++;
			}
			int j=i-1;
			while(j>=k)
			{
				res+=ch[j];
				j--;
			}
			res+=' ';
		}
		System.out.print("Required output : "+res);
		
	}

}
