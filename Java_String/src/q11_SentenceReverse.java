//	Reverse sentence without reversing word !!

import java.util.Scanner;
public class q11_SentenceReverse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		String res = "";
		for(int i=ch.length-1;i>=0;i--)
		{
			int k=i;
			while(i>=0 && ch[i]!=' ')
			{
				i--;
			}
			int j=i+1;
			while(j<=k)
			{
				res+=ch[j];
				j++;
			}
			res+=' ';
		}
		System.out.print("Reversed sentence is : "+res);
	}
}