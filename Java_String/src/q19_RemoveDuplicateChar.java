
public class q19_RemoveDuplicateChar 
{
	public static void main(String[] args) 
	{
		String str = "rraaamaa";
		String nwStr = removeDuplicate(str);
		System.out.println(nwStr);
	}

	static String removeDuplicate(String str) 
	{
		char ch[] = str.toCharArray();
		String copy= "";
		int len = ch.length;
		int i=0,j=0;
		for(i=0;i<len;i++)
		{
			for(j=0;j<i;j++)
			{
				if(ch[i]==ch[j])
				{
					break;
				}
			}
			if(j==i)
			{
				copy+=ch[i];
			}
		}
		return copy;
	}
}
