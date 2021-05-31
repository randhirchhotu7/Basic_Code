#include<iostream.h>
#include<conio.h>
#include<fstream.h>
#include<string.h>
void main()
{
	ofstream out("file1.txt");
	int roll;
	char name[30];
	clrscr();
	cout<<"\nDEnter roll and name:";
	cin>>roll>>name;

	out<<roll<<" "<<name;
	out.close();

	ifstream in("file1.txt");
	in>>roll>>name;

	cout<<"\nEntered roll and name is : "<<roll<<name;
	in.close();
	getch();
}