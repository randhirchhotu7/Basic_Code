//	Counting total number of words in a given string !!

import java.util.Scanner;
public class q14_CountingWordsInString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		/*int n=str.length();
		char ch[] =str.toCharArray();
		int count=0,flag=0;
		for(int i=0;i<n;i++)
		{
			count=0;
//			int k=i;
			while(i<n && ch[i]!=' ')
			{
				count=1;
				i++;
			}
			flag+=count;
		}
		System.out.print("Total number of words : "+flag);*/
		
//		method - 2
		int count=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if((i==0 && ch[i]!=' ' ) ||(ch[i]!=' ' && ch[i-1]==' ') )
			{
				count++;
			}
		}
		System.out.println("-->"+count);
	}
}
