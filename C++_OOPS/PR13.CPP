#include<iostream.h>
#include<conio.h>
void main()
{
	int tt,num;
	clrscr();
	cout<<"ENTER A NUMBER : "; cin>>num;
	for(int i=1;i<=num;i++)
	{
		for(int j=i;j<=i;j++)
		{
			for(int k=i;k<num;k++)
			{
				cout<<" ";
			}
			cout<<i;
		}
		cout<<"\n";
	}
	getch();
}
