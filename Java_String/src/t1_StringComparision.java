public class t1_StringComparision 
{
	public static void main(String[] args) 
	{
		String obj1 = new String("Randhir");
		String str1 = "Randhir";
		String str2 = "randhir";
		String str3 = "Prakash";
		String str4 = obj1;
		String s1 = "";
		String s2 = "";
		
		String c1 = "aBc";
		String c2 = "ABc";
		String c3 = "ABC";
		String c4 = "abc";
		
		boolean val = str1.equals(str4);
		System.out.println(val);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println("-------------------------");
		int data=str1.compareTo(str2);
		System.out.println(data);
		System.out.println(str1.compareTo(obj1));
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(c1.compareTo(c2));
		System.out.println(c3.compareTo(c4));
		System.out.println(c3.compareToIgnoreCase(c4));
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("ABC".compareTo("ABD"));
		System.out.println("abc".compareTo("ABC"));//compare value
		System.out.println("abc".compareTo("abc"));
		System.out.println("abc".compareTo("abcdef"));//compare length
		System.out.println("abcde".compareTo("abc"));
		System.out.println("abc".compareTo("aBc"));//compare value
		System.out.println("-----------+++++++++++----------------");
		
		String data1 = "RAM";
		String data2 = "RAM";
		System.out.println(data1==data2);
	}
}
