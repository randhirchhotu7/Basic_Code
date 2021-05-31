//   inheritage two

#include<iostream.h>
#include<conio.h>
class add
{
	protected:
	int a;
	public:
	add()
	{
		a=0;
	}
	add(int x)
	{
		a=x;
	}
};

class plus
{       protected:
	int b;
	public:
	plus()
	{
		b=0;
	}
	plus(int y )
	{
		b=y;
	}
};
class ADDition : public add,public plus
{
	int c;
	int total;
	public:

	ADDition():add(),plus()
	{
		c=0;
		total=0;
	}

	ADDition(int x, int y, int z):add(x),plus(y)
	{
		c=z;
	}

	void display()
	{
		cout<<"\nSUM OF NUMBERS : "<< total;
	}

	void Addnum()
	{
		total=a+b+c;
	}
};

void main()
{
	ADDition s(10,20,30);
	clrscr();
	s.Addnum();
	s.display();
	getch();
}