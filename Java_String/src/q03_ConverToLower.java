//	Convert String in lower Case &&  Upper Case


import java.util.Scanner;
public class q03_ConverToLower 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		StringCaseConversion sf = new StringCaseConversion();
		System.out.println("Enter a string : ");
		String str =sc.nextLine();
		sf.ConvertLower(str);
		sf.ConvertUpper(str);
	}
}

class StringCaseConversion
{
	void ConvertLower(String str)
	{
		String NewStr ="";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch = (char)(ch+32);
			}
			NewStr+=ch;
		}
		System.out.println("Required New String in lowerCase : "+NewStr);
	}
	
	void ConvertUpper(String str)
	{
		String NStr = "";
		for(int i=0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			if(ch>='a' &&  ch<='z')
			{
				ch=(char)(ch-32);
			}
			NStr+=ch;
		}
		System.out.println("Required New String in UpperCase : "+NStr);
	}
	
}