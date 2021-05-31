// 	finding fac2toial
#include<iostream.h>
#include<conio.h>
int FINDfact(int);
void main()
{
	int num,test;
	clrscr();
	cout<<"ENTER A NUMBER : "; cin>>num;
	test=FINDfact(num);
	cout<<"FACTORIAL OF "<< num <<" IS "<< test;
getch();
}

int FINDfact(int num)
{
	int temp=1,i;
	for(i=1;i<=num;i++)
	{
		temp=temp*i;
	}
	return temp;
}
