//	counting each words of a given string !!

import java.util.Scanner;
public class q09_EachWordCountOfString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner( System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			int count=0;
			String val="";
			char ch = str.charAt(i);
			while( (ch>='A' && ch<='Z') || (ch>='a' && ch<'z') )
			{
				count++;
				val+=ch;
				i++;
				if(i==str.length())
				{
					break;
				}
				ch=str.charAt(i);
			}
			if(val!=" ")
			{
				
				System.out.println(val+" "+count);
			}
		}
		
//		 method - 2
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		String nst=" ";
		int nc=0;
		for (int i=0; i<s.length();i++ )
		{
		if (s.charAt(i)==' ')
		{
		nst=nst + nc;
		nc=0;
		}
		else
		{
		nc++;
		nst=nst + s.charAt(i);
		}
		}
		nst=nst + nc;
		System.out.println ("Required Output : "+ nst);*/
	}

}
