//	String Plaindrome

import java.util.Scanner;

import javax.sound.sampled.ReverbType;
public class q07_StringPlaindrome 
{
	public static void main(String[] args) 
	{
//		Method - 1
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String str = sc.nextLine();
		System.out.print("Original word : "+str+"\n");
		char ch[] = str.toCharArray();
		int flag=1;
		for(int i=0;i<ch.length/2;i++)
		{
			if(ch[i]!=ch[ch.length-1-i])
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
		{
			System.out.print("Entered word is a Plaindrom !! ");
		}
		else
		{
			System.out.print("Entered word is Not a Plaindrom !! ");
		}
	}
}*/
		
		
		
		
//		method - 2 This have some error
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String str = sc.nextLine();
		String rev = "";
		System.out.print("Original word : "+str+"\n");
		
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length/2;i++)
		{
			char t=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=t;
		}
		rev = String.valueOf(ch);   // use any one
//		rev = new String(ch);
		
		System.out.print("Reversed word : "+rev+"\n");
		if(rev.equalsIgnoreCase(str))
//		if(str==rev)    // use above
		{
			System.out.print("Entered word is a Plaindrom !! ");
		}
		else
		{
			System.out.print("Entered word is Not a Plaindrom !! ");
		}		

	}
}
//		method - 3
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String str = sc.nextLine();
		System.out.print("Original word : "+str+"\n");
		StringBuilder str1 = new StringBuilder(); //we need to use Builder bcz it have revrse()
		str1.append(str);
		
		StringBuilder str2 = new StringBuilder();
		str2 = str1.reverse();
		
		System.out.print("Reversed word : "+str2+"\n");
		if(str1==str2)
		{
			System.out.print("Entered word is a Plaindrom !! ");
		}
		else
		{
			System.out.print("Entered word is Not a Plaindrom !! ");
		}		

	}
}		
*/