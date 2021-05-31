//   inheritage two

#include<iostream.h>
#include<conio.h>
#include<string.h>
class add
{
	protected:
	int a;
	public:
	void getA()
	{
		cout<<"ENTER 1ST NUMBRER : "; cin>>a;
	}
};

class plus
{       protected:
	int b;
	public:
	void getB()
	{
		cout<<"\nENTER 2ND NUMBER : ";cin>>b;
	}
};

class ADDition : public add, public plus
{
	int c;
	int total;
	public:
	ADDition()
	{
		c=0;
		total=0;
	}
	void getC() //:add(),plus()
	{
		cout<<"\nENTER 3RD NUMBER : ";cin>>c;
	}

	void Addnum() //:add(),plus()
	{
		total=a+b+c;
	}
	void display()
	{
		cout<<"TOTAL OF THREE NO. : "<< total;
	}
};

void main()
{
	ADDition s;
	clrscr();
	s.getA();
	s.getB();
	s.getC();
	s.Addnum();
	s.display();
	getch();
}