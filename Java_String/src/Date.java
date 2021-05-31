
import java.util.Scanner;
public class Date 
{
	int dd,mm,yy;
	int months[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	String dName[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		if(yy%400==0 || yy%4==0 && yy%100!=0)
		{
			months[2]=29;
		}
	}
	@Override
	public String toString() 
	{
		return "Date [ "+dd+"/"+mm+"/"+yy+" ]";
	}
	int noOfDays()
	{
		int days=0;
		int y=yy-1;
		days=days+(y*365)+y/400+y/4-y/100;  //	Calculating year as[year +(leap year)]
		for(int i=1;i<mm;i++)				//claculating Months days
		{
			days=days+months[i];
		}
		days=days+dd;			// Total days i.e = year+months+dd
		return days;
	}
	public String getDayName()

	{	
		return dName[noOfDays()%7];
	}
	
	static Date readDate()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter date {dd/mm/yy}  : ");
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		Date dt = new Date(d,m,y);
		return dt;
	}
	
}

class MainDate
{
	public static void main(String[] args) 
	{
		System.out.println("Enter 1st Date : ");
		Date d1=Date.readDate();
		System.out.println("Enter 2nd Date : ");
		Date d2=Date.readDate();
		System.out.println("1st Date is : "+d1);
		System.out.println("2nd Date is : "+d2);
		System.out.println("Number of Days for 1st Date :  "+d1.noOfDays());
		System.out.println("Number of Days for 2nd Date :  "+d2.noOfDays());
		
	}
}


