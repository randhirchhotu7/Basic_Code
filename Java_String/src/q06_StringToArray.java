//	use of ToArray method && String reverse && String Plaindrom 


import java.util.Scanner;
public class q06_StringToArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		StringSpecialOperation ss = new StringSpecialOperation();
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		ss.RevStr(str);
		ss.upperCaseUsingCHARARRAY(str);
	}
}
class StringSpecialOperation
{
	void RevStr(String str)
	{
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length/2;i++)
		{
			char t=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=t;
		}
		System.out.print(ch);
		System.out.println();
	}
	
	void upperCaseUsingCHARARRAY(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		System.out.print(ch);
		System.out.println();
	}
}
