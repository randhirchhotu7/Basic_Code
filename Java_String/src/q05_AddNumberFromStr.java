//	Adding All numbers of string i.e randhir111pr200kash91 = 111+200+91


import java.util.Scanner;
public class q05_AddNumberFromStr 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		AddDigit ad = new AddDigit();
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		ad.addStringNumber(str);
	}
}

class AddDigit
{
	void addStringNumber(String str)
	{
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			int num=0;
			while(ch>='0' && ch<='9')
			{
				int d=ch-48;
				num=num*10+d;
				i++;
				if(i==str.length())
				{
					break;
				}
				ch=str.charAt(i);
			}
		sum=sum+num;
		}
		System.out.print("Sum of all number of the string is : "+sum);
	}
	
}
