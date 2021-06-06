import java.util.Scanner;

public class a1_AsciiChk 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		System.out.println("ch->"+ch);
		int chVal = ch;
		int chUpper = (ch-32);
		System.out.println("chVal->"+chVal);
		System.out.println("chUpper->"+chUpper);
		System.out.println("chUpper char->"+(char)chUpper);
		
	}

}
