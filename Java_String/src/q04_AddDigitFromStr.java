//	Add digits(ie-randhir12prakash717= 1+2+7+1+7) of a string And Print only Vowel from the string
 

import java.util.Scanner;
public class q04_AddDigitFromStr 
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			StringDigitSum sf = new StringDigitSum();
			
			System.out.print("Enter a string : ");
			String str = sc.nextLine();
			sf.AddStringDigit(str);
			sf.PrintOnlyVowel(str);
			sf.VtoUpperCtolower(str);
	}
}

class StringDigitSum
{
	void AddStringDigit(String str)
	{
		int sum = 0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				sum=sum+(ch-48);
			}
		}
		System.out.println("Required Sum of digit is : "+sum);
	}	
	
	void PrintOnlyVowel(String str)
	{
		String NStr="";
		for(int i=0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
			{
				NStr+=ch;
			}
		}
		System.out.println("Required vowel is : "+NStr);
	}
	
	void VtoUpperCtolower(String str)
	{
		String NStr="";
		for(int i=0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
			{
				ch = (char)(ch-32);
			}
			NStr+=ch;
		}
		
//		System.out.println("----->"+NStr);
	}
}