// 36 -> 3+6=9 // 26/9 -> 4 else retutn 0;  //

import java.util.*;

public class q10_NivenNumber 
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number : ");
	    int n = sc.nextInt();
	    int result = checkNivenNumber(n);
		System.out.println("Result -> "+result);
	}
	static int checkNivenNumber(int num)
	{
	    int temp = num;
	    int res=0;
	    do
	    {
	        int rem = num%10;
	        res+=rem;
	        num /=10;
	    }while(num>0);
	    if((temp % res)!=0)
	    {
	        return 0;
	    }
	    else
	    {
	        return (temp / res);
	    }
	}
}
