// scope resolution
#include<iostream.h>
#include<conio.h>
int m=10;
void main()
{
	 int m=20;
	 clrscr();
	 {
		int k=m;
		int m=30;
		cout<<k<<"\t"<<m<<"\t"<<::m;
	 }
	 cout<<"\n"<<m<<"\t"<<::m;
getch();
}