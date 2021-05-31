import java.util.*;
class PTR2
{
	public static void main(String randhir1[])
	{
		//char ch;
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Enter Size of Pattern : ");
		//int num=sc.nextInt();

		//int n1=1,n2=2,n3=3;
		//int n1=1,n2=5,n3=3,n4=10;
		int n1=1,n2=51,n3=3,n4=10;
		
		int max =(n1>n2 && n1>n3 && n1>n4)?n1: (n2>n3 && n2>n4)?n2:(n3>n4?n3:n4) ;
		System.out.print(max);
		
	}
}
/*
     Enter Size of Pattern : 5
     ----*
     ---***
     --*****
     -*******
     *********



*/