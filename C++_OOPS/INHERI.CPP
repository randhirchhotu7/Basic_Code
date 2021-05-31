#include<iostream.h>
#include<conio.h>
#include<string.h>
class Person
{
	protected:
	char name[20];
	char adr[20];
	int age;
	public:
	Person()
	{
		name[0]=0;
		adr[0]=0;
		age=0;
	}
	Person(char n[],char ad[],int a)
	{
		strcpy(name,n);
		strcpy(adr,ad);
		age=a;
	}
	void display()
	{
		cout<<"\nName: "<<name;
		cout<<"\nAdress: "<<adr;
		cout<<"\nAge: "<<age;
	}
};

class Student: public Person
{
	int roll;
	int marks;
	public:
	Student():Person()
	{
		roll=0;
		marks=0;
	}
	Student(int r,char n[],char ad[],int a,int m):Person(n,ad, a)
	{
		roll=r;
		marks=m;
	}
	void display()
	{
		cout<<"\nName: "<<name;
		cout<<"\nAdress: "<<adr;
		cout<<"\nAge"<<age;
		cout<<"\nroll: "<<roll;
		cout<<"\nMarks: "<<marks;
	}
};
void main()
{
	Student s(1,"amit","xyz",45,99);
	clrscr();
	s.display();
	getch();
}