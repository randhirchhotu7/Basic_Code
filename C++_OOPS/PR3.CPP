//	printing chessboard

#include<iostream.h>
#include<conio.h>
void main()
{
	int num;
	clrscr();
	cout<<"ENTER A NUMBER : "; cin>>num;
	for(int i=0;i<num;i++)
	{
		for(int j=0;j<num;j++)
		{
		      if(i%2!=0)
		      {
				if(j%2==0)
				{
					cout<<"B ";
				}
				else
				{
					cout<<"W ";
				}
		      }
		      else
		      {
				if(j%2==0)
				{
					cout<<"W ";
				}
				else
				{
					cout<<"B ";
				}
		      }
		}
		cout<<"\n";
	}
getch();
}