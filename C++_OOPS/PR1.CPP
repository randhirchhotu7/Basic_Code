// sum of first n natural number.

#include<iostream.h>
#include<conio.h>
void main()
{
	int num,sum;
	clrscr();
	cout<<"ENTER A NUMBER : "; cin>>num;
	for(int i=1;i<=num;i++)
	{
		sum=i*(i+1)*((2*i)+1)/6;
	}
	cout<<"REQUIRED SUM : "<<sum;
getch();
}
