///*//	Count Character, Vowel, Consonant,number and special char in a string !!
//
//
//import java.util.Scanner;
//public class q02_CountAllCharType 
//{	
//	public static void main(String[] args) 
//	{
//		Scanner sc = new  Scanner(System.in);
//		System.out.println("Enter a string : ");
//		String str = sc.nextLine();
//		System.out.println();
//		CountAllString(str);
//		
//	}
//	static void CountAllString(String str)
//	{
//		int Acount=0, Ecount=0, Icount=0, Ocount=0, Ucount=0;
//		int flag=0;
//		String res = "";
//		for(int i=0;i<str.length();i++)
//		{
//			char ch = str.charAt(i);
//			
//			if(ch!= 'A' || ch!= 'E' || ch!= 'I' || ch!= 'O' || ch!= 'U' || ch!= 'a' || ch!= 'e' || ch!= 'i' || ch!= 'o' || ch!= 'u')
//			{
//				res+=ch;
//			}
//			
//			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
//			{
//				
//				flag=1;
//
//				if(ch =='A' || ch =='a' )
//				{
//					Acount++;
//				}
//				else if(ch =='E' || ch =='e')
//				{
//					Ecount++;
//				}
//				else if(ch =='I' || ch =='i')
//				{
//					Icount++;
//				}
//				else if(ch =='O' || ch =='o')
//				{
//					Ocount++;
//				}
//				else if(ch =='U' || ch =='u')
//				{
//					Ucount++;
//				}
//			}
//	
//		}	
//		System.out.println("a: "+Acount);
//		System.out.println("e: "+Ecount);
//		System.out.println("i: "+Icount);
//		System.out.println("o: "+Ocount);
//		System.out.println("u: "+Ucount);
//		System.out.print(res);
//	}
//}


//	Count Character, Vowel, Consonant,number and special char in a string !!


import java.util.Scanner;
public class q02_CountAllCharType 
{	
	public static void main(String[] args) 
	{
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		System.out.println();
		CountAllString(str);
		
	}
	static void CountAllString(String str)
	{
		int charcount=0,vcount=0,ccount=0,dcount=0,sccount=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				charcount++;
				if(ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U' )
				{
					vcount++;
				}
				else
				{
					ccount++;
				}
			}
			else if(ch>='a' && ch<='z')
			{
				charcount++;
				if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' )
				{
					vcount++;
				}
				else
				{
					ccount++;
				}
			}
			else if(ch>='0' && ch<='9' )
			{
				dcount++;
			}
			else
			{
				sccount++;
			}
		}
		
		System.out.println("Total number of Characters are : "+charcount);
		System.out.println("Total number of Vowels are : "+vcount);
		System.out.println("Total number of Consonents are : "+ccount);
		System.out.println("Total number of digits are : "+dcount);
		System.out.println("Total number of Special Characters are : "+sccount);
	}
}



