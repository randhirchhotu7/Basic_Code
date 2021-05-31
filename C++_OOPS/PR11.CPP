//	calculating power

#include<iostream.h>
#include<conio.h>
long int Power(long int,long int);
void main()
{
       long int pwr,base,value;
	clrscr();
	cout<<"ENTER BASE AND THEIR POWER : ";
	cin>>base>>pwr;
	value=Power(base,pwr);
	cout<<"REQUIRED VALUE IS : "<< value;
getch();
}

long int Power(long int base,long int pwr)
{
	long int value=1;
	for(int i=1;i<=pwr;i++)
	{
		value=value*base;
	}
	return value;
}
