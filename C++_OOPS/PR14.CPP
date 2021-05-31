#include<iostream.h>
#include<conio.h>
void main()
{
	int tt,num;
	clrscr();
	cout<<"ENTER A NUMBER : "; cin>>num;
       //	cout<<"1"<<"\n";
	for(int i=1;i<=num;i++)
	{
		for(int k=1;k<i;k++)
		{
			cout<<" ";
		}
		for(int j=i;j<=i;j++)
		{
			cout<<i;
		}
		cout<<"\n";
	}
getch();
}