//	Convert upper case to lower and vice versa

import java.util.Scanner;
public class q16_ToggleTheWords 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		String res = "";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch = (char)(ch+32);
			}
			else if(ch>='a' && ch<='z')
			{
				ch = (char)(ch-32);
			}
			res+=ch;
		}
		System.out.print("Required output : "+res);
		
	}

}
