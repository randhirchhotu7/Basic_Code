import java.util.Scanner;

public class test77
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string : ");
		String st=sc.nextLine();
		int count[] = new int[128];
		for(int i=0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			count[ch]++;
		}
		/*for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			{
				System.out.println((char)i+" -> "+count[i]);
			}
		}*/
		for(int i=0;i<count.length;i++)
		{
			System.out.println((char)i+" -> "+count[i]);
		}
	}

}
