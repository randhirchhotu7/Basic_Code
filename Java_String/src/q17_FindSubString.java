import java.util.Scanner;
class q17_FindSubString
{
	public static void main(String[] args)
	/*{
		System.out.print("Enter a string : ");
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		char ch1[]=str1.toCharArray();
		System.out.print("Enter a sub-string : ");
		String str2=sc.next();
		char ch2[]=str2.toCharArray();
		
		int flag=0;
		
		for (int i=0;i<ch1.length ;i++ )
		{
			int k=i;
			int j=0;
			while (k<ch1.length && j<ch2.length && ch1[k]==ch2[j])
			{
				j++;
				k++;
			}
			if(j==ch2.length)
			{
				flag++;
//				System.out.println( flag+" times "+str2+" present between "+i+" to "+k+" indexs");
			}
		}
		
		if(flag==0)
		{
			
			System.out.println("not found");
		}
		else
		{
			System.out.print( "Sub-string "+str2+" is present in the String "+str1);
		}
	}*/
	
	
	{
		System.out.print("Enter a string : ");
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		char ch1[]=str1.toCharArray();
		System.out.print("Enter a sub-string : ");
		String str2=sc.next();
		char ch2[]=str2.toCharArray();
		
		int flag=0;
		
		for (int i=0;i<ch1.length ;i++ )
		{
			int k=i;
			int j=0;
			while (k<ch1.length && j<ch2.length && ch1[k]==ch2[j])
			{
				j++;
				k++;
			}
			if(j==ch2.length)
			{
				flag++;
//				System.out.println( find+" times "+str2+" present between "+i+" to "+k+" indexs");
			}
		}
		
		if(flag==0)
		{
			
			System.out.println("not found");
		}
		else
		{
			System.out.print( "Found "+flag+" times");
		}
	}
}