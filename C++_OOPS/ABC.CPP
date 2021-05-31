#include<iostream.h>
void main()
{
	int a=5;
	int b=a++ + ++a + ++a + a++ + ++a;
	cout<<a<<b;
}
