import java.util.Scanner;

public class q10_CountingEachCharacterInAString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a  string : ");
		String str = sc.nextLine();
		int n = str.length();
		char ch[] = str.toCharArray();
		
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					int k=j;
					while(k<n-1)
					{
						ch[k]=ch[k+1];
						k++;
					}
					n--;
//					System.out.println("n = "+n);
					j--;
				}
			}
			System.out.print(ch[i]+" Occured : "+count+" times"+"\n");	
		}
		String nst="";
		System.out.println("n->"+n);
		for (int i=0;i<n ;i++ )
		{
//			nst=nst + ch[i];
		}
		System.out.println(nst);
	}
}
