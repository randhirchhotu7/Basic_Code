
//	calculating max and min in an array.

#include<iostream.h>
#include<conio.h>
void MAx(int[],int);
void MIn(int[],int);
void main()
{
	int a[30],num;
	clrscr();
	cout<<"ENTER NUMBER OF ELEMENT OF ARRAY : "; cin>>num;
	cout<<"ENTER "<< num<<" NUMBERS : ";
	for(int i=0;i<num;i++)
	{
		cin>>a[i];
	}
	MAx(a,num);
	MIn(a,num);
getch();
}

void MAx(int a[],int num)
{
	int mx;
	mx=a[0];
	for(int i=0;i<num;i++)
	{
		if(a[i]>mx)
		{
			mx=a[i];
		}
	}
	cout<<"MAXIMUM ELEMENT IN ARRAY IS : "<<mx;
}

void MIn(int a[],int num)
{
	int mn;
	mn=a[0];
	for(int i=0;i<num;i++)
	{
		if(mn>a[i])
		{
			mn=a[i];
		}
	}
	cout<<"\nMINIMUM ELEMENT IN ARRAY IS : "<< mn;
}