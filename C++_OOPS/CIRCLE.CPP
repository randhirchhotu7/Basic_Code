#include<graphics.h>
#include<iostream.h>
#include<conio.h>
void main()
{
	 int gdriver = DETECT, gmode, errorcode;
	 int n,x=0,j;
	initgraph(&gdriver, &gdriver, "C:\\TURBOC3\\BGI");
	setcolor(2);
	for(int i=0;i<5;i++)
	{
	       setcolor(i);
	       cout<<"\nthrow dise: ";
	       cin>>n;
	       for(j=x;j<x+n;j++)
	       {
			clrscr();
			setcolor(j);
			circle(100+j,100+j,50+j);
			getch();

	       }
	       x+=n;
	 }
	getch();
	closegraph();
}
