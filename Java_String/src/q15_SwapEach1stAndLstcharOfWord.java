//	Swap 1st and last character of each word in the string 

import java.util.Scanner;
public class q15_SwapEach1stAndLstcharOfWord 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		char ch[] =str.toCharArray();
		int n = ch.length;
		for(int i=0;i<n;i++)
		{
			int k=i;
			while(i<n && ch[i]!=' ')
			{
				i++;
			}
			int j=i-1;
			char temp=ch[k];
			ch[k]=ch[j];
			ch[j]=temp;
			
			System.out.print("k-->"+k+"\n");
			System.out.print("j-->"+j+"\n");
			System.out.println(i);
		}
		str = new String(ch);
		System.out.println("Required output : "+str);
	}
}