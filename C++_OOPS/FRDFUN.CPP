// use of frindfunction

#include<iostream.h>
#include<conio.h>
class Complex
{
	int real;
	int img;

	public:
		void get()
		{
			cout<<"real: "; cin>>real;
			cout<<"img: ";cin>>img;
		}
		void display()
		{
			cout<<endl<<real<<" + "<<img<<"i";
		}
		friend Complex add(Complex,Complex);
};
Complex add(Complex x, Complex y)
{
	Complex c;
	c.real= x.real+y.real;
	c.img=x.img+ y.img;
	return c;
}
void main()
{
	Complex a,b,c;
	clrscr();
	a.get();
	b.get();
	c=add(a,b);
	a.display();
	b.display();
	c.display();
	getch();
}