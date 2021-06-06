import java.util.Scanner;

public class Result1 
{
	public static void main (String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();

		System.out.println(minMaxHammingDistance (str1, str2));
	}
	static int minMaxHammingDistance(String str1, String str2)
	{
		if(str1.length()!=str2.length())
		{
			return 0;
		}
		else
		{
			int i = 0, count = 0;
			while (i < str1.length())
			{
				if (str1.charAt(i) != str2.charAt(i))
					count++;
				i++;
			}
			return count;
		}
	}
}
