//	counting a specific/Given character frequency inside a given String


import java.util.Scanner;

public class q01_CountSpecialChar 
{
	static int CountChar(String str,char ch)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char gc = str.charAt(i);  // Taking each elements from string
			if(ch==gc)
			{
				count++;
			}
		}
		return count;
	
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz Enter a string : ");
		String str = sc.nextLine();
		System.out.println("Enter A char to find : ");
		char ch = sc.next().charAt(0);	//to read a single character in java
		int count = CountChar(str,ch);
		System.out.println("Total number of times "+ch+" Present is : "+count);
	}
}	