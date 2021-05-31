import java.util.Scanner;

public class q08_StringReverse 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.print("Reversed String is : ");
		String str =sc.nextLine();
		
//		method - 1
		/*char ch[] = str.toCharArray();
		for(int i=0;i<ch.length/2;i++)
		{
			char temp = ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
		System.out.print("Required output : ");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		
	}

}*/
//		method - 2
		StringBuilder str1 = new StringBuilder();
		str1.append(str);
		str1.reverse();
		System.out.print("Reversed String is : "+str1);
	}
}
