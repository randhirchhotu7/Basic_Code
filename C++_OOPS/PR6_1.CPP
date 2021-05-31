//	printing fibbo

#include<iostream.h>
#include<conio.h>
void main()
{
	int num,a=0,b=1,c;
	clrscr();
	cout<<"ENTER LENGTH OF SERIES : "; cin>>num;
	cout<<a<<" ";
	for(int i=1;i<num;i++)
	{
		c=a+b;
		a=b;
		b=c;
		cout<<a<<" ";
	}

	getch();
}
